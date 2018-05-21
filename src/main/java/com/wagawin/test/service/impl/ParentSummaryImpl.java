package com.wagawin.test.service.impl;

import com.wagawin.test.controller.ChildController;
import com.wagawin.test.domain.enitity.ParentSummaryEntity;
import com.wagawin.test.domain.repository.api.ParentSummaryRepository;
import com.wagawin.test.dto.parentsummary.ParentSummaryDTO;
import com.wagawin.test.exception.BusinessException;
import com.wagawin.test.exception.specific.parentsummary.NoParentSummaryException;
import com.wagawin.test.service.api.ParentSummaryService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author parvizmakarti@gmail.com
 */
@Service
public class ParentSummaryImpl implements ParentSummaryService {
    private static final Logger logger = LoggerFactory.getLogger(ParentSummaryImpl.class.getName());

    private final ParentSummaryRepository parentSummaryRepository;

    public ParentSummaryImpl(ParentSummaryRepository parentSummaryRepository) {
        this.parentSummaryRepository = parentSummaryRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<ParentSummaryDTO> getParentSummary() {
        try {
            List<ParentSummaryEntity> entities = parentSummaryRepository.findAll();
            if (entities == null || entities.isEmpty()) {
                throw new NoParentSummaryException("Parent Summary is not calculated yet!");
            }
            List<ParentSummaryDTO> response = new ArrayList<>();
            entities.forEach(parent -> {
                response.add(ParentSummaryDTO.builder().amountOfChildren(parent.getAmountOfChildren())
                        .amountOfPersons(parent.getAmountOfPersons()).build());
            });
            return response;
        } catch (DataAccessException ex) {
            throw new BusinessException(ex.getMessage(), ex);
        }
    }

    /**
     * Calculate parent summary, delete all the existing data, re-save new
     * calculated data into database.
     */
    @Override
    @Transactional
    @Scheduled(initialDelay = 1, fixedDelay = 900000)
    public void calculateParentSummary() {
        try {
            logger.info("Job is running..."+new Date());
            List<Object[]> response = parentSummaryRepository.calculateParentsAndChildrenCount();
            parentSummaryRepository.deleteAllInBatch();
            List<ParentSummaryEntity> entities = response.stream().map(obj -> ParentSummaryEntity.builder().
                    amountOfPersons(Long.valueOf(obj[0].toString())).amountOfChildren(Long.valueOf(obj[1].toString())).build()).collect(Collectors.toList());
            parentSummaryRepository.save(entities);
        } catch (DataAccessException ex) {
            throw new BusinessException(ex.getMessage(), ex);
        }
    }

}

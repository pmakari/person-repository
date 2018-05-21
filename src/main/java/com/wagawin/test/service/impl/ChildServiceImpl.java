package com.wagawin.test.service.impl;

import com.wagawin.test.domain.enitity.ChildEntity;
import com.wagawin.test.domain.enitity.DaughterEntity;
import com.wagawin.test.domain.enitity.SonEntity;
import com.wagawin.test.domain.repository.api.ChildRepository;
import com.wagawin.test.dto.child.ChildInfoResponseDTO;
import com.wagawin.test.exception.BusinessException;
import com.wagawin.test.exception.specific.child.NoSuchChildException;
import com.wagawin.test.service.api.ChildService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author parvizmakarti@gmail.com
 */
@Service
public class ChildServiceImpl implements ChildService {

    private final ChildRepository childRepository;

    public ChildServiceImpl(ChildRepository childRepository) {
        this.childRepository = childRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public ChildInfoResponseDTO findParentWithFavouriteMeal(Long id) {
        try {
            List<ChildInfoResponseDTO> childList = childRepository.findParentWithFavouriteMeal(id, new PageRequest(0, 1));
            if (childList == null || childList.isEmpty()) {
                throw new NoSuchChildException("No such child found!");
            }
            return childList.get(0);
        } catch (DataAccessException ex) {
            throw new BusinessException(ex.getMessage(), ex);
        }
    }

    @Transactional(readOnly = true)
    @Override
    public String findChildColor(Long id) {
        ChildEntity entity = childRepository.findOne(id);
        if (entity == null) {
            throw new NoSuchChildException("No such child found!");
        }
        if (entity instanceof SonEntity) {
            return ((SonEntity) entity).getBiCycleColor();
        }
        return ((DaughterEntity) entity).getHairColor();
    }
}

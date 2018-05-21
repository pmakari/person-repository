package com.wagawin.test.service.impl;

import com.wagawin.test.domain.enitity.HouseEntity;
import com.wagawin.test.domain.enitity.PersonEntity;
import com.wagawin.test.domain.repository.api.PersonRepository;
import com.wagawin.test.dto.house.HouseResponseDTO;
import com.wagawin.test.dto.person.PersonDTO;
import com.wagawin.test.exception.BusinessException;
import com.wagawin.test.exception.specific.house.NoSuchHouseException;
import com.wagawin.test.exception.specific.person.NoSuchPersonException;
import com.wagawin.test.service.api.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author parvizmakarti@gmail.com
 */
@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public PersonDTO findById(Long id) {
        try {
            PersonEntity entity = personRepository.findOne(id);
            if (entity == null) {
                throw new NoSuchPersonException("Person not found!");
            }
            return PersonDTO.builder().age(entity.getAge()).name(entity.getName()).build();
        } catch (DataAccessException ex) {
            throw new BusinessException(ex.getMessage(), ex);
        }

    }

    @Transactional(readOnly = true)
    @Override
    public HouseResponseDTO findHousByPersonId(Long id) {
        try {
            PersonEntity person = personRepository.findOne(id);
            if (person == null) {
                throw new NoSuchPersonException("Person not found!");
            }
            HouseEntity house = person.getHouse();
            if (house == null) {
                throw new NoSuchHouseException("No House for the given person found!");
            }
            return HouseResponseDTO.builder().address(house.getAddress()).zipCode(house.getZipCode()).houseType(house.getHouseType().name()).build();
        } catch (DataAccessException ex) {
            throw new BusinessException(ex.getMessage(), ex);
        }
    }

}

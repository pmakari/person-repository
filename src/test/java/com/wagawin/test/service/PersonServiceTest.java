package com.wagawin.test.service;

import com.wagawin.test.BaseTest;
import com.wagawin.test.dto.house.HouseResponseDTO;
import com.wagawin.test.exception.specific.person.NoSuchPersonException;
import com.wagawin.test.service.api.PersonService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author parvizmakarti@gmail.com
 */
public class PersonServiceTest extends BaseTest {

    @Autowired
    private PersonService personService;

    @Test
    public void findHousByPersonId_existingPerson_succeed() {
        //arrange
        Long personId = 1L;

        //act
        HouseResponseDTO responseDTO = personService.findHousByPersonId(personId);

        //asserts
        Assert.assertNotNull(responseDTO);
        Assert.assertNotNull(responseDTO.getAddress());
    }

    @Test(expected = NoSuchPersonException.class)
    public void findHousByPersonId_nonExistingPerson_throwNoSuchPersonException() {
        //arrange
        Long personId = Long.MAX_VALUE;

        //act
        personService.findHousByPersonId(personId);
    }

}

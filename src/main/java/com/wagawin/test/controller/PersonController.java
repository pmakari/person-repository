package com.wagawin.test.controller;

import com.wagawin.test.dto.house.HouseResponseDTO;
import com.wagawin.test.service.api.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author parvizmakarti@gmail.com
 */
@RestController
@RequestMapping("/api/person")
public class PersonController {

    private static final Logger logger = LoggerFactory.getLogger(PersonController.class.getName());

    private final PersonService personService;
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/house/{id}")
    public HouseResponseDTO findHouseByPerson(@PathVariable("id") Long id) {
        logger.info("person's id for house details is : {0}", id);
        return personService.findHousByPersonId(id);
    }

}

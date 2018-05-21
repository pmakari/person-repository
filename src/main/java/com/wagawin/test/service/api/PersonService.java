package com.wagawin.test.service.api;

import com.wagawin.test.dto.house.HouseResponseDTO;
import com.wagawin.test.dto.person.PersonDTO;

/**
 *
 * @author parvizmakarti@gmail.com
 */
public interface PersonService {

    PersonDTO findById(Long id);

    HouseResponseDTO findHousByPersonId(Long id);
}

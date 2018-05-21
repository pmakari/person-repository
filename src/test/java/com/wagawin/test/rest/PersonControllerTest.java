package com.wagawin.test.rest;

import com.wagawin.test.BaseTest;
import org.junit.Test;
import org.springframework.http.MediaType;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 *
 * @author parvizmakarti@gmail.com
 */
public class PersonControllerTest extends BaseTest {

    @Test
    public void findHouseByPerson_existingPerson_ok() throws Exception {
        //arrange
        Long personId = 1L;

        //act and asserts
        mvc.perform(get("/api/person/house/{id}", personId)
                .contentType(MediaType.TEXT_PLAIN)
                .accept(MediaType.APPLICATION_JSON)
        ).andExpect(status().isOk()).andReturn();

    }

    @Test
    public void findHouseByPerson_nonExistingPerson_notFound() throws Exception {
        //arrange
        Long personId = Long.MAX_VALUE;

        //act and asserts
        mvc.perform(get("/api/person/house/{id}", personId)
                .contentType(MediaType.TEXT_PLAIN)
                .accept(MediaType.APPLICATION_JSON)
        ).andExpect(status().isNotFound()).andReturn();

    }

}

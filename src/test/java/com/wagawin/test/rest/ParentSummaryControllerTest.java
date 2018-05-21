package com.wagawin.test.rest;

import com.wagawin.test.BaseTest;
import org.springframework.http.MediaType;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 *
 * @author parvizmakarti@gmail.com
 */
public class ParentSummaryControllerTest extends BaseTest {

//    @Test
    public void calculateAndGetParentSummary_ok() throws Exception {

        //act and asserts
        mvc.perform(get("/api/persons/children")
                .contentType(MediaType.TEXT_PLAIN)
                .accept(MediaType.APPLICATION_JSON)
        ).andExpect(status().isOk()).andReturn();

    }

}

package com.wagawin.test.rest;

import com.wagawin.test.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.MediaType;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 *
 * @author parvizmakarti@gmail.com
 */
public class ChildControllerTest extends BaseTest {

    @Test
    public void findChildInfo_existingChild_ok() throws Exception {
        //arrange
        Long childId = 1L;

        //act and asserts
        mvc.perform(get("/api/child/info/{id}", childId)
                .contentType(MediaType.TEXT_PLAIN)
                .accept(MediaType.APPLICATION_JSON)
        ).andExpect(status().isOk()).andReturn();

    }

    @Test
    public void findChildInfo_nonExistingChild_notFound() throws Exception {
        //arrange
        Long childId = Long.MAX_VALUE;

        //act and asserts
        mvc.perform(get("/api/child/info/{id}", childId)
                .contentType(MediaType.TEXT_PLAIN)
                .accept(MediaType.APPLICATION_JSON)
        ).andExpect(status().isNotFound()).andReturn();

    }

    @Test
    public void findChildColor_FEMALE_ok() throws Exception {
        //arrange
        Long childId = 4L;
        String expectedHairColor = "blond";

        //act and asserts
        String color = mvc.perform(get("/api/child/color/{id}", childId)
                .contentType(MediaType.TEXT_PLAIN)
                .accept(MediaType.APPLICATION_JSON)
        ).andExpect(status().isOk()).andReturn().getResponse().getContentAsString();
        //asserts
        Assert.assertEquals(expectedHairColor, color);

    }

    @Test
    public void findChildColor_MALE_ok() throws Exception {
        //arrange
        Long childId = 2L;
        String expectedHairColor = "WHITE";

        //act and asserts
        String color = mvc.perform(get("/api/child/color/{id}", childId)
                .contentType(MediaType.TEXT_PLAIN)
                .accept(MediaType.APPLICATION_JSON)
        ).andExpect(status().isOk()).andReturn().getResponse().getContentAsString();
        //asserts
        Assert.assertEquals(expectedHairColor, color);

    }

}

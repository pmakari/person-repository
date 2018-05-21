package com.wagawin.test.service;

import com.wagawin.test.BaseTest;
import com.wagawin.test.dto.child.ChildInfoResponseDTO;
import com.wagawin.test.service.api.ChildService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author parvizmakarti@gmail.com
 */
public class ChildServiceTest extends BaseTest {

    @Autowired
    private ChildService childService;

    @Test
    public void findParentWithFavouriteMeal_existingChild_haveResult() {
        //arrange
        Long childId = 1L;
        String expectedFavouriteMeal = "Kebap";

        //act
        ChildInfoResponseDTO responseDTO = childService.findParentWithFavouriteMeal(childId);

        //asserts
        Assert.assertNotNull(responseDTO);
        Assert.assertNotNull(responseDTO.getFavouriteMeal());
        Assert.assertEquals(expectedFavouriteMeal, responseDTO.getFavouriteMeal().getName());
    }

    @Test
    public void findChildColor_FEMALE_returnHairColor() {
        //arrange
        Long childId = 4L;
        String expectedHairColor = "blond";

        //act
        String color = childService.findChildColor(childId);

        //asserts
        Assert.assertEquals(expectedHairColor, color);

    }

    @Test
    public void findChildColor_MALE_returnHairColor() {
        //arrange
        Long childId = 2L;
        String expectedBicycleColor = "WHITE";

        //act
        String color = childService.findChildColor(childId);

        //asserts
        Assert.assertEquals(expectedBicycleColor, color);

    }
}

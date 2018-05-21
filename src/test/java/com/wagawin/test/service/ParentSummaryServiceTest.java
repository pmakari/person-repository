package com.wagawin.test.service;

import com.wagawin.test.BaseTest;
import com.wagawin.test.dto.parentsummary.ParentSummaryDTO;
import com.wagawin.test.service.api.ParentSummaryService;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author parvizmakarti@gmail.com
 */
public class ParentSummaryServiceTest extends BaseTest {

    @Autowired
    private ParentSummaryService parentSummaryService;

    @Test
    public void calculateAndGetParentSummary_succeed() {
        //arrange
        int expectedResultSize = 2;

        //act
        parentSummaryService.calculateParentSummary();
        List<ParentSummaryDTO> summaryDTOs = parentSummaryService.getParentSummary();

        //asserts
        Assert.assertNotNull(summaryDTOs);
        Assert.assertEquals(expectedResultSize, summaryDTOs.size());
    }

}

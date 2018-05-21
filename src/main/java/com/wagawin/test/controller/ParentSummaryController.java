package com.wagawin.test.controller;

import com.wagawin.test.dto.parentsummary.ParentSummaryDTO;
import com.wagawin.test.service.api.ParentSummaryService;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author parvizmakarti@gmail.com
 */
@RestController
public class ParentSummaryController {

    private final ParentSummaryService parentSummaryService;
    public ParentSummaryController(ParentSummaryService parentSummaryService) {
        this.parentSummaryService = parentSummaryService;
    }


    @GetMapping("/api/persons/children")
    public List<ParentSummaryDTO> findParentSummary() {
        return parentSummaryService.getParentSummary();
    }
}

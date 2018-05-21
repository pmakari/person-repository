package com.wagawin.test.controller;

import com.wagawin.test.dto.child.ChildInfoResponseDTO;
import com.wagawin.test.service.api.ChildService;
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
@RequestMapping("/api/child")
public class ChildController {

    private static final Logger logger = LoggerFactory.getLogger(ChildController.class.getName());

    private final ChildService childService;
    //so as of 4.3 version no longer need @autowired for a single constructor scenario
    public ChildController(ChildService childService) {
        this.childService = childService;
    }


    @GetMapping("/info/{id}")
    public ChildInfoResponseDTO findChildInfo(@PathVariable("id") Long id) {
        logger.info("child's id for house details is : {0}", id);
        return childService.findParentWithFavouriteMeal(id);
    }

    @GetMapping("/color/{id}")
    public String childCplor(@PathVariable("id") Long id) {
        logger.info("child's id for color is : {0}", id);
        return childService.findChildColor(id);
    }
}

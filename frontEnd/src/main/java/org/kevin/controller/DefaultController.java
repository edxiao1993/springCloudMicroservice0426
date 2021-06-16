package org.kevin.controller;

import org.kevin.service.GateWayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kevin.Z
 * @version 2021/6/11
 */
@RestController
public class DefaultController {

    @Autowired
    private GateWayService gateWayService;

    @GetMapping("hw")
    public String defaultRestMethod() {
        return "hello" + gateWayService.nameAndAge();
    }
}

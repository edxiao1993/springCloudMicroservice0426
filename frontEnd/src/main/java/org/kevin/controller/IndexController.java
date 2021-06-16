package org.kevin.controller;

import org.kevin.service.TestProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Kevin.Z
 * @version 2021/6/11
 */
@Controller
public class IndexController {

    @Autowired
    private TestProjectService testProjectService;

    @GetMapping("/index")
    public String index(ModelMap modelMap){
        System.out.println(testProjectService.index());
        modelMap.addAttribute("fromTP", testProjectService.index());
        return "index";
    }
}

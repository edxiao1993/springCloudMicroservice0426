package org.kevin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kevin.Z
 * @version 2021/3/19
 */
@RestController
public class RstController {


    @GetMapping("rstMsg")
    public String firstMsg(){
        return "hello world";
    }

}

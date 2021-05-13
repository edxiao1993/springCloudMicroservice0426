package org.kevin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kevin.Z
 * @version 2021/5/13
 */
@RestController
public class DefaultController {

    @GetMapping({"/index", "/"})
    public String index() {
        return "hello world~";
    }
}

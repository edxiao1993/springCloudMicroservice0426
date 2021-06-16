package org.kevin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * @author Kevin.Z
 * @version 2021/5/13
 */
@RestController
public class DefaultController {

    @GetMapping({"/index", "/"})
    public String index() {
        return "hello world~ DAMN IT!";
    }

    @GetMapping("/name/age")
    public String secondMethod(){
        return "my name is Kevin, and the age would be 28!";
    }

    @PostMapping(value = "postDt")
    public String postData(HttpServletRequest request){
        Enumeration<String> es = request.getParameterNames();
        return "hello " ;
    }
}

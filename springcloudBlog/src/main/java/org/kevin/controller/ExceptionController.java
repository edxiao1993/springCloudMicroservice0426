package org.kevin.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Kevin.Z
 * @version 2021/4/8
 */
@ControllerAdvice
public class ExceptionController {

//    @ExceptionHandler(NonLoginException.class)
//    public ModelAndView nonLoginException(NonLoginException e){
//        ModelAndView mav = new ModelAndView();
//        mav.addObject("errorMsg", e.getMessage());
//        mav.setViewName("indexIndexProject");
//        return mav;
//    }
}

package org.kevin.controller;

import org.kevin.bean.ParamsBean;
import org.kevin.service.TestProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kevin.Z
 * @version 2021/6/2
 */
@RestController
public class DefaultController {

    @Autowired
    private TestProjectService testProjectService;

    @RequestMapping("/indexOpenFeign")
    public String index(){
        return testProjectService.sendIndex();
    }

    @PostMapping("/pst")
    public String postData(){
        ParamsBean pb = new ParamsBean();
        pb.setName("Kevin Zeng");
        pb.setAge(28);
        pb.setGender(Boolean.TRUE);
        return testProjectService.postDt(pb);
    }
}

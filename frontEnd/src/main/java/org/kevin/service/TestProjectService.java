package org.kevin.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Kevin.Z
 * @version 2021/6/11
 */
@FeignClient(value = "testproject")
public interface TestProjectService {

    @RequestMapping(method = RequestMethod.GET, value="index")
    public String index();

}

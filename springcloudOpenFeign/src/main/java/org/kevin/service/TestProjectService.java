package org.kevin.service;

import feign.Param;
import org.kevin.bean.ParamsBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Kevin.Z
 * @version 2021/6/2
 */
@FeignClient(value = "testproject")
public interface TestProjectService {

    @RequestMapping(method = RequestMethod.GET, value = "/index")
    public String sendIndex();

    @RequestMapping(method = RequestMethod.POST, value = "/postDt", consumes = "application/json")
    public String postDt(@SpringQueryMap ParamsBean paramsBean);
}

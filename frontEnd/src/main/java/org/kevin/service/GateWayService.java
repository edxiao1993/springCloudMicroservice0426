package org.kevin.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Kevin.Z
 * @version 2021/6/11
 */
@FeignClient(name="viaGateway", url = "http://localhost:8071/tp")
public interface GateWayService {

    @GetMapping("/name/age")
    public String nameAndAge();
}

package org.kevin.service;

import org.kevin.dto.ParameterParser;
import org.kevin.model.SecretMoment;
import org.kevin.model.dto.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * @author Kevin.Z
 * @version 2021/6/22
 */
@FeignClient(name = "secretMomentService", url = "http://localhost:8071/dataservice")
public interface SecretMomentService {

    @GetMapping(value = "/secretMoment/selectSecretMoment")
    public List<SecretMoment> selectSecretMoment(@RequestParam Map<String, Object> parameterParser);

    @GetMapping(value = "/secretMoment/countSecretMoment")
    public ResultData<Long> countSecretMoment(@RequestParam("moment") String moment);

    @PostMapping(value = "/secretMoment/saveSecretMoment")
    public ResultData<Integer> saveSecretMoment(@RequestParam("content") String content);
}

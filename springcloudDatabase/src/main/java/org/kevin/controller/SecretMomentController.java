package org.kevin.controller;

import org.kevin.model.SecretMoment;
import org.kevin.model.dto.ResultData;
import org.kevin.service.SecretMomentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Kevin.Z
 * @version 2021/6/23
 */
@RestController
@RequestMapping("/secretMoment")
public class SecretMomentController {
    @Autowired
    private SecretMomentService secretMomentService;

    @RequestMapping("/selectSecretMoment")
    public List<SecretMoment> selectSecretMoment(
            @RequestParam(value = "pageNum", required = false) Integer pageNum,
            @RequestParam(value = "pageSize", required = false) Integer pageSize,
            @RequestParam(value = "moment", required = false) String moment) {
        return secretMomentService.findList(moment, pageNum, pageSize);
    }

    @RequestMapping("/countSecretMoment")
    public ResultData<Long> countSecretMoment(
            @RequestParam(value = "moment", required = false) String moment) {
        ResultData<Long> resultData = new ResultData<>();
        resultData.setData(secretMomentService.count(moment));
        return resultData;
    }

    @RequestMapping("/saveSecretMoment")
    public ResultData<Integer> saveSecretMoment(@RequestParam(value = "content", required = false) String content){
        ResultData<Integer> resultData = new ResultData<>();
        if(StringUtils.hasLength(content)){
            resultData.setData(secretMomentService.insertNewRecord(content));
        }
        return resultData;
    }
}

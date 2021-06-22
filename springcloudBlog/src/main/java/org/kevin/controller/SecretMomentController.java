package org.kevin.controller;

import org.kevin.dto.ParameterParser;
import org.kevin.model.SecretMoment;
import org.kevin.model.dto.PageModel;
import org.kevin.service.SecretMomentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Kevin.Z
 * @version 2021/6/22
 */
@Controller
public class SecretMomentController {
    @Autowired
    private SecretMomentService secretMomentService;

    @GetMapping("/secretMoment")
    public String secretMoment(@RequestParam(value = "pageNum", required = false) Integer pageNum,
                               @RequestParam(value = "pageSize", required = false) Integer pageSize,
                               @RequestParam(value = "moment", required = false) String moment,
                               ModelMap modelMap){
        ParameterParser pp = new ParameterParser(pageNum, pageSize);
        pp.setMoment(moment);
        Map<String, Object> params = new HashMap<>();
        params.put("pageNum", pageNum);
        params.put("pageSize", pageSize);

        List<SecretMoment> secretMoments = secretMomentService.selectSecretMoment(params);
        long count = secretMomentService.countSecretMoment(moment).getData();

        PageModel pageModel = new PageModel(pageNum, pageSize, count);
        modelMap.addAttribute("pageModel", pageModel);
        modelMap.addAttribute("secretMoments", secretMoments);

        return "secretMoment";
    }

    @PostMapping("/saveSecretMoment")
    @ResponseBody
    public Integer save(@RequestParam("content") String content){
        return secretMomentService.saveSecretMoment(content).getData();
    }
}

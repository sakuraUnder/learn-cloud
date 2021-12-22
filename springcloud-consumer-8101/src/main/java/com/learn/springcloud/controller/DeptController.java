package com.learn.springcloud.controller;

import com.learn.springcloud.pojo.Dept;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * 部门controller
 *
 * @author jyj
 * @date 2021年12月21日 11:02
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

    public static final String REQ_HEARD = "http://localhost:8001/dept";
    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/add")
    public int insert(@RequestBody Dept data) {
        String reqUrl = REQ_HEARD + "/add";
        return restTemplate.postForObject(reqUrl, data, int.class);
    }

    @GetMapping("/getOne/{id}")
    public Dept selectByPrimaryKey(@PathVariable("id") Long id) {
        String reqUrl = REQ_HEARD + "/getOne/" + id;
        return restTemplate.getForObject(reqUrl, Dept.class);
    }

    @GetMapping("/list")
    public List list() {
        String reqUrl = REQ_HEARD + "/list";
        return restTemplate.getForObject(reqUrl, List.class);
    }
}

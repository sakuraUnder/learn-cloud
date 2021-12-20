package com.learn.springcloud.controller;

import com.learn.springcloud.pojo.Dept;
import com.learn.springcloud.service.DeptService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 部门接口
 *
 * @author jyj
 * @date 2021年12月20日 15:32
 */
@RestController
@RequestMapping("/dept")
public class DeptController {
    @Resource
    private DeptService deptService;

    @PostMapping("/add")
    public int insert(@RequestBody Dept data) {
        return deptService.insert(data);
    }

    @GetMapping("/getOne")
    public Dept selectByPrimaryKey(@PathVariable("id") Long id) {
        return deptService.selectByPrimaryKey(id);
    }

    @GetMapping("/list")
    public List<Dept> list() {
        return deptService.list();
    }
}

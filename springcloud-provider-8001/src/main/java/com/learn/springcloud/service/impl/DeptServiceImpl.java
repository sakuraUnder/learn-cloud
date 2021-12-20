package com.learn.springcloud.service.impl;

import com.learn.springcloud.mapper.DeptMapper;
import com.learn.springcloud.pojo.Dept;
import com.learn.springcloud.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author jyj
 * @date 2021年12月20日 15:28
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Resource
    private DeptMapper deptMapper;

    @Override
    public int insert(Dept data) {
        return deptMapper.insert(data);
    }

    @Override
    public Dept selectByPrimaryKey(Long id) {
        return deptMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Dept> list() {
        return deptMapper.list();
    }
}

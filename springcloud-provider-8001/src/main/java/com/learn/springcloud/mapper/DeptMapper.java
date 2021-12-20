package com.learn.springcloud.mapper;

import com.learn.springcloud.pojo.Dept;

import java.util.List;


/**
 * ${description}
 *
 * @author jyj
 * @date 2021年12月20日 15:03
 */
public interface DeptMapper {

    int insert(Dept record);

    Dept selectByPrimaryKey(Long id);

    List<Dept> list();
}
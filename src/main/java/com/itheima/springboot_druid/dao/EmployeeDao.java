package com.itheima.springboot_druid.dao;

import com.itheima.springboot_mybatis.domain.Employees;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface EmployeeDao {


//    需要创建一个对象将数据转换为一个对象，然后再读取出来
    @Select("SELECT * FROM `reggie`.`employee` where id = #{id}")
    public Employees getByid(Integer id);
}

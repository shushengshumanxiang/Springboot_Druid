package com.itheima.springboot_druid;

import com.itheima.springboot_druid.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootDruidApplicationTests {


    @Autowired
    private EmployeeDao employeeDao;
    @Test
    void contextLoads() {

        System.out.println(employeeDao.getByid(1));
    }

}

package com.example.mybatis_test;

import com.example.mybatis_test.dao.BrandMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
//@MapperScan("com.example.mybatis_test.dao")
class MybatisTestApplicationTests {
    @Autowired
    BrandMapper mapper;

    @Test
    void contextLoads() {
        int[] ids = new int[]{1,2,3};
    //    System.out.println(mapper.selectById(1));
        System.out.println(mapper.selectByIds(ids));

    }

}

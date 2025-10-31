package com.example.mybatis_test.dao;

import com.example.mybatis_test.entity.Brand;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface BrandMapper {

   // @Select("select * from tb_brand where id = #{id}")
    Brand selectById(int id);

    List<Brand> selectByIds(@Param("ids") int[] ids);
}

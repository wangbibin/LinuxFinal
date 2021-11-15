package com.wbb.hello.mapper;

import com.wbb.hello.pojo.Hello;
import com.wbb.hello.pojo.HelloExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HelloMapper {
    long countByExample(HelloExample example);

    int deleteByExample(HelloExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Hello record);

    int insertSelective(Hello record);

    List<Hello> selectByExample(HelloExample example);

    Hello selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Hello record, @Param("example") HelloExample example);

    int updateByExample(@Param("record") Hello record, @Param("example") HelloExample example);

    int updateByPrimaryKeySelective(Hello record);

    int updateByPrimaryKey(Hello record);
}
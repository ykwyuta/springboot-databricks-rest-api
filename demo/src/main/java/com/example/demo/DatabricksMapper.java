package com.example.demo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DatabricksMapper {
    @Select("SELECT name FROM default.testdata LIMIT 1")
    public String getName();
}

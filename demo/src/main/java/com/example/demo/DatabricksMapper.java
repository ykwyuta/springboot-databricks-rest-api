package com.example.demo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DatabricksMapper {
    @Select("SELECT id, name, object_id, principal_id, schema_id, parent_object_id, type, type_desc, is_ms_shipped, is_published, is_schema_published FROM default.testdata WHERE id = #{id}")
    @ResultType(value = TestData.class)
    public TestData getTestDataById(@Param("id") Integer id);

    @Select("SELECT id, name, object_id, principal_id, schema_id, parent_object_id, type, type_desc, is_ms_shipped, is_published, is_schema_published FROM default.testdata WHERE name = #{name}")
    @ResultType(value = TestData.class)
    public TestData getTestDataByName(@Param("name") String name);
}

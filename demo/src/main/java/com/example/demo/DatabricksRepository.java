package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DatabricksRepository {
    @Autowired
    private DatabricksMapper databricksMapper;

    public TestData getTestDataById(Integer id) {
        return this.databricksMapper.getTestDataById(id);
    }

    public TestData getTestDataByName(String name) {
        return this.databricksMapper.getTestDataByName(name);
    }
}

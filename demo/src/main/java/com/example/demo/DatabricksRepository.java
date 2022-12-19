package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DatabricksRepository {
    @Autowired
    private DatabricksMapper databricksMapper;

    public String getName() {
        return this.databricksMapper.getName();
    }
}

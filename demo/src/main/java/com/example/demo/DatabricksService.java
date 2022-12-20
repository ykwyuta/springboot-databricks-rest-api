package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatabricksService {
    @Autowired
    private DatabricksRepository databricksRepository;

    public TestData getTestDataById(Integer id) {
        return this.databricksRepository.getTestDataById(id);
    }

    public TestData getTestDataByName(String name) {
        return this.databricksRepository.getTestDataByName(name);
    }

}

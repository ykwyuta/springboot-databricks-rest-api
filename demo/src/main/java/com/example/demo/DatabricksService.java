package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatabricksService {
    @Autowired
    private DatabricksRepository databricksRepository;

    public String getName() {
        return this.databricksRepository.getName();
    }
}

package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private DatabricksService databricksService;

	@GetMapping("/")
	public ResponseEntity<String> index() {
		return ResponseEntity.ok(databricksService.getName());
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String url = System.getenv("DATABRICKS_JDBC");
		Connection connection = DriverManager.getConnection(url);
		ResultSet resultSet = connection.prepareStatement("SELECT name FROM default.testdata LIMIT 1").executeQuery();
		while (resultSet.next()) {
			log.info(resultSet.getString(0));
		}
	}
}

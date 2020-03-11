package com.example.demo;

import com.example.demo.Load;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class  DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/buy")
	public ResponseEntity<?> buy(){
		System.out.println("Purchasing");
		return ResponseEntity.status(HttpStatus.OK).body("Purchased");
	}

	@GetMapping("/flood")
	public ResponseEntity<?> load(){
		System.out.println("Quering load");
		Load load = new Load();

		return ResponseEntity.status(HttpStatus.OK).body("Load Generated");
	}

}

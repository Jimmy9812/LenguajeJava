package com.example.lenguajejava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LenguajeJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LenguajeJavaApplication.class, args);
	}

	@GetMapping("/")
	public String saludo() {
		return "¡Hello world!";
	}
}

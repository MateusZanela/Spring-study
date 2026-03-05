package io.github.MateusZanela.springstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringstudyApplication {

	@GetMapping("/hello-world")
	public String helloWorld(){
		return "Hello World. Spring boot application running";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringstudyApplication.class, args);
	}

}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController: endpoint임을 spring에 알려준다
 */
@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	/**
	 * 
	 * @GetMapping("/hello"): hello로 requesttl hello() 메소드 실행
	 * @RequestParam: request parameter
	 * 
	 * @param name: name 입력 받은 경우 "Hello" + name으로 출력
	 * ex) localhost:8080/hello?name=Jamie	-> "Hello Jamie" 출력
	 *     localhost:8080/hello				-> "Hello World" 출력 (default)
	 * @return
	 */
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s", name);
	}
}

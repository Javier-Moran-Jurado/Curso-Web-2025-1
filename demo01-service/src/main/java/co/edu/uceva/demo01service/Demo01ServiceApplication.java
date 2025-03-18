package co.edu.uceva.demo01service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo01ServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(Demo01ServiceApplication.class, args);
		System.out.println("hello word");
	}
}
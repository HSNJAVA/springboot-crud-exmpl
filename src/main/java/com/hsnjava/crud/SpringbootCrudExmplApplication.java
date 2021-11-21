package com.hsnjava.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories("com.hsnjava.crud.repository")
//@ComponentScan(basePackages = { "com.hsnjava.crud.repository.*" })
@ComponentScan(basePackages = { "com.hsnjava.crud.*" })
//@EntityScan("com.hsnjava.crud.entities")  
public class SpringbootCrudExmplApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCrudExmplApplication.class, args);
	}

}

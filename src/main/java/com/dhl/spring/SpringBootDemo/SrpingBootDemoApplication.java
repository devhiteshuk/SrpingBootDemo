package com.dhl.spring.SpringBootDemo;

import com.dhl.spring.SpringBootDemo.entity.LocalUser;
import com.dhl.spring.SpringBootDemo.repository.LocalUserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.dhl.spring.SpringBootDemo.repository")
//@EntityScan(basePackages = "com.dhl.spring.SpringBootDemo.model")
public class SrpingBootDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SrpingBootDemoApplication.class, args);
	}

	/*@Bean
	CommandLineRunner runner(LocalUserRepository repo) {
		return args -> {
			repo.save(new LocalUser(1,"hitesh", "Hitesh dhamsahniya"));
			repo.save(new LocalUser(2, "harshiv", "master harshiv "));
		};
	}*/

}

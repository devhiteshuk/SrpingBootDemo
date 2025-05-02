package com.dhl.spring.SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@EnableScheduling // This will use for HelloPrinter function to execute not work with this annotation
@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.dhl.spring.SpringBootDemo.repository")
//@EntityScan(basePackages = "com.dhl.spring.SpringBootDemo.model")
public class SrpingBootDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SrpingBootDemoApplication.class, args);
	}

	@Component
	class HelloPrinter {
		@Scheduled(fixedRate = 5000)
		public void printHello() {
			System.out.println("Hello at " + LocalDateTime.now());
		}
	}

	/*@Bean
	CommandLineRunner runner(LocalUserRepository repo) {
		return args -> {
			repo.save(new LocalUser(1,"hitesh", "Hitesh dhamsahniya"));
			repo.save(new LocalUser(2, "harshiv", "master harshiv "));
		};
	}*/

}

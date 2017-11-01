package co.com.aero_solve.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "co.com.aero_solve.*")
@EntityScan(basePackages = { "co.com.aero_solve.entity" })
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}

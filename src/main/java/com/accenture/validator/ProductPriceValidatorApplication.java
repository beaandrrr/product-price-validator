package com.accenture.validator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.accenture.validator")
public class ProductPriceValidatorApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ProductPriceValidatorApplication.class, args);
	}

}

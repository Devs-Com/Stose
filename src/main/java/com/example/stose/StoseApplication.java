package com.example.stose;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import com.example.stose.entity.Libro;
import com.example.stose.repositories.LibroRepositorie;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class StoseApplication extends SpringBootServletInitializer implements CommandLineRunner {
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(StoseApplication.class);
		}
	
	public static void main(String[] args) {
		SpringApplication.run(StoseApplication.class, args);
	}

	@Autowired
	private LibroRepositorie repositorio;
	
	@Override
	public void run(String... args) throws Exception {
	 

	}

	@Bean
	  public Docket blogApi() {
	    return new Docket(DocumentationType.SWAGGER_2)
	        .select()
	          .apis(RequestHandlerSelectors.any())
	          .paths(PathSelectors.any())
	          .build();
	}

}

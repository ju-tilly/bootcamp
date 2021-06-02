package com.project.bootcamp;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BootcampApplication {

	public static void main(String[] args) {

		SpringApplication.run(BootcampApplication.class, args);
	}

	@Bean //é uma configuração que é necessária para subir a aplicação, vem da pom.xml, <springdoc-openapi-ui>
	public OpenAPI customOpenAPI(@Value("${application.description}")String description){ //customização da documentação
		return	new OpenAPI().info(new Info()
		.title(description)
		.version("2.0")
		.termsOfService("http://swagger.io/terms")
		.license(new License().name("Apache 2.0").url("http://springdoc.org")));
	}

}

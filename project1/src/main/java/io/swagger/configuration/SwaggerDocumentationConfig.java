package io.swagger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-12-01T09:17:33.513Z[GMT]")
@Configuration
public class SwaggerDocumentationConfig {

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.OAS_30)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("io.swagger.api"))
                    .build()
                .directModelSubstitute(org.threeten.bp.LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(org.threeten.bp.OffsetDateTime.class, java.util.Date.class)
                .apiInfo(apiInfo());
    }

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("Skill-Matrix API")
            .description("Contract API For The Skill-Matrix Application. This API contains all the neccessary endpoints for CRUD operations based on project requirements. In a nutshell, the application for which this API was created, contains all the active employees currently working for SoftwareONE. The purpose of this application is to aggregate all employees in one place so that any manager can access and contact any employee based on skills and other criterias.")
            .license("SoftwareONE")
            .licenseUrl("http://www.softwareone.com")
            .termsOfServiceUrl("")
            .version("1.0.0")
            .contact(new Contact("","", "zourab.lavrentiadis@softwareone.com"))
            .build();
    }

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
            .info(new Info()
                .title("Skill-Matrix API")
                .description("Contract API For The Skill-Matrix Application. This API contains all the neccessary endpoints for CRUD operations based on project requirements. In a nutshell, the application for which this API was created, contains all the active employees currently working for SoftwareONE. The purpose of this application is to aggregate all employees in one place so that any manager can access and contact any employee based on skills and other criterias.")
                .termsOfService("")
                .version("1.0.0")
                .license(new License()
                    .name("SoftwareONE")
                    .url("http://www.softwareone.com"))
                .contact(new io.swagger.v3.oas.models.info.Contact()
                    .email("zourab.lavrentiadis@softwareone.com")));
    }

}

package edu.hubu.learn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * @moduleName Swagger2Config
 * @description Swagger 配置类
 *
 * @author 杨睿
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
  @Bean
  public Docket createRestApi() {
    ParameterBuilder ticketPar = new ParameterBuilder();
    List<Parameter> parameters = new ArrayList<>();
    ticketPar.name("Authorization").description("Bearer token")
        .modelRef(new ModelRef("string")).parameterType("header")
        .required(false).build();
    parameters.add(ticketPar.build());
    return new Docket(DocumentationType.SWAGGER_2)
        .apiInfo(apiInfo())
        .select()
        .apis(RequestHandlerSelectors.basePackage("edu.hubu.learn.web.controller"))
        .paths(PathSelectors.any())
        .build()
        .globalOperationParameters(parameters);
  }

  private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
        .title("Spring Boot Swagger2 RESTful APIs")
        .termsOfServiceUrl("http://swagger.io/")
        .version("1.0")
        .build();
  }
}

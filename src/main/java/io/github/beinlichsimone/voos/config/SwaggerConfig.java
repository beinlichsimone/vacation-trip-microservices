package io.github.beinlichsimone.voos.config;

import com.fasterxml.classmate.TypeResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@EnableSwagger2
public class SwaggerConfig {

/*    @Bean
    public Docket api(TypeResolver typeResolver) {
        return new Docket(DocumentationType.SWAGGER_2).
                select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }*/

}
/*
public class SwaggerConfigurations {

    @Bean
    public Docket VacationTrip(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("io.github.beinlichsimone.vacationtrip"))
                .paths(PathSelectors.ant("/**"))
                .build()
                .ignoredParameterTypes(User.class) //ignorar todos os dados da classe usuário

                .globalOperationParameters(Arrays.asList(
                        new ParameterBuilder()
                                .name("Authorization")
                                .description("Header para token JWT")
                                .modelRef(new ModelRef("string"))
                                .parameterType("header")
                                .required(false)
                                .build()
                                .apiInfo(apiInfo()));
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("Sistema de Gestão de Viagem de Férias")
                .description("API do Vacation Trip")
                .version("1.0")
                .contact(contact())
                .build();
    }

    private Contact contact(){
        return new Contact("Simone Beinlich"
                , "https://github.com/beinlichsimone"
                , "simone__b@hotmail.com");
    }
}*/

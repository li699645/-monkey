package org.example.practice2.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Knife4jconfigruation {
    @Bean
    public OpenAPI openAPI(){
        return new OpenAPI().info(
                new Info().description("第一个接口").title("接口")
        );
    }
    @Bean
    public GroupedOpenApi groupApi(){
        return GroupedOpenApi.builder().group("类型控制").pathsToMatch("/type/**").build();
    }
}

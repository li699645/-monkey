package org.example.practice1.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Knife4jConfig {
    @Bean
    public OpenAPI api(){
        return new OpenAPI().info(
                new Info().title("practice").description("get.post.delete.mymapper"));
    }

    @Bean
    public GroupedOpenApi groupApi(){
        return GroupedOpenApi.builder().pathsToMatch("/wuhu/**").group("testwuhu").build();
    }
}


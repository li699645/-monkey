package practice3.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Knife4jConfigruation {
    @Bean
    public OpenAPI api(){
        return new OpenAPI().info(
                new Info().title("照片传输")
                        .description("传输照片")
        );
    }
    @Bean
    public GroupedOpenApi groupApi(){
        return GroupedOpenApi.builder().group("transfer").pathsToMatch("/picture/**").build();
    }
}

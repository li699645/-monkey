package practice3.minio;

import io.minio.MinioClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MinioProperties.class)
public class MinioConfigruation {
    @Autowired
    private MinioProperties properties;
    @Bean
    public MinioClient minioClient(){
    return MinioClient.builder().endpoint(properties.getEndpoint()).credentials(properties.getSecretKey(),
            properties.getAccessKey()).build();
    }
}

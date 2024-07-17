package com.radness.sf.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.ForwardedHeaderFilter;

@Configuration
@RequiredArgsConstructor
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("springdoc-openapi")
                        .version("1.0.0")
                        .description("springdoc-openapi swagger-ui")
                );
    }

//    @Bean
//    public GroupedOpenApi api() {
//        String[] paths = {"api/v1/**"};
//        String[] packagesToScan = {"com.radness.sf.springdoc"};
//        return GroupedOpenApi.builder().group("springdic-openapi")
//                .pathsToMatch(paths)
//                .packagesToScan(packagesToScan)
//                .build();
//    }
}

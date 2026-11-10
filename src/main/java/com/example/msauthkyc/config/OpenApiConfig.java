package com.example.msauthkyc.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * OpenAPI document served at /v3/api-docs and aggregated by the gateway Swagger UI.
 * The server URL is the gateway route prefix, so "Try it out" calls go through gw-branch.
 */
@Configuration
public class OpenApiConfig {

    private static final String GATEWAY_PREFIX = "/auth";

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info().title("ms-auth-kyc API").version("v1"))
                .servers(List.of(new Server().url(GATEWAY_PREFIX).description("via gw-branch")));
    }
}

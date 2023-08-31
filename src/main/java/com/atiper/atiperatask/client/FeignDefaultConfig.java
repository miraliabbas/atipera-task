package com.atiper.atiperatask.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import feign.codec.ErrorDecoder;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.atipertask.client")
public class FeignDefaultConfig {
    @Bean
    public ErrorDecoder restErrorResponseDecoder(ObjectMapper objectMapper){
        return new RestErrorResponseDecoder(objectMapper);
    }
}

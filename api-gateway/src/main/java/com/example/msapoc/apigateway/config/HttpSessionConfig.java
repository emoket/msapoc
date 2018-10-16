package com.example.msapoc.apigateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.web.http.HeaderHttpSessionIdResolver;
import org.springframework.session.web.http.HttpSessionIdResolver;

@Configuration
@EnableRedisHttpSession
public class HttpSessionConfig {

    @Bean
    public LettuceConnectionFactory lettuceConnectionFactory() {
        return new LettuceConnectionFactory();
    }

    @Bean
    public HttpSessionIdResolver httpSessionIdResolver() {
        // 헤더명을 X-Auth-Token 으로 설정
        return HeaderHttpSessionIdResolver.xAuthToken();
        // 쿠키를 사용하지 않도록 xAuthToken() 설정.
        // ex)
        // HTTP / 1.1 200 OK
        // X-Auth- 토큰 : f81d4fae-7dec-11d0-a765-00a0c91e6bf6

        // redis console 에는 다음과 같은 형태로 저장됨.
        // spring:session:sessions:[세션ID]
    }
}

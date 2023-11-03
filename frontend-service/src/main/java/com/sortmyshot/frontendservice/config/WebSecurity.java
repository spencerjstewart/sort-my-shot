package com.sortmyshot.frontendservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class WebSecurity {

    @Bean
    public SecurityFilterChain configureHttp(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests(
            cust -> {
                cust.requestMatchers(new AntPathRequestMatcher("/register")).permitAll();
            });

        return http.build();
    }
}

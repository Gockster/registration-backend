package com.example.registrationbackend.security;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@AllArgsConstructor
public class SecurityFilterChainConfig {

//    private final AuthenticationProvider authenticationProvider;
//    private final JWTAuthenticationFilter jwtAuthenticationFilter;
//
//    @Bean
//    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//
//        return http
//                .csrf()
//                .disable()
//                .authorizeHttpRequests(auth ->{
//                    auth.requestMatchers("/api/v*/registration/**").permitAll();
//                    auth.anyRequest().authenticated();
//                })
//                .formLogin(Customizer.withDefaults())
//                .build();
//    }

}

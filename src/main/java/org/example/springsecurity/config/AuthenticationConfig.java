package org.example.springsecurity.config;

import org.example.springsecurity.service.JPAUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AuthenticationConfig {

//    @Bean
//    public UserDetailsService userDetailsService(){
//        var userDetailsManager = new InMemoryUserDetailsManager();
//
//        var user = User.withUsername("nazrin")
//                .password("nazrin")
//                .authorities("read")
//                .build();
//
//        userDetailsManager.createUser(user);
//        return userDetailsManager;
//    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }
}

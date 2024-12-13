package com.example.EpidemicGuard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource) {
        JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);

        jdbcUserDetailsManager.setUsersByUsernameQuery(
                "SELECT username, password, enabled FROM `user` WHERE username = ?"
        );

        jdbcUserDetailsManager.setAuthoritiesByUsernameQuery(
                "SELECT username, role FROM `user` INNER JOIN role ON `user`.id = role.user_id WHERE username = ?"
        );

        return jdbcUserDetailsManager;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests(configurer -> {
            configurer
                    .requestMatchers("/administrador/**").hasAnyRole("ADMIN", "CIDADAO")
                    .requestMatchers("/cidadaoTerceiro/**").hasAnyRole("ADMIN", "CIDADAO")
                    .requestMatchers("/ocorrenciaUsuario/**").hasAnyRole("ADMIN", "CIDADAO")
                    .requestMatchers("/pandemia/**").hasAnyRole("ADMIN", "CIDADAO")
                    .requestMatchers("/pandemiaSintoma/**").hasAnyRole("ADMIN", "CIDADAO")
                    .requestMatchers("/sintoma/**").hasAnyRole("ADMIN", "CIDADAO")
                    .requestMatchers("/endereco/**").hasAnyRole("ADMIN", "CIDADAO")
                    .requestMatchers("/cidadao/**").hasAnyRole("ADMIN", "CIDADAO")
                    .anyRequest().permitAll(); // Permite todas as outras requisições
        });

        httpSecurity.httpBasic(Customizer.withDefaults());

        httpSecurity.csrf(csrf -> csrf.disable()); // Use com cautela para endpoints seguros

        return httpSecurity.build();
    }
}

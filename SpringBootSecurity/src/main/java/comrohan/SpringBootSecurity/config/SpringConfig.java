package comrohan.SpringBootSecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SpringConfig {

    @Bean
    public SecurityFilterChain security(HttpSecurity http) throws Exception {

        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/").permitAll()       // Anyone can see the home page
                .requestMatchers("/admin").authenticated() // Must be logged in to see /admin
                .anyRequest().authenticated()           // Any other URL requires login
            )
            // FIX: Use Customizer.withDefaults() instead of null
            .formLogin(Customizer.withDefaults())       // Enables standard browser login form
            .httpBasic(Customizer.withDefaults());      // Enables Postman API login support

        return http.build();
    }
}
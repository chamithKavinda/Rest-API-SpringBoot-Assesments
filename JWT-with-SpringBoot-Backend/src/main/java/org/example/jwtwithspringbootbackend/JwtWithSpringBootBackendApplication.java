package org.example.jwtwithspringbootbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RequestMapping("api/v1/auth")
public class JwtWithSpringBootBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(JwtWithSpringBootBackendApplication.class, args);
    }

}

package net.codejava.springboothelloworld;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;     
        
@RestController
@EnableAutoConfiguration
public class SpringBootHelloWorldApplication {

                @RequestMapping("/")
                String home() {
                return "Hello World Spring Boot!";
    }   
                public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
	}


}
        
// TODO: under construction
// main class v0.1
package com.carservice.main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CarServiceWebApp {

    public static void main(String[] args) {
        SpringApplication.run(CarServiceWebApp.class,args);
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value="myName", defaultValue = "World")String name) {
          return String.format("Hello %s!",name);
    }

}

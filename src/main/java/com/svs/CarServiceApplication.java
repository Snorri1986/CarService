package com.svs;

import com.svs.entity.User;
import com.svs.repository.UserRepository;
import com.svs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.event.EventListener;

import java.util.List;

/**
 * Main class
 * @author: Denys Shabelnyk
 * @since 0.1.2
 */
@SpringBootApplication
public class CarServiceApplication extends SpringBootServletInitializer implements CommandLineRunner {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepo;


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
         return application.sources(CarServiceApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(CarServiceApplication.class,args);
    }

    // show data from db
    // TODO: save it in variables and show it on html
    public void run(String...args) throws Exception {
        List<User> users = userRepo.findAll();
        users.forEach(System.out :: println);
        System.exit(0);
    }
    // ... //
}


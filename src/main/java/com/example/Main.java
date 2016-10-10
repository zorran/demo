package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Main extends WebMvcConfigurerAdapter {

    public static void main(String[] args) throws IOException {
        BufferedReader fr = new BufferedReader(new FileReader(new File(args[0])));
        Passwords passwords = Passwords.getInstance();
        String line;
        while ((line = fr.readLine()) != null) {
            String[] bit = line.split("\t");
            passwords.addPassword(Long.parseLong(bit[0]), bit[1]);
        }
        fr.close();
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
    }

}

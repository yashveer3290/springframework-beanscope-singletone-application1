package com.sunglowsys.config;

import com.sunglowsys.domain.Address;
import com.sunglowsys.domain.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ApplicationConfiguration {

    @Bean
    public Student getStudent(){
        return new Student();
    }

    @Bean
    public Address getAddress(){
        return new Address();
    }
}

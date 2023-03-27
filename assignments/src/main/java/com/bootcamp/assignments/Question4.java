package com.bootcamp.assignments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Question4 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Question3.class,args);
        DoubleTheNumber2 double_n = applicationContext.getBean(DoubleTheNumber2.class);

        System.out.println(double_n);
    }
}


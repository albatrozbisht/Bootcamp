package com.bootcamp.assignments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Question1 {
    public static void main(String[] args) {
        DoubleTheNumber double_n = new DoubleTheNumber();
        int doubled_number_after_operations = double_n.double_number(10,20);
        System.out.println("Doubled after operations: ");
        System.out.println(doubled_number_after_operations);
        SpringApplication.run(AssignmentsApplication.class, args);

    }
}


class DoubleTheNumber{
    public int double_number(int a,int b){
        Add add = new Add();
        int number = add.operation(a,b);
        return number*2;
    }
}

class Add{
    public int operation(int a,int b){
        return a+b;
    }
}

class Subtract{
    public int operation(int a, int b){
        return a-b;
    }
}

class Multiplication{
    public int operation(int a, int b){
        return a*b;
    }
}
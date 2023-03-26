package com.bootcamp.assignments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Question2 {
    public static void main(String[] args) {
        DoubleTheNumber1 double_n = new DoubleTheNumber1(new Multiplication1());
        int doubled_number_after_operations = double_n.double_number(10,20);
        System.out.println("Doubled after operations: ");
        System.out.println(doubled_number_after_operations);
        SpringApplication.run(AssignmentsApplication.class, args);

    }
}


class DoubleTheNumber1{

    private MathematicalOperations maths;

    DoubleTheNumber1(MathematicalOperations maths){
        this.maths = maths;
    }
    public int double_number(int a,int b){
        int number = maths.operation(a,b);
        return number*2;
    }
}


interface MathematicalOperations{
    int operation(int a,int b);
}

class Add1 implements MathematicalOperations{
    public int operation(int a,int b){
        return a+b;
    }
}

class Subtract1 implements MathematicalOperations{
    public int operation(int a, int b){
        return a-b;
    }
}

class Multiplication1 implements MathematicalOperations{
    public int operation(int a, int b){
        return a*b;
    }
}
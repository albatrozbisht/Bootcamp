package com.bootcamp.assignments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Question3 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Question3.class,args);
        DoubleTheNumber2 double_n = applicationContext.getBean(DoubleTheNumber2.class);

        int doubled_number_after_operations= double_n.double_number(30,10);
        System.out.println("\n\n\nDoubled after operations: ");
        System.out.println(doubled_number_after_operations);

    }
}

@Component
class DoubleTheNumber2{
    private MathematicalOperations1 maths;

    @Autowired
    public void setMaths(MathematicalOperations1 maths){
        this.maths=maths;
    }
    public int double_number(int a,int b){
        int number = maths.operation(a,b);
        return number*2;
    }
}


interface MathematicalOperations1{
    int operation(int a,int b);
}




class Add2 implements MathematicalOperations1{
    public int operation(int a,int b){
        return a+b;
    }
}


@Component
class Subtract2 implements MathematicalOperations1{
    public int operation(int a, int b){
        return a-b;
    }
}

class Multiplication2 implements MathematicalOperations1{
    public int operation(int a, int b){
        return a*b;
    }
}
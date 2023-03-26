package com.bootcamp.assignments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Question6 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Question6.class,args);
        DoubleTheNumber4 double_n = applicationContext.getBean(DoubleTheNumber4.class);

        int doubled_number_after_operations= double_n.double_number(30,10);
        System.out.println("\n\n\nDoubled after operations: ");
        System.out.println(doubled_number_after_operations);

    }
}

@Component
class DoubleTheNumber4{

    // Constructor Injection
    @Autowired
    private MathematicalOperations3 maths;
    DoubleTheNumber4(MathematicalOperations3 maths){
        this.maths=maths;
    }
    public int double_number(int a,int b){
        int number = maths.operation(a,b);
        return number*2;
    }
}


interface MathematicalOperations3{
    int operation(int a,int b);
}



@Component
@Qualifier("Addition1")
@Primary
class Add4 implements MathematicalOperations3{
    public int operation(int a,int b){
        return a+b;
    }
}


@Component
@Qualifier("Subtraction1")
class Subtract4 implements MathematicalOperations3{
    public int operation(int a, int b){
        return a-b;
    }
}


@Component
@Qualifier("Multiplication1")
class Multiplication4 implements MathematicalOperations3{
    public int operation(int a, int b){
        return a*b;
    }
}

@Component
@Qualifier("Division1")
class Division4 implements MathematicalOperations3{
    public int operation(int a, int b){
        return a/b;
    }
}
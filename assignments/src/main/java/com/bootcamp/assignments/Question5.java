package com.bootcamp.assignments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Question5 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Question5.class,args);
        DoubleTheNumber3 double_n = applicationContext.getBean(DoubleTheNumber3.class);

        int doubled_number_after_operations= double_n.double_number(30,10);
        System.out.println("\n\n\nDoubled after operations: ");
        System.out.println(doubled_number_after_operations);

    }
}

@Component
class DoubleTheNumber3{
    private MathematicalOperations2 maths;

    @Autowired
    @Qualifier("Division")
    public void setMaths(MathematicalOperations2 maths){
        this.maths=maths;
    }
    public int double_number(int a,int b){
        int number = maths.operation(a,b);
        return number*2;
    }
}


interface MathematicalOperations2{
    int operation(int a,int b);
}



@Component
@Qualifier("Addition")
class Add3 implements MathematicalOperations2{
    public int operation(int a,int b){
        return a+b;
    }
}


@Component
@Qualifier("Subtraction")
class Subtract3 implements MathematicalOperations2{
    public int operation(int a, int b){
        return a-b;
    }
}


@Component
@Qualifier("Multiplication")
class Multiplication3 implements MathematicalOperations2{
    public int operation(int a, int b){
        return a*b;
    }
}

@Component
@Qualifier("Division")
class Division3 implements MathematicalOperations2{
    public int operation(int a, int b){
        return a/b;
    }
}
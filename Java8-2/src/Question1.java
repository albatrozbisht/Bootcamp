import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;



public class Question1 {
    public static void main(String[] args) {
        Consumer<Integer> display= System.out::println;
        System.out.println("Consumer in jav8");
        display.accept(10);
        System.out.println();


        Supplier<Integer> number = () -> (int) Math.random();
        System.out.println("Supplier in Java8");
        System.out.println(number.get());
        System.out.println();


        Predicate<Integer> greaterThanTen = (i)  -> i<10;
        System.out.println("Predicate in Java8");
        System.out.println(greaterThanTen.test(12));
        System.out.println();


        Function<String, Integer> func = String::length;
        System.out.println("Function in Java8");
        System.out.println(func.apply("Mohit Bisht"));

    }
}


//Output:
//        Consumer in jav8
//        10
//
//        Supplier in Java8
//        0
//
//        Predicate in Java8
//        false
//
//        Function in Java8
//        11

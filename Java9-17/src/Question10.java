import java.io.*;
import java.util.Optional;

public class Question10{
    public static void main(String[] args) {

        System.out.println("hello".repeat(3)); // Output: "hello hello hello "

        System.out.println("\n A1 \n".strip());

        System.out.println("\n \n".isBlank());
        System.out.println("STRING".isBlank());

        System.out.println("123\nabc\nABC".indent(3));

        System.out.println(Optional.of("string".transform(String::toUpperCase)));

        System.out.println("   123   ".stripIndent());

        System.out.println("Tab \\t Next Line \\n Space \\s Single Quote \' Double Quote \" ".translateEscapes());

        System.out.println("1) %s 2) %s 3) %s ".formatted("Car", "Bike", "Truck"));
    }
}


//Output:
//        hellohellohello
//        A1
//        true
//        false
//        123
//        abc
//        ABC
//
//        Optional[STRING]
//        123
//        Tab 	 Next Line
//        Space   Single Quote ' Double Quote "
//        1) Car 2) Bike 3) Truck

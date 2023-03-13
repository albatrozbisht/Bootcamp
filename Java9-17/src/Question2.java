import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Question2 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12);

        System.out.println("******takeWhile******");
        list.stream()
                .takeWhile(e->e<5)
                .map(e->Math.pow(e,2))
                .forEach(System.out::println);

        System.out.println("******dropWhile*****");
        list.stream()
                .dropWhile(e->e<5)
                .map(e->Math.pow(e,3))
                .forEach(System.out::println);


    }
}


//Output:
//        ******takeWhile******
//        1.0
//        4.0
//        9.0
//        16.0
//        ******dropWhile*****
//        125.0
//        216.0
//        343.0
//        512.0
//        729.0
//        1000.0
//        1728.0

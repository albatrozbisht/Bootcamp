import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question7 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        System.out.println("*****List*****");
        list.forEach(System.out::println);


        Set<Integer> set = Set.of(5,6,78,9,34,23,45);
        System.out.println("****Set****");
        set.forEach(System.out::println);


        Map<Integer,String> map = Map.of(1,"One",2,"Two",3,"Three",4,"Four",5,"Five");
        System.out.println("*****map*****");
        System.out.println(map);

    }
}


//Output:
//        *****List*****
//        1
//        2
//        3
//        4
//        5
//        ****Set****
//        45
//        23
//        9
//        78
//        34
//        6
//        5
//        *****map*****
//        {1=One, 5=Five, 4=Four, 3=Three, 2=Two}
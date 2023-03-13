import java.util.List;
import java.util.stream.Collectors;

public class Question9 {
    public static void main(String[] args) {
        List<Integer> list = List.of(12,22,3,3,4,5,6,7);
        List<Integer> copiedList = list.stream()
                .collect(Collectors.toUnmodifiableList());
        System.out.println(copiedList);
    }
}


//Output:
//        [12, 22, 3, 3, 4, 5, 6, 7]
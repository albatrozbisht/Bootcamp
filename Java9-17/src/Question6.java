import java.util.Optional;

public class Question6 {
    public static void main(String[] args) {
        Optional<Integer> op = Optional.ofNullable(123456);
        op.stream().forEach(System.out::println);
    }
}


//Output:
//        123456

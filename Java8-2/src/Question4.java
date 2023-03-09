import java.util.Optional;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = null;
        Optional<String> op = Optional.ofNullable(s1);
        System.out.println(op.isEmpty());
        System.out.println(op.isPresent());
        System.out.println(op.orElse("String is null"));
    }
}

//Output:
//        true
//        false
//        Please enter a string
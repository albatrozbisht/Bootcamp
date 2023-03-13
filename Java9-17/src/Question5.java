import java.util.Optional;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = null;
        Optional<String> op = Optional.ofNullable(s1);
        System.out.println(op.isEmpty());
//        op.ifPresentOrElse("String is null"));
        System.out.println(op.orElse("String is null"));
    }
}

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){
        int x,y,z;
        Scanner sc = new Scanner(System.in);

        try {
            x = sc.nextInt();
            y = sc.nextInt();
            System.out.println("Divison1 is: " + (x / y));
        } catch (InputMismatchException i) {
                System.out.println("Please enter an integer ");
                System.out.println("Catch block 1 is executed");
            } catch (ArithmeticException a) {
                System.out.println("Second number should not be a 0 ");
                System.out.println("Catch block 2 is executed");
            } finally {
                System.out.println("Finally block executed");
            }
    }
}

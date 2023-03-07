import java.util.Scanner;
import java.util.function.BiFunction;


class mathematical{
    int add(int x, int y){
       return x+y;
    }

    int subtraction(int x,int y){
        return x-y;
    }

    static int multiplication(int x,int y){
        return x*y;
    }

}


public class Question2 {
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        BiFunction<Integer,Integer,Integer>a=  new mathematical()::add;
        System.out.println("Sum is: "+a.apply(x,y));

        BiFunction<Integer,Integer,Integer>s=  new mathematical()::subtraction;
        System.out.println("Difference is: "+s.apply(x,y));

        BiFunction<Integer,Integer,Integer>m=  mathematical::multiplication;
        System.out.println("Division is: "+m.apply(x,y));


    }
}


//Output:
//        7
//        4
//        Sum is: 11
//        Difference is: 3
//        Division is: 28

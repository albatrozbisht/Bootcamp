

//To check whether the first number is greater than second number or not, Parameter (int ,int ) Return type boolean
//        Increment the number by 1 and return incremented value Parameter (int) Return int
//        Concatination of 2 string Parameter (String , String ) Return (String)
//        Convert a string to uppercase and return . Parameter (String) Return (String)

import java.sql.SQLOutput;
import java.util.Scanner;

@FunctionalInterface
interface GreaterNumber{
    boolean greater(int x, int y);
}

@FunctionalInterface
interface IncrementNumber{
    int increment(int x);
}

@FunctionalInterface
interface StringConcatenation{
    String concatenate(String a, String b);
}



@FunctionalInterface
interface StringUpperCase{
    String uppercase(String c);
}



public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        GreaterNumber gn = (int x,int y) ->  x > y;

        System.out.println("1st number is greater than 2nd: "+gn.greater(a,b));

        IncrementNumber in = (int x) -> x+1;

        System.out.println("After incrementation the number is: "+in.increment(a));
        String s1 = sc.next();
        String s2 = sc.next();

        StringConcatenation c = (String d, String e) -> d.concat(" ").concat(e);

        String upper = c.concatenate(s1, s2);
        System.out.println("String after concatenation is: "+upper);

        StringUpperCase su = (String u) -> u.toUpperCase();
        System.out.println("String after converting it to uppercase is: "+su.uppercase(upper));


    }
}


//Output:
//        7
//        4
//        1st number is greater than 2nd: true
//        After incrementation the number is: 8
//        Mohit
//        Bisht
//        String after concatenation is: Mohit Bisht
//        String after converting it to uppercase is: MOHIT BISHT

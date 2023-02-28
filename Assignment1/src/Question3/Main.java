package Question3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int radius = sc.nextInt();
        int op = sc.nextInt();
        switch (op){
            case 1:
                System.out.println(area(radius));
                break;

            case 2:
                System.out.println(circumference(radius));
                break;

            case 3:
                break;


        }
    }
    public static double area(int radius){
        return (22/7)*radius*radius;
    }

    public static double circumference(int radius){
        return 2*(22/7)*radius;
    }
}

//Output:
//        14
//        2
//        84.0
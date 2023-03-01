package Question3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        int radius = sc.nextInt();

        int op;
        do {
            System.out.println("Enter your choice: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Area of circle is: "+area(radius));
                    break;

                case 2:
                    System.out.println("Circumference of circle is: "+circumference(radius));
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }while (op!=3);
    }

    public static double area(int radius){
        return (22/7)*radius*radius;
    }

    public static double circumference(int radius){
        return 2*(22/7)*radius;
    }
}

//Output:
//        Enter radius of circle:
//        14
//        Enter your choice:
//        1
//        Area of circle is: 588.0
//        Enter your choice:
//        22
//        Invalid choice
//        Enter your choice:
//        4
//        Invalid choice
//        Enter your choice:
//        3
//
//        Process finished with exit code 0
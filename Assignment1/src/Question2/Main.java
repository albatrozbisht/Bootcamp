package Question2;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text="";
        String output="";
        while(!text.equals("XDONE")){
            output+=" "+text;
            text = sc.nextLine();
        }
        System.out.println("User input text:"+output);
    }
}


//Output:
//HI!
//        THIS IS THE
//        2ND QUESTION
//        OF MY ASSIGNMENT
//        XDONE
//        User input text:  HI! THIS IS THE 2ND QUESTION OF MY ASSIGNMENT

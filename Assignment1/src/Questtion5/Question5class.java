package Questtion5;

public class Question5class {
    String first_name;
    String last_name;
    int age;
    String designation;
    Question5class(){
        System.out.println("Default constructor");
    }
    Question5class(String fname, String lname){
        this.first_name=fname;
        this.last_name=lname;
        System.out.println("First name: "+fname);
        System.out.println("Last name: "+lname);
        System.out.println("Parameterised Constructor");
    }
}

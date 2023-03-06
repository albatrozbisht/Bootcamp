import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try(FileWriter fileWriter = new FileWriter("Question2.txt",true)){
            while (true){
                System.out.println("First name: ");
                String first_name = sc.nextLine();
                sc.nextLine();

                System.out.println("Last name: ");
                String last_name = sc.nextLine();
                sc.nextLine();

                System.out.println("Age: ");
                int age = sc.nextInt();
                sc.nextLine();

                System.out.println("Phone number");
                String phone_number = sc.nextLine();

                User user = new User(first_name,last_name,age,phone_number);
                fileWriter.write(user+"\n");

                System.out.println("Do you want to continue creating user ? " +
                        "(Type QUIT to exit):(Press Enter to add more) ");
                String input = sc.nextLine();
                if(input.equalsIgnoreCase("QUIT")){
                    break;
                }

            }
        }catch(IOException e){
            System.out.println("Error writing to file: "+e.getMessage());
        }
    }
}


class User{
    private String first_name;
    private String last_name;
    private int age;
    private String phone_number;
    User(String first_name,String last_name,int age,String phone_number){
        this.first_name=first_name;
        this.last_name=last_name;
        this.age=age;
        this.phone_number=phone_number;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }


    @Override
    public String toString() {
        return "User{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", age=" + age +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }
}


//Output:
//
//        First name:
//        Mohit
//
//        Last name:
//        Bisht
//        Age:
//        21
//        Phone number
//        8130685847
//        Do you want to continue creating user ? (Type QUIT to exit):(Press Enter to add more)
//
//        First name:
//        Shashank
//
//        Last name:
//        Singh
//
//        Age:
//        21
//        Phone number
//        8456478347
//        Do you want to continue creating user ? (Type QUIT to exit):(Press Enter to add more)
//        quit
//

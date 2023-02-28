package Question5;

public class Employee {
    String first_name;
    String last_name;
    int age;
    private String designation;
    Employee(){
        System.out.println("Default constructor");
    }
    Employee(String fname, String lname,int age){
        this.first_name=fname;
        this.last_name=lname;
        this.age=age;
    }

//    setter
    public void setdesignation(String d){
        this.designation=d;
    }

//    getter
    public String getdesignation(){
        return designation;
    }

    public String toString(){//overriding the toString() method
        return "Full name of the employee is: "+first_name+" "+last_name+" and he is "+age+" years old and he is currently appointed as "+designation;
    }
}
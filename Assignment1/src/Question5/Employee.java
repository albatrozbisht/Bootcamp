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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String toString(){//overriding the toString() method
        return "Full name of the employee is ".concat(first_name).concat(" ").concat(last_name)
                        .concat(" and he is ").concat(String.valueOf(age))
                .concat(" years old and he is currently appointed as "+designation);
    }




}
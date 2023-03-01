package Question5;

public class Main {
    public static void main(String[] args){
        Employee e= new Employee("Mohit","Bisht",22);
        e.setDesignation("JVM Trainee");
        System.out.println(e.getDesignation());
        System.out.println(e.toString());
    }
}

//Output:
//        JVM Trainee
//        Full name of the employee is Mohit Bisht and he is 22 years old and he is currently appointed as JVM Trainee
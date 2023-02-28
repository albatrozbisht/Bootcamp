package Question5;

public class Main {
    public static void main(String[] args){
        Employee e= new Employee("Mohit","Bisht",22);
        e.setdesignation("JVM Trainee");
        System.out.println(e.getdesignation());
        System.out.println(e.toString());
    }
}

//Output:
//        JVM Trainee
//        Full name of the employee is: Mohit Bisht and he is 22 years old and he is currently appointed as JVM Trainee

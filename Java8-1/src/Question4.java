interface DemoInterface {
    Student myMethod(String str);
}

class Student {
    String str;
    public Student(String str) {
        this.str=str;
        System.out.println("Constructor of Student "+str);
    }
}
public class Question4 {
    public static void main(String[] args) {
        DemoInterface demoInterface= Student::new;
        demoInterface.myMethod("Mohit");
        System.out.println(demoInterface);
    }
}

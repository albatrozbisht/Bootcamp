interface DemoInterface {
    default Student myMethod(Student str){
        return str;
    }
}

class Student {
    public Student(String str){
        System.out.println("Constructor of Student"+str);
    }

}
public class Question4 {
    public static void main(String[] args) {
        DemoInterface demoInterface = Student::new;
//        String str=demoInterface.myMethod(new char[]{'a', 'b', 'c', 'd'});
        System.out.println(demoInterface);
    }
}

interface privInterface {
    public default void method1(){
        System.out.println("Default method");
        method2();
        method3();
    }
    private void method2(){
        System.out.println("Private method in interface");
    }
    private static void method3(){
        System.out.println("Private static method in interface");
    }
}
public class Question1 implements privInterface {

    public static void main(String[] args) {
        privInterface p=new Question1();
        p.method1();

    }
}

//Output:
//        Default method
//        Private method in interface
//        Private static method in interface

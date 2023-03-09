
interface Practise{
    default void Method1(){
        System.out.println("This is a default method of interface.");
    }

    static void Method2(){
        System.out.println("This is a static method of interface.");
    }
}




public class Question2 implements Practise{
    public static void main(String[] args) {


//        Calling default method of Interface
        Question2 q2 = new Question2();
        q2.Method1();



//        Calling static method of Interface
        Practise.Method2();
    }
}


//Output:
//        This is a default method of interface.
//        This is a static method of interface.

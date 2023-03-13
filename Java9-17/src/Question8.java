import java.io.Closeable;

public class Question8 {
    public static void main(String[] args) {
        try (Demo d = new Demo()) {
            d.show();
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}


class Demo implements Closeable {
    public void show(){
        System.out.println("Show method called from main");
    }
    public void close(){
        System.out.println("Close method automatically called");
    }
}

//Output:
//        Show method called from main
//        Close method automatically called

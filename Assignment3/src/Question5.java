public class Question5 {
    public static void main(String[] args){
        Singleton object = Singleton.getInstance();
        object.print();
    }

}

class Singleton{
    private static Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }

    public void print(){
        System.out.println("Singleton Object");
    }

}

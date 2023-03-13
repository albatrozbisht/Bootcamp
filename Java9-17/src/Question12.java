sealed class Animal permits Dog, Cat {
    private String name;

    public Animal(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }
}

final class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
}

final class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
}
public class Question12 {
    public static void main(String[] args) {
        Cat cat1=new Cat("Luna");
        System.out.println(cat1.getName());
        Dog dog1=new Dog("Shiro");
        System.out.println(dog1.getName());
    }
}


//Output:
//        Luna
//        Shiro

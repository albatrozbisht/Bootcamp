interface multiple{
    default void display(){
        System.out.println("Main interface");
    }
}

interface part1 extends multiple{
    default void display(){
        multiple.super.display();
        System.out.println("Part1 interface");
    }
}

interface part2 extends multiple{
    default void display(){
        multiple.super.display();
        System.out.println("Part2 interface");
    }
}

class root implements part1,part2{
    public void display(){
        part1.super.display();
        part2.super.display();
        System.out.println("Root class");
    }
}





public class Question3 {
    public static void main(String[] args) {
        root r = new root();
        r.display();
    }
}


//Output:
//Main interface
//Part1 interface
//Main interface
//Part2 interface
//Root class

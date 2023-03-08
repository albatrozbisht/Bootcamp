import java.util.ArrayList;

public class Question3 {
    public static void main(String[] args) {
        ArrayList<Integer> items= new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(13);
        items.add(11);
        items.add(5);
        items.add(7);
        items.add(16);
        items.add(41);
        System.out.println("Sum of integers in list is ");
        System.out.println(
                items.stream()
                        .filter(e->e>5)
                        .reduce(0,Integer::sum)
        );

    }
}

//Output:
//        Sum of integers in list is
//        88
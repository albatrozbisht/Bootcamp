import java.util.Scanner;
import java.util.Stack;

public class Question3 {
    public static void main(String[] args){
        SpecialStack stack = new SpecialStack();
        Scanner sc =new Scanner(System.in);
        int input;
        System.out.println("1. Push\n2.Pop\n3.isFull\n4.isEmpty\n5.Minimum Element\nAny other option to exit ");
        do{
            System.out.println("\nEnter your choice: ");
            input = sc.nextInt();
            switch (input) {
                case 1 -> {
                    System.out.println("Enter item to be pushed: ");
                    stack.push(sc.nextInt());
                }
                case 2 -> stack.pop();
                case 3 -> System.out.println(stack.isFull());
                case 4 -> System.out.println(stack.isEmpty());
                case 5 -> System.out.println("Minimum element is: " + stack.getMin());
            }
        }while(input<6);
    }

}

class SpecialStack{
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    SpecialStack(){
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    void push(int x){
        stack.push(x);
        System.out.println("Item is pushed");
        if(minStack.isEmpty() || x <= minStack.peek()){
            minStack.push(x);
        }
    }

    int pop(){
        if(minStack.isEmpty()){
            System.out.println("Stack is empty");
        }
        int popped = stack.pop();
        if(popped==minStack.peek()){
            minStack.pop();
        }
        System.out.println("Popped item is: "+popped);
        return popped;
    }
    boolean isEmpty(){
        return stack.isEmpty();
    }

    boolean isFull(){
        return false;
    }

    int getMin(){
        if(minStack.isEmpty()){
            System.out.println("Stack is empty");
        }
        return minStack.peek();
    }
}


//Output:
//        1. Push
//        2.Pop
//        3.isFull
//        4.isEmpty
//        5.Minimum Element
//        Any other option to exit
//
//        Enter your choice:
//        4
//        true
//
//        Enter your choice:
//        1
//        Enter item to be pushed:
//        5
//        Item is pushed
//
//        Enter your choice:
//        1
//        Enter item to be pushed:
//        7
//        Item is pushed
//
//        Enter your choice:
//        2
//        Popped item is: 7
//
//        Enter your choice:
//        5
//        Minimum element is: 5
//
//        Enter your choice:
//        8
//
//        Process finished with exit code 0

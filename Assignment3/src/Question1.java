import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter house type: 1. Villa 2. Independent House 3. Flat ");
        int input = sc.nextInt();
        switch(input){
            case 1: {
                House a = House.Villa;
                System.out.println("Price of "+a+" is :"+a.getPrice());
                break;
            }
            case 2: {
                House ih = House.Independent_house;
                System.out.println("Price of "+ih+" is :"+ih.getPrice());
                break;
            }
            case 3:{
                House flat = House.flat;
                System.out.println("Price of "+flat+" is :"+flat.getPrice());
                break;
            }
        }
    }
}


enum House {
    Villa(6200000),
    Independent_house(5200000),
    flat(450000);
    private final double price;

    House(double price){
        this.price=price;
    }

    public double getPrice() {
        return price;
    }


}

//Output:
//
//        Enter house type: 1. Villa 2. Independent House 3. Flat
//        2
//        Price of Independent_house is :5200000.0
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter country: ");
        String country = sc.nextLine();
        Currency c = CurrentCountry.current(country);
        System.out.println("Currency of "+country+" is : "+c.getSymbol());
    }
}

interface Currency{
    String getSymbol();
}

class Rupee implements Currency{
    public String getSymbol(){
        return "Rs";
    }
}

class Pounds implements Currency{
    public String getSymbol(){
        return "Pounds";
    }
}

class USDollar implements Currency{
    public String getSymbol(){
        return "USD";
    }
}

class CurrentCountry{
    public static Currency current(String country){
        if(country.equalsIgnoreCase("India")){
            return new Rupee();
        } else if (country.equalsIgnoreCase("UK")) {
            return new Pounds();
        } else if (country.equalsIgnoreCase("US")) {
            return new USDollar();
        }
        throw new IllegalArgumentException("No such currency");
    }
}


//Output:
//        Enter country:
//        india
//        Currency of india is : Rs
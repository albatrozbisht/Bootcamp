public class Question1 {
    public static void main(String[] args){


    }
}

class Banking{
    private String Name, headofficeAddress, chairmanName;
    private double branchCount, fdInterestRate, personalLoanInterestRate, homeLoanInterestRate;
    public void setName(String Name){
        this.Name=Name;
    }
    public String getName(){
        return Name;
    }
}

class SBI extends Banking{

}

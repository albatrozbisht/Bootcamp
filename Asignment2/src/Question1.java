import java.lang.reflect.ParameterizedType;

public class Question1 {
    public static void main(String[] args){

//        Parameterized Constructor

        ICICI ic =new ICICI("ICICI","Delhi","Mohit",5
        , 12.6,6.2,15);


        System.out.println(ic.getName());
        System.out.println(ic.getChairmanName());
        System.out.println(ic.getHomeLoanInterestRate());
        System.out.println(ic.getFdInterestRate());
        System.out.println(ic.toString());


//        Default constructor
        ICICI ic1 = new ICICI();

        ic1.setName("Default Mohit");
        ic1.setChairmanName("Default raman");
        ic1.setBranchCount(4);

        System.out.println(ic1.getName());
        System.out.println(ic1.getChairmanName());
        System.out.println(ic1.getBranchCount());
    }
}

abstract class Banking{
    private String Name, headofficeAddress, chairmanName;
    private double branchCount, fdInterestRate, personalLoanInterestRate, homeLoanInterestRate;



    Banking(){
    }
    Banking(String Name, String headofficeAddress, String chairmanName,double branchCount,
            double fdInterestRate, double personalLoanInterestRate, double homeLoanInterestRate)
    {
        this.Name=Name;
        this.headofficeAddress=headofficeAddress;
        this.chairmanName=chairmanName;
        this.branchCount=branchCount;
        this.fdInterestRate=fdInterestRate;
        this.personalLoanInterestRate=personalLoanInterestRate;
        this.homeLoanInterestRate=homeLoanInterestRate;
    }


    public String getName() {
        return Name;
    }

    public String getHeadofficeAddress() {
        return headofficeAddress;
    }

    public String getChairmanName() {
        return chairmanName;
    }

    public double getBranchCount() {
        return branchCount;
    }

    public double getFdInterestRate() {
        return fdInterestRate;
    }

    public double getPersonalLoanInterestRate() {
        return personalLoanInterestRate;
    }

    public double getHomeLoanInterestRate() {
        return homeLoanInterestRate;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setHeadofficeAddress(String headofficeAddress) {
        this.headofficeAddress = headofficeAddress;
    }

    public void setChairmanName(String chairmanName) {
        this.chairmanName = chairmanName;
    }

    public void setBranchCount(double branchCount) {
        this.branchCount = branchCount;
    }

    public void setFdInterestRate(double fdInterestRate) {
        this.fdInterestRate = fdInterestRate;
    }

    public void setPersonalLoanInterestRate(double personalLoanInterestRate) {
        this.personalLoanInterestRate = personalLoanInterestRate;
    }

    public void setHomeLoanInterestRate(double homeLoanInterestRate) {
        this.homeLoanInterestRate = homeLoanInterestRate;
    }


    @Override
    public String toString() {
        return "Name: ".concat(Name).concat(" head office Address: ").concat(headofficeAddress)
                .concat(" chairman Name: ").concat(chairmanName).concat(" branch Count: ")
                .concat(String.valueOf(branchCount)).concat(" fd Interest Rate: ")
                .concat(String.valueOf(fdInterestRate)).concat(" personal Loan Interest Rate: ")
                .concat(String.valueOf(personalLoanInterestRate)).concat(" home Loan Interest Rate: ")
                .concat(String.valueOf(homeLoanInterestRate)).concat(" fd Interest Rate: ")
                .concat(String.valueOf(fdInterestRate)).concat(" personal Loan Interest Rate: ")
                .concat(String.valueOf(personalLoanInterestRate)).concat(" home Loan Interest Rate: ")
                .concat(String.valueOf(homeLoanInterestRate));
    }


}

class SBI extends Banking{
    SBI(String Name, String headofficeAddress, String chairmanName,double branchCount,
        double fdInterestRate, double personalLoanInterestRate, double homeLoanInterestRate){
        super(Name,headofficeAddress,chairmanName,branchCount, fdInterestRate,
                personalLoanInterestRate,homeLoanInterestRate);
    }
}


class BOI extends Banking{
    BOI(String Name, String headofficeAddress, String chairmanName,double branchCount,
        double fdInterestRate, double personalLoanInterestRate, double homeLoanInterestRate){
        super(Name,headofficeAddress,chairmanName,branchCount, fdInterestRate,
                personalLoanInterestRate,homeLoanInterestRate);
    }
}


class ICICI extends Banking{
    ICICI(String Name, String headofficeAddress, String chairmanName,double branchCount,
        double fdInterestRate, double personalLoanInterestRate, double homeLoanInterestRate){
        super(Name,headofficeAddress,chairmanName,branchCount, fdInterestRate,
                personalLoanInterestRate,homeLoanInterestRate);
    }

    public ICICI() {
    }
}


//Output:
//        ICICI
//        Mohit
//        15.0
//        12.6
//        Name: ICICI head office Address: Delhi chairman Name: Mohit branch Count: 5.0 fd Interest Rate: 12.6 personal Loan Interest Rate: 6.2 home Loan Interest Rate: 15.0 fd Interest Rate: 12.6 personal Loan Interest Rate: 6.2 home Loan Interest Rate: 15.0
//        Default Mohit
//        Default raman
//        4.0
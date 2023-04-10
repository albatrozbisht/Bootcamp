package jpa.springJpa2.inheritanceMapping.entities.tablePerClass;


import jakarta.persistence.Entity;

@Entity
public class CreditCardTablePerClass extends PaymentTablePerClass{
    private int creditCardNumber;

    public CreditCardTablePerClass() {
    }

    public CreditCardTablePerClass(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }



    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

}

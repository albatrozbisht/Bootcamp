package jpa.springJpa2.inheritanceMapping.entities.singleTable;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("cc")
public class CreditCardSingleTable extends PaymentSingleTable {
    private int creditCardNumber;

    public CreditCardSingleTable() {
    }

    public CreditCardSingleTable(int id, int amount, int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

}

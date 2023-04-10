package jpa.springJpa2.inheritanceMapping.entities.joined;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class CreditCardJoined extends PaymentJoined{

    private int creditCardNumber;

    public CreditCardJoined(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public CreditCardJoined() {
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
}

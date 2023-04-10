package jpa.springJpa2.inheritanceMapping.entities.joined;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class PaymentJoined {
    @Id
    private int id;

    private int amount;

    public PaymentJoined(int id, int amount) {
        this.id = id;
        this.amount = amount;
    }


    public PaymentJoined() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

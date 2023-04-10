package jpa.springJpa2.inheritanceMapping.entities.singleTable;


import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="paymentMode",discriminatorType = DiscriminatorType.STRING)
public abstract class PaymentSingleTable {

    @Id
    private int id;
    private int amount;

    public PaymentSingleTable() {
    }

    public PaymentSingleTable(int id, int amount) {
        this.id = id;
        this.amount = amount;
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

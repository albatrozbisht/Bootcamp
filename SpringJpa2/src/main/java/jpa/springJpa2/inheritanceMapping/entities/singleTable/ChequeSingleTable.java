package jpa.springJpa2.inheritanceMapping.entities.singleTable;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("ch")
public class ChequeSingleTable extends PaymentSingleTable {

    private int chequeNumber;

    public ChequeSingleTable() {

    }

    public ChequeSingleTable(int chequeNumber) {
        this.chequeNumber = chequeNumber;
    }

    public int getChequeNumber() {
        return chequeNumber;
    }

    public void setChequeNumber(int chequeNumber) {
        this.chequeNumber = chequeNumber;
    }
}

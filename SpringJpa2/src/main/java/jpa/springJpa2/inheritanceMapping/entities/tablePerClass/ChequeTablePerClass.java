package jpa.springJpa2.inheritanceMapping.entities.tablePerClass;

import jakarta.persistence.Entity;

@Entity
public class ChequeTablePerClass extends PaymentTablePerClass{

    private int chequeNumber;

    public ChequeTablePerClass() {
    }

    public ChequeTablePerClass(int chequeNumber) {
        this.chequeNumber = chequeNumber;
    }

    public int getChequeNumber() {
        return chequeNumber;
    }

    public void setChequeNumber(int chequeNumber) {
        this.chequeNumber = chequeNumber;
    }
}

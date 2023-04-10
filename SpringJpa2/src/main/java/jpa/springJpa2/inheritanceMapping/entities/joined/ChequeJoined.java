package jpa.springJpa2.inheritanceMapping.entities.joined;


import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class ChequeJoined extends PaymentJoined{

    private int chequeNumber;


    public ChequeJoined(int chequeNumber) {
        this.chequeNumber = chequeNumber;
    }

    public ChequeJoined() {
    }

    public int getChequeNumber() {
        return chequeNumber;
    }

    public void setChequeNumber(int chequeNumber) {
        this.chequeNumber = chequeNumber;
    }
}

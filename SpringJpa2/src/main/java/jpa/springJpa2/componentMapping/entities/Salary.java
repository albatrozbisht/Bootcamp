package jpa.springJpa2.componentMapping.entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class Salary {

    private int basicSalary;
    private int bonusSalary;
    private int taxAmount;
    private int specialAllowanceSalary;


    public Salary(int basicSalary, int bonusSalary, int taxAmount, int specialAllowanceSalary) {
        this.basicSalary = basicSalary;
        this.bonusSalary = bonusSalary;
        this.taxAmount = taxAmount;
        this.specialAllowanceSalary = specialAllowanceSalary;
    }

    public Salary() {
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(int bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public int getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(int taxAmount) {
        this.taxAmount = taxAmount;
    }

    public int getSpecialAllowanceSalary() {
        return specialAllowanceSalary;
    }

    public void setSpecialAllowanceSalary(int specialAllowanceSalary) {
        this.specialAllowanceSalary = specialAllowanceSalary;
    }
}

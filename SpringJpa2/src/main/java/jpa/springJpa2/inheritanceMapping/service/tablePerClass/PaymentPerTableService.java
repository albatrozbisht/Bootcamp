package jpa.springJpa2.inheritanceMapping.service.tablePerClass;

import jpa.springJpa2.inheritanceMapping.entities.tablePerClass.ChequeTablePerClass;
import jpa.springJpa2.inheritanceMapping.entities.tablePerClass.CreditCardTablePerClass;
import jpa.springJpa2.inheritanceMapping.repository.tablePerClass.ChequePerClassRepository;
import jpa.springJpa2.inheritanceMapping.repository.tablePerClass.CreditCardPerTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PaymentPerTableService {
    @Autowired
    CreditCardPerTableRepository creditCardRepository;

    @Autowired
    ChequePerClassRepository chequeRepository;

    public void addPaymentThroughCreditCard(CreditCardTablePerClass creditCard){
        creditCardRepository.save(creditCard);
    }

    public void addPaymentThroughCheque(ChequeTablePerClass cheque){
        chequeRepository.save(cheque);
    }

    public Iterable<CreditCardTablePerClass> findCreditCardDetails(){
        return creditCardRepository.findAll();
    }

    public Iterable<ChequeTablePerClass> findChequeDetails(){
        return chequeRepository.findAll();
    }

}

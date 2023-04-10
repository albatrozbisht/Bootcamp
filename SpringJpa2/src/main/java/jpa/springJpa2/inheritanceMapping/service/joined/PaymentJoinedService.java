package jpa.springJpa2.inheritanceMapping.service.joined;

import jpa.springJpa2.inheritanceMapping.entities.joined.ChequeJoined;
import jpa.springJpa2.inheritanceMapping.entities.joined.CreditCardJoined;
import jpa.springJpa2.inheritanceMapping.entities.joined.PaymentJoined;
import jpa.springJpa2.inheritanceMapping.repository.joined.PaymentJoinedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentJoinedService {

    @Autowired
    PaymentJoinedRepository paymentJoinedRepository;

    public void addCreditDetails(CreditCardJoined creditCard){
        paymentJoinedRepository.save(creditCard);
    }

    public void addChequeDetails(ChequeJoined cheque){
        paymentJoinedRepository.save(cheque);
    }

    public Iterable<PaymentJoined> getCreditDetails(){
        return paymentJoinedRepository.findAll();
    }

}

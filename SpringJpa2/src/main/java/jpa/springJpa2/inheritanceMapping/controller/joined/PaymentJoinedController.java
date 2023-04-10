package jpa.springJpa2.inheritanceMapping.controller.joined;


import jpa.springJpa2.inheritanceMapping.entities.joined.ChequeJoined;
import jpa.springJpa2.inheritanceMapping.entities.joined.CreditCardJoined;
import jpa.springJpa2.inheritanceMapping.entities.joined.PaymentJoined;
import jpa.springJpa2.inheritanceMapping.service.joined.PaymentJoinedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentJoinedController {

    @Autowired
    PaymentJoinedService paymentJoinedService;

    @PostMapping("/joined/credit/card")
    public String createCredit(@RequestBody CreditCardJoined creditCardJoined){
        paymentJoinedService.addCreditDetails(creditCardJoined);
        return "Credit Card details are added.";
    }


    @PostMapping("/joined/cheque")
    public String createCheque(@RequestBody ChequeJoined chequeJoined){
        paymentJoinedService.addChequeDetails(chequeJoined);
        return "Cheque details are added.";
    }


    @GetMapping("/joined/payment")
    public Iterable<PaymentJoined> retrieveCredit(){
        Iterable<PaymentJoined> credit = paymentJoinedService.getCreditDetails();
        return credit;
    }

}

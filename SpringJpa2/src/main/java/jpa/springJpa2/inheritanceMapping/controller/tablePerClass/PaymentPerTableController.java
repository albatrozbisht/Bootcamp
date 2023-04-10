package jpa.springJpa2.inheritanceMapping.controller.tablePerClass;


import jpa.springJpa2.inheritanceMapping.entities.tablePerClass.ChequeTablePerClass;
import jpa.springJpa2.inheritanceMapping.entities.tablePerClass.CreditCardTablePerClass;
import jpa.springJpa2.inheritanceMapping.service.tablePerClass.PaymentPerTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentPerTableController {

    @Autowired
    PaymentPerTableService paymentPerTableService;

    @PostMapping("/credit/card")
    public String createCredit(@RequestBody CreditCardTablePerClass creditCard){
        paymentPerTableService.addPaymentThroughCreditCard(creditCard);
        return "Credit Card details are added.";
    }

    @PostMapping("/cheque")
    public String createCheque(@RequestBody ChequeTablePerClass cheque){
        paymentPerTableService.addPaymentThroughCheque(cheque);
        return "Cheque details are added.";
    }


    @GetMapping("/credit/card")
    public Iterable<CreditCardTablePerClass> retrieveCreditDetails(){
        Iterable<CreditCardTablePerClass> credit = paymentPerTableService.findCreditCardDetails();
        return credit;
    }


    @GetMapping("/cheque")
    public Iterable<ChequeTablePerClass> retrieveChequeDetails(){
        Iterable<ChequeTablePerClass> cheque = paymentPerTableService.findChequeDetails();
        return cheque;
    }

}

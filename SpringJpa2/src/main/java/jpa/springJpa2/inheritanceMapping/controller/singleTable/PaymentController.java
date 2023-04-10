package jpa.springJpa2.inheritanceMapping.controller.singleTable;


import jpa.springJpa2.inheritanceMapping.entities.singleTable.ChequeSingleTable;
import jpa.springJpa2.inheritanceMapping.entities.singleTable.CreditCardSingleTable;
import jpa.springJpa2.inheritanceMapping.entities.singleTable.PaymentSingleTable;
import jpa.springJpa2.inheritanceMapping.service.singleTable.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentController {

    @Autowired
    PaymentService service;

    @PostMapping("/payment/cc")
    public String addCreditCardUser(@RequestBody CreditCardSingleTable creditCard){
        service.createCredit(creditCard);
        return "Amount is paid by Credit card";
    }

    @PostMapping("/payment/ch")
    public String addCreditCardUser(@RequestBody ChequeSingleTable cheque){
        service.createCheque(cheque);
        return "Amount is paid by cheque";
    }


    @GetMapping("/payment")
    public List<PaymentSingleTable> retrievePayments(){
        return service.findData();
    }
}

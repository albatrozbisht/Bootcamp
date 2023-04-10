package jpa.springJpa2.inheritanceMapping.service.singleTable;

import jpa.springJpa2.inheritanceMapping.entities.singleTable.ChequeSingleTable;
import jpa.springJpa2.inheritanceMapping.entities.singleTable.CreditCardSingleTable;
import jpa.springJpa2.inheritanceMapping.entities.singleTable.PaymentSingleTable;
import jpa.springJpa2.inheritanceMapping.repository.singleTable.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class PaymentService {

    @Autowired
    PaymentRepository repository;

    public void createCredit(CreditCardSingleTable creditCard){
        repository.save(creditCard);
    }

    public void createCheque(ChequeSingleTable cheque){
        repository.save(cheque);
    }

    public List<PaymentSingleTable> findData(){
        List<PaymentSingleTable> list = new ArrayList<PaymentSingleTable>();
        repository
                .findAll()
                .forEach(list::add);
        return list;
    }

}

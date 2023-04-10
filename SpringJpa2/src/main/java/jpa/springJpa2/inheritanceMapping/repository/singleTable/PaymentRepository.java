package jpa.springJpa2.inheritanceMapping.repository.singleTable;

import jpa.springJpa2.inheritanceMapping.entities.singleTable.PaymentSingleTable;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<PaymentSingleTable,Integer> {
}

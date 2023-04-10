package jpa.springJpa2.inheritanceMapping.repository.tablePerClass;

import jpa.springJpa2.inheritanceMapping.entities.tablePerClass.CreditCardTablePerClass;
import org.springframework.data.repository.CrudRepository;

public interface CreditCardPerTableRepository extends CrudRepository<CreditCardTablePerClass, Integer> {
}

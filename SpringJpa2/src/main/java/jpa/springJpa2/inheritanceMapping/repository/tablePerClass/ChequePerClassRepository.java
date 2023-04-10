package jpa.springJpa2.inheritanceMapping.repository.tablePerClass;

import jpa.springJpa2.inheritanceMapping.entities.tablePerClass.ChequeTablePerClass;
import org.springframework.data.repository.CrudRepository;

public interface ChequePerClassRepository extends CrudRepository<ChequeTablePerClass, Integer> {
}

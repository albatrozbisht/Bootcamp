package jpa.springJpa2.inheritanceMapping.repository.joined;

import jpa.springJpa2.inheritanceMapping.entities.joined.PaymentJoined;
import org.springframework.data.repository.CrudRepository;

public interface PaymentJoinedRepository extends CrudRepository<PaymentJoined, Integer> {
}

package jpa.springJpa2.componentMapping.repository;

import jpa.springJpa2.componentMapping.entities.EmployeeComponent;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepositoryComponent extends CrudRepository<EmployeeComponent, Integer> {
}

package JPA.SpringJpa.Repository;

import JPA.SpringJpa.Entities.Employee;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface EmployeeRepository extends CrudRepository<Employee,Integer>,
        PagingAndSortingRepository<Employee,Integer> {
    List<Employee> findByName(String name);
    List<Employee> findByNameStartingWith(char name);

    List<Employee> findByAgeBetween(int age1,int age2);

    List<Employee> findByAge(int age, Pageable pageable);
}

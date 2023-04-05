package JPA.SpringJpa.Service;


import JPA.SpringJpa.Entities.Employee;
import JPA.SpringJpa.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SpringJpaService {

    @Autowired
    EmployeeRepository repository;

    public String addUser(Employee employee){
        repository.save(employee);
        return "User data is added.";
    }

    public String updateUser(int id,Employee employee){
        repository.findById(id);
        repository.deleteById(id);
        repository.save(employee);
        return "User details updated.";
    }


    public String deleteUser(int id){
        repository.deleteById(id);
        return "User is deleted";
    }

    public List<Employee> getUser(){
        List<Employee> list = new ArrayList<Employee>();
        repository
                .findAll()
                .forEach(list::add);
        return list;
    }

    public long userCount(){
        return repository.count();
    }

    public List<Employee> findByName(String name){
        List<Employee> employees = repository.findByName(name);
        return employees;

    }

    public List<Employee> findNameStartsWith(char name){
        List<Employee> employees = repository.findByNameStartingWith(name);
        return employees;
    }

    public List<Employee> retrieveAge(int age1,int age2){
        List<Employee> employees = repository.findByAgeBetween(age1, age2);
        return employees;
    }

    public List<Employee> pagingAndSortingByAge(int age,int page){
        Pageable pageable = PageRequest.of(page,1, Sort.Direction.ASC,"age");
        List<Employee> employees = repository.findByAge(age,pageable);
        return employees;

    }
}

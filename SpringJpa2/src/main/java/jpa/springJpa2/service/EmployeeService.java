package jpa.springJpa2.service;

import jpa.springJpa2.entities.Employee;
import jpa.springJpa2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;

    public void create(Employee employee){
        repository.save(employee);
    }

    public List<Employee> findData(){
        List<Employee> list = new ArrayList<Employee>();
        repository
                .findAll()
                .forEach(list::add);
        return list;
    }

    public List<Object[]> findByAgeAndSalary(){
//        List<Object[]> list = repository.findAndSortBySalaryAndAge();
//        Object[] first = list.get(0);
//        return first[0];
        return repository.findAndSortBySalaryAndAge();
    }

    public void updateBySalary(long salary){
        long average = repository.averageSalary();
        repository.updateEmployeeBySalary(salary,average);
    }

    public void deleteBySalary(){
        long minSalary = repository.minSalary();
        repository.deleteEmployeeWithMinimumSalary(minSalary);
    }

    public List<Object[]> retrieveEmployeeByNative(){
        return repository.findEmployeeWithLastName();
    }

    public void deleteByAge(int age){
        repository.deleteEmployeeByAge(age);
    }
}

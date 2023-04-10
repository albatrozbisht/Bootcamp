package jpa.springJpa2.componentMapping.service;


import jpa.springJpa2.componentMapping.entities.EmployeeComponent;
import jpa.springJpa2.componentMapping.entities.Salary;
import jpa.springJpa2.componentMapping.repository.EmployeeRepositoryComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceComponent {

    @Autowired
    EmployeeRepositoryComponent employeeRepositoryComponent;

    public void addEmployee(EmployeeComponent employeeComponent){
        employeeRepositoryComponent.save(employeeComponent);
    }

    public Iterable<EmployeeComponent> getEmployee(){
        return employeeRepositoryComponent.findAll();
    }
}

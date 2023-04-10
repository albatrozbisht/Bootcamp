package jpa.springJpa2.componentMapping.controller;

import jpa.springJpa2.componentMapping.entities.EmployeeComponent;
import jpa.springJpa2.componentMapping.service.EmployeeServiceComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeComponentController {
    @Autowired
    EmployeeServiceComponent employeeServiceComponent;

    @PostMapping("/component/employee")
    public String create(@RequestBody EmployeeComponent employeeComponent){
        employeeServiceComponent.addEmployee(employeeComponent);
        return "EmployeeComponent details are added.";
    }

    @GetMapping("/component/employee")
    public Iterable<EmployeeComponent> retrieveEmployee(){
        Iterable<EmployeeComponent> employee = employeeServiceComponent.getEmployee();
        return employee;
    }
}

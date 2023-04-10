package jpa.springJpa2.controller;

import jpa.springJpa2.entities.Employee;
import jpa.springJpa2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @PostMapping("/employee")
    public String addEmployee(@RequestBody Employee employee){
        service.create(employee);
        return "EmployeeComponent details are added";
    }

    @GetMapping("/employee")
    public List<Employee> retrieveEmployee(){
        return service.findData();
    }

    @GetMapping("/employee/salary")
    public List<Object[]> retrieveEmployeeByAgeAndSalary(){
        return service.findByAgeAndSalary();
    }

    @PutMapping("/employees/{salary}")
    public String updateEmployee(@PathVariable long salary){
        service.updateBySalary(salary);
        return "EmployeeComponent Updated";
    }

    @DeleteMapping("/employee")
    public String deleteEmployeeByMinSalary(){
        service.deleteBySalary();
        return "EmployeeComponent deleted";
    }


    @GetMapping("/employee/singh")
    public List<Object[]> retrieveEmployeeByLastName(){
        return service.retrieveEmployeeByNative();
    }

    @DeleteMapping("/employee1/{age}")
    public String deleteEmployeeByAge(){
        service.deleteBySalary();
        return "EmployeeComponent deleted";
    }
}

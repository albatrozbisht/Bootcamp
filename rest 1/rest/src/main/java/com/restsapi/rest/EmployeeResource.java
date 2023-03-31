package com.restsapi.rest;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeResource {

    @Autowired
    private EmployeeDao employeeDao;

    public EmployeeResource(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @GetMapping("/Employees")
    public List<Employee> retrieveAll(){
        return employeeDao.findAll();
    }

    @GetMapping("/Employees/{id}")
    public Employee retrieveUser(@PathVariable int id) {
        Employee employee = employeeDao.findOne(id);
        if(employee == null ){
            throw new UserNotFoundException("Id is not found "+id);
        }

        return employee;
    }

    @PostMapping("/Employees")
    public void addUser(@Valid @RequestBody Employee employee){
        employeeDao.save(employee);
    }

    @DeleteMapping("/Employees/{name}")
    public String delete(@PathVariable String name){
        return employeeDao.delete(name);
    }

    @PutMapping("/Employees/{id}")
    public void updateDetails(@PathVariable int id, @RequestBody Employee employee){
        employeeDao.update(id);
    }



}

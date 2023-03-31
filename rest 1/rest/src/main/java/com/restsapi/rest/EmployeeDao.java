package com.restsapi.rest;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

@Component
public class EmployeeDao {
    private Employee employee;

    private static List<Employee> list=new ArrayList<Employee>();
    private static int count=0;

    static {
        list.add(new Employee(++count,"Mohit",23));
        list.add(new Employee(++count,"Shashank",22));
        list.add(new Employee(++count,"Tushar",22));
        list.add(new Employee(++count,"Ayush",21));
    }

    public List<Employee> findAll(){
        return list;
    }


    public void save(Employee employee){
        employee.setId(++count);
        list.add(employee);

    }

    public Employee findOne(int id){
        Predicate<Employee> predicate = employee -> Objects.equals(employee.getId(), id);
        return list.stream()
                .filter(predicate)
                .findFirst()
                .orElse(null);
    }

    public String delete(String name){
        list.removeIf(e->e.getName().equals(name));
        return "Element is deleted";
    }

    public void update(int id){

        list.removeIf(e->e.getId()==id);
        employee.setId(id);
        list.add(employee);

    }


}

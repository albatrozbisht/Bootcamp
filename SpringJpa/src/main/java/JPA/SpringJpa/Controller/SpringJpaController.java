package JPA.SpringJpa.Controller;


import JPA.SpringJpa.Entities.Employee;
import JPA.SpringJpa.Service.SpringJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SpringJpaController {

    @Autowired
    SpringJpaService service;

    @PostMapping("/employee")
    public String create(@RequestBody Employee employee){
        return service.addUser(employee);
    }

    @PutMapping("/employee/{id}")
    public String update(@RequestBody Employee employee,@PathVariable int id){
        return service.updateUser(id, employee);
    }

    @DeleteMapping("/employee/{id}")
    public String deleteIt(@PathVariable int id){
        return service.deleteUser(id);
    }


    @GetMapping("/employee")
    public Iterable<Employee> read(){
        return service.getUser();
    }

    @GetMapping("/employee/count")
    public long count(){
        return service.userCount();
    }
    @GetMapping("/employee/{name}")
    public List<Employee> findName(@PathVariable String name){
        return service.findByName(name);
    }

    @GetMapping("/employees/{name}")
    public List<Employee> findStartingChar(@PathVariable char name){
        return service.findNameStartsWith(name);
    }

    @GetMapping("/employees/{age1}/{age2}")
    public List<Employee> retrieveAgeData(@PathVariable int age1,@PathVariable int age2){
        return service.retrieveAge(age1,age2);
    }
    @GetMapping("/employee1/{age}/{page}")
    public List<Employee> retrieveAgeByPagingAndSorting(@PathVariable int age,@PathVariable int page){
        return service.pagingAndSortingByAge(age,page);
    }

}

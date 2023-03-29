package springboot.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    List<Employee> l1 = new ArrayList<>();
    @Autowired
    EmployeeDao ed;

    @GetMapping("/Employee")
    public List<Employee> getEmployee(){
        return l1;
    }



    @PostMapping("/Employee")
    public void addEmployee(@RequestBody Employee e1)
    {
        ed.findAll().forEach(l1::add);
        ed.save(e1);
    }
}

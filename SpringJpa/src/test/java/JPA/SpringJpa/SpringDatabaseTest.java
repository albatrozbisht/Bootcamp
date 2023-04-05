//package JPA.SpringJpa;
//
//import JPA.SpringJpa.Entities.Employee;
//import JPA.SpringJpa.Repository.EmployeeRepository;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class SpringDatabaseTest {
//    @Autowired
//    EmployeeRepository repository;
//    private int count=0;
//
//    @Test
//    public void create(){
//        Employee employee = new Employee();
//        employee.setId(++count);
//        employee.setName("Mohit Bisht");
//        employee.setAge(23);
//        employee.setLocation("Delhi");
//        repository.save(employee);
//    }
//}

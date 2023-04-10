package jpa.springJpa2.repository;

import jpa.springJpa2.entities.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

    @Query("Select firstName,lastName from EmployeeComponent where salary>(Select AVG(salary) from EmployeeComponent)" +
            " order by age,salary desc")
    List<Object[]> findAndSortBySalaryAndAge();


    @Modifying
    @Transactional
    @Query("update EmployeeComponent set salary=:salary where salary<:averageSalary")
    void updateEmployeeBySalary(@Param("salary")long salary,@Param("averageSalary") long averageSalary);


    @Query("Select AVG(salary) from EmployeeComponent")
    public long averageSalary();


    @Modifying
    @Transactional
    @Query("Delete from EmployeeComponent where salary=:minSalary")
    void deleteEmployeeWithMinimumSalary(@Param("minSalary")long minSalary);

    @Query("Select min(salary) from EmployeeComponent")
    public long minSalary();


    @Query(value="select emp_id,emp_first_name,emp_age from employee_table " +
            "where emp_last_name like '%singh'",nativeQuery = true)
    List<Object[]> findEmployeeWithLastName();


    @Query(value="Delete from EmployeeComponent where age>:age",nativeQuery = true)
    void deleteEmployeeByAge(@Param("age")int age);


}

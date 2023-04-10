package jpa.springJpa2.entities;


import jakarta.persistence.*;


@Entity
@Table(name="employeeTable")
public class Employee {

    @Id
    @Column(name="empId")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name="empFirstName")
    private String firstName;

    @Column(name="empLastName")
    private String lastName;

    @Column(name="empSalary")
    private long salary;

    @Column(name="empAge")
    private int age;


    public Employee(int id, String firstName, String lastName, long salary, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.age = age;
    }

    public Employee(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "EmployeeComponent{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}

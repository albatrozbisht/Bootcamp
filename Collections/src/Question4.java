import java.util.HashMap;

public class Question4 {
    public static void main(String[] args){
        Employee e1= new Employee("Mohit",22,"JVM");
        Employee e2= new Employee("Tushar",21,"JVM");
        HashMap<Employee,Integer> map= new HashMap<Employee, Integer>();
        map.put(e1,40000);
        map.put(e2,45000);
        System.out.println(map);
        System.out.println("Salary of "+e1.getName()+" is "+map.get(e1));
    }
}


class Employee{
    private String name,designation;
    private int age;
    Employee(String name, int age, String designation){
        this.name=name;
        this.age=age;
        this.designation=designation;
    }

    public String getName() {
        return name;
    }
}

//Output:
//        {Employee@372f7a8d=40000, Employee@2f92e0f4=45000}
//        Salary of Mohit is 40000

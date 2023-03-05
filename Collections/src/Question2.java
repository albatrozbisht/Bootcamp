import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Question2 {
    public static void main(String[] args){
        ArrayList<employee> e = new ArrayList<>();
        e.add(new employee("Mohit",23,40000));
        e.add(new employee("Tushar",21,45000));
        e.add(new employee("Shashank",22,35000));
        e.add(new employee("Himanshu",24,32000));

        Collections.sort(e,new sortBySalary());
        for(employee emp:e){
            emp.showDetails();
        }
    }
}

class employee implements Comparable<employee>{
    int age;
    double salary;
    String name;
    employee(String name,int age, double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public void showDetails(){
        System.out.println("Name: "+name+" Age: "+age+" Salary: "+salary);
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int compareTo(employee e){
      return this.getName().compareTo(e.getName());
    }
}

class sortBySalary implements Comparator<employee>{
    public int compare(employee e1,employee e2){
        return (int)e1.getSalary()-(int)e2.getSalary();
    }
}


//Output:
//        Name: Himanshu Age: 24 Salary: 32000.0
//        Name: Shashank Age: 22 Salary: 35000.0
//        Name: Mohit Age: 23 Salary: 40000.0
//        Name: Tushar Age: 21 Salary: 45000.0
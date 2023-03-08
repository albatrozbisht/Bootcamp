import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

import static java.util.stream.Collectors.*;

class Employee {
    String fullName;
    Long salary;
    String city;

    public Employee(String fullName, Long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }


    public String getFullName() {
        return fullName;
    }

    public Long getSalary() {
        return salary;
    }

    public String getCity() {
        return city;
    }

}



public class Question5 {
    public static void main(String[] args) {
        ArrayList<Employee> employees= new ArrayList<>();

        String[] full_Name ={"Mohit Singh Bisht","Tushar Singh Ahuja","Ritik Singh Arora","Shashank Singh Kumar",
        "Ritik Singh Jaipur", "Himanshu Singh Varshney","Sarvesh Ramesh Bhagat","Nitin Singh Varshney"};

        Long[] salary ={3300L,4500L,3000L,5001L,6200L,4800L,4900L,5200L};

        String[] city ={"Delhi","Delhi","Punjab","Delhi","Jaipur","Delhi","Delhi","Delhi"};


        for(int i=0;i< city.length;i++){
            employees.add(new Employee(
                    full_Name[i],salary[i],city[i]
            ));
        }


        ArrayList<String> first_name = (ArrayList<String>) employees.stream()
                .filter(e -> e.getSalary() < 5000L)
                .filter(e -> Objects.equals(e.getCity(), "Delhi"))
                .map(e -> e.getFullName().split(" ")[0])
                .collect(toList());

        Iterator<String> it = first_name.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

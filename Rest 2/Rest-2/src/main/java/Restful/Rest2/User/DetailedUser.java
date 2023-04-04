package Restful.Rest2.User;

public class DetailedUser {
    private int id;

    private String first_name;

    private String last_name;


    private int age;

    public DetailedUser(int id, String first_name, String last_name, int age) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
    }

    public DetailedUser(){}

    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "DetailedUser{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", age=" + age +
                '}';
    }
}


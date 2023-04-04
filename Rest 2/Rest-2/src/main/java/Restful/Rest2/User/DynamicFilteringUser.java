package Restful.Rest2.User;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DynamicFilteringUser {
    private int id;



    private String name;


    private String password;
    private int age;

    public DynamicFilteringUser(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public DynamicFilteringUser() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }
}

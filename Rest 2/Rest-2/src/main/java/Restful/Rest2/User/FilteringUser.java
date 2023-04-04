package Restful.Rest2.User;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Service;



public class FilteringUser {
    private int id;


    @JsonProperty("user_name")
    private String name;

    @JsonIgnore
    private String password;
    private int age;

    public FilteringUser(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public FilteringUser() {
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
}
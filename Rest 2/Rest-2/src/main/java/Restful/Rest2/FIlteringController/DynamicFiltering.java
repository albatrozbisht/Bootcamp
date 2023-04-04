package Restful.Rest2.FIlteringController;

import Restful.Rest2.Service.DynamicFilteringUserDao;
import Restful.Rest2.User.DynamicFilteringUser;
import Restful.Rest2.User.FilteringUser;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DynamicFiltering {
    @Autowired
    DynamicFilteringUserDao dynamicFilteringUserDao;

    @GetMapping("/user/dynamic")
    public MappingJacksonValue retrieveAll(){
        return dynamicFilteringUserDao.findAll();
    }

    @GetMapping("/user/dynamic2")
    public MappingJacksonValue retrieveAll1(){
        return dynamicFilteringUserDao.findAll1();
    }

    @PostMapping("/user/dynamic")
    public String addData(@RequestBody DynamicFilteringUser dynamicFilteringUser){
        return dynamicFilteringUserDao.save(dynamicFilteringUser);
    }
}
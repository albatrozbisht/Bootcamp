package Restful.Rest2.Service;

import Restful.Rest2.User.DynamicFilteringUser;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DynamicFilteringUserDao {
    java.util.List<DynamicFilteringUser> List= new ArrayList<DynamicFilteringUser>();


    public MappingJacksonValue findAll(){
        MappingJacksonValue mp =new MappingJacksonValue(List);
        SimpleBeanPropertyFilter myFilter=SimpleBeanPropertyFilter.filterOutAllExcept("id","name","age");
        FilterProvider flr = new SimpleFilterProvider().addFilter("dynamicFilter",myFilter);
        mp.setFilters(flr);
        return mp;
    }

    public MappingJacksonValue findAll1(){
        MappingJacksonValue mp =new MappingJacksonValue(List);
        SimpleBeanPropertyFilter myFilter=SimpleBeanPropertyFilter.filterOutAllExcept("password");
        FilterProvider flr = new SimpleFilterProvider().addFilter("dynamicFilter",myFilter);
        mp.setFilters(flr);
        return mp;
    }

    public String save(DynamicFilteringUser filteringUser){
        List.add(filteringUser);
        return "data added";
    }
}

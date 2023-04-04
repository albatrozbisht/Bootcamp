package Restful.Rest2.FIlteringController;

import Restful.Rest2.Service.StaticFilteringUserDao;
import Restful.Rest2.User.FilteringUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StaticFiltering {

    @Autowired
    StaticFilteringUserDao filteringUserDao;

    @GetMapping("/filtering")
    public List<FilteringUser> retrieveUser(){
        return filteringUserDao.findAll();
    }

    @PostMapping("/filtering")
    public void addUser(@RequestBody FilteringUser filteringUser){
        filteringUserDao.save(filteringUser);
    }
}

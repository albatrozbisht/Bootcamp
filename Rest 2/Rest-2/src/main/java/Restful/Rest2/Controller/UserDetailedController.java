package Restful.Rest2.Controller;




import Restful.Rest2.Service.DetailedUserDao;
import Restful.Rest2.Service.UserDao;
import Restful.Rest2.User.DetailedUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@RestController
public class UserDetailedController {
    @Autowired
    DetailedUserDao detailedUserDao;


    @GetMapping("v2/user")
    public List<DetailedUser> retrieveData(){
        return detailedUserDao.findAll();
    }


    @GetMapping(path = "/user", params = "version2")
    public List<DetailedUser> retrieveData1(){
        return detailedUserDao.findAll();
    }

    @GetMapping(path = "/user/header", headers = "X-API-VERSION=2")
    public List<DetailedUser> retrieveData2(){
        return detailedUserDao.findAll();
    }


    @GetMapping(path = "/user/accept", produces = "application/vnd.company.app-v2+json")
    public List<DetailedUser> retrieveData3(){
        return detailedUserDao.findAll();
    }
}


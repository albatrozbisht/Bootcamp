package Restful.Rest2.Service;

import Restful.Rest2.User.DetailedUser;
import Restful.Rest2.User.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DetailedUserDao {
    static List<DetailedUser> list = new ArrayList<DetailedUser>();
    private static int count = 0;

    static {
        list.add(new DetailedUser(++count, "Mohit",  "Bisht", 23));
        list.add(new DetailedUser(++count, "Shashank","Daksh", 22));
        list.add(new DetailedUser(++count, "Tushar","Ahuja", 22));
        list.add(new DetailedUser(++count, "Himanshu","Varshney", 21));
    }

    public List<DetailedUser> findAll() {
        return list;
    }
}

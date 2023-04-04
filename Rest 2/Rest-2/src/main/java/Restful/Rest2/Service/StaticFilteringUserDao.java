package Restful.Rest2.Service;

import Restful.Rest2.User.FilteringUser;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StaticFilteringUserDao {
    static List<FilteringUser> list = new ArrayList<FilteringUser>();
    private static int count = 0;

    public List<FilteringUser> findAll() {
        return list;
    }

    public void save(FilteringUser filteringUser){
        filteringUser.setId(++count);
        list.add(filteringUser);
    }
}

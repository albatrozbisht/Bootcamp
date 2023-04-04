package Restful.Rest2.Service;



import Restful.Rest2.User.User;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Service
public class UserDao {

    static List<User> list = new ArrayList<User>();
    private static int count = 0;

    static {
        list.add(new User(++count, "Mohit", 23));
        list.add(new User(++count, "Shashank", 22));
        list.add(new User(++count, "Tushar", 22));
        list.add(new User(++count, "Ayush", 21));
    }

    public List<User> findAll() {
        return list;
    }


    public User findOne(int id){
        return list.stream()
                .filter(e->e.getId()==id)
                .findFirst()
                .get();
    }

    public void save(User user){
        user.setId(++count);
        list.add(user);
        System.out.println("Element "+user.getId()+" is added");
    }


    public void remove(int id){
        list.removeIf(e->e.getId()==id);
        System.out.println("Element is deleted");
    }

//    public EntityModel<User> findOneWithLinks(int id){
//        UserDao userDao =new UserDao();
//        User user = userDao.findOne(id);
//        EntityModel<User> entityModel = EntityModel.of(user);
//        WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).findAll());
//        entityModel.add(link.withRel("Users"));
//        return entityModel;
//    }
}
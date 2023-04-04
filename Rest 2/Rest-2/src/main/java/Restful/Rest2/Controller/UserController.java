package Restful.Rest2.Controller;

import Restful.Rest2.Service.UserDao;

import Restful.Rest2.User.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;


@RestController
public class UserController {

    @Autowired
    UserDao userDao;


    @Operation(summary = "Users Details")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Data Received",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = User.class)) }) })
    @GetMapping("/user")
    public List<User> retrieveData(){
        return userDao.findAll();
    }


    @GetMapping("/user/{id}")
    public EntityModel<User> retrieveOne(@PathVariable int id){
        User user = userDao.findOne(id);
        EntityModel<User> entityModel = EntityModel.of(user);
        WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).retrieveData());
        entityModel.add(link.withRel("Users"));
        return entityModel;
    }


    @Operation(summary = "Post Users Details")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Post Successfully.",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = User.class)) }) })
    @PostMapping("/user")
    public void addData(@RequestBody User user){
        userDao.save(user);
    }

    @DeleteMapping("/user/{id}")
    public void deleteData(@PathVariable int id){
        userDao.remove(id);
    }

}

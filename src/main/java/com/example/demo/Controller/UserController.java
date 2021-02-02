package com.example.demo.Controller;

import com.example.demo.Entity.User;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "getUsers")
    public List<User> getUsers(){
    return userService.getUsers();
    }


    @PostMapping(path = "authentification")
    public void authentifierUser(@RequestBody User user){
        userService.authentifier(user);
    }

    @PostMapping(path = "inscription")
    public void registerNewUser(@RequestBody User user){
        userService.inscription(user);
    }

    /*@DeleteMapping(path = "{userId}")
    public void deleteUser(@PathVariable("userId") Long userId){
        userService.deleteUser(userId);
    }*/

    /*@PutMapping(path = "{userId}")
    public void updateUser(
            @PathVariable("userId") Long studentId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email){
        userService.updateUser(userId,name,email);
    }*/
}

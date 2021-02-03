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


    @PostMapping(path = "authentification/{emailUser}/{passwordUser}")
    @ResponseBody
    public User authentifierUser(@PathVariable("emailUser") String emailUser,@PathVariable("passwordUser") String passwordUser){
        return userService.authentifier(emailUser,passwordUser);
    }

    @PostMapping(path = "inscription")
    @ResponseBody
    public User registerNewUser(@RequestBody User user){
        return userService.inscription(user);
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

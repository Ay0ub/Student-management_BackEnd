package com.example.demo.Controller;

import com.example.demo.Entity.Cours;
import com.example.demo.Entity.User;
import com.example.demo.Service.CoursService;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class CoursController {

    private final CoursService coursService;

    @Autowired
    public CoursController(CoursService coursService) {
        this.coursService = coursService;
    }

    @GetMapping(path = "getCourses")
    public List<Cours> getCourses(){
    return coursService.getCourses();
    }

    @GetMapping(path = "{motcleCours}")
    public List<Cours> getCoursesWithMotCle(@PathVariable("motcleCours") String motcleCours){
        return coursService.getCoursesWithMotCle(motcleCours);
    }
    @PostMapping(path = "addcours")
    public void authentifierUser(@RequestBody Cours cours){
        coursService.addCours(cours);
    }

    /*@PostMapping(path = "inscription")
    public void registerNewUser(@RequestBody User user){
        coursService.inscription(user);
    }*/

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

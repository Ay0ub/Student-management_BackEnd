package com.example.demo.Controller;

import com.example.demo.Entity.Absence;
import com.example.demo.Entity.Cours;
import com.example.demo.Service.AbsenceService;
import com.example.demo.Service.CoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class AbsenceController {

    private final AbsenceService absenceService;

    @Autowired
    public AbsenceController(AbsenceService absenceService) {
        this.absenceService = absenceService;
    }

    @GetMapping(path = "getAbsences")
    public List<Absence> getAbsences(){
    return absenceService.getAbsences();
    }

    @PostMapping(path = "prct/{userId}")
    public List<Object> getModulePrctng(@PathVariable("userId") Long userId){
        return absenceService.getModulePrctng(userId);
    }

    //findByprcntAbsence
    /*@PostMapping(path = "authentification")
    public void authentifierUser(@RequestBody User user){
        coursService.authentifier(user);
    }

    @PostMapping(path = "inscription")
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

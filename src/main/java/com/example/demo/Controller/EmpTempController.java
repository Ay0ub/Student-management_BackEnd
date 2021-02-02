package com.example.demo.Controller;

import com.example.demo.Entity.Cours;
import com.example.demo.Entity.EmpTemp;
import com.example.demo.Entity.Semestre;
import com.example.demo.Service.CoursService;
import com.example.demo.Service.EmpTempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class EmpTempController {

    private final EmpTempService empTempService;

    @Autowired
    public EmpTempController(EmpTempService empTempService) {
        this.empTempService = empTempService;
    }

    @GetMapping(path = "getEmpTemp")
    public List<EmpTemp> getEmpTemp(){
    return empTempService.getEmpTemp();
    }

    @GetMapping(path = "getEmp/{idSemestre}")
    public List<EmpTemp> getEmpSemestre(@PathVariable("idSemestre") long idSemestre){
        return empTempService.getEmpSemestre(idSemestre);
    }
    /*@PostMapping(path = "addcours")
    public void authentifierUser(@RequestBody Cours cours){
        empTempService.addCours(cours);
    }*/

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

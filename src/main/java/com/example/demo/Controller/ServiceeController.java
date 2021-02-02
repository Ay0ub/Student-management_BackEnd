package com.example.demo.Controller;

import com.example.demo.Entity.Cours;
import com.example.demo.Entity.Servicee;
import com.example.demo.Service.ServiceeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class ServiceeController {

    private final ServiceeService serviceeService;

    @Autowired
    public ServiceeController(ServiceeService serviceeService) {
        this.serviceeService = serviceeService;
    }

    @GetMapping(path = "getServices")
    public List<Servicee> getServices(){
    return serviceeService.getServices();
    }

    @PostMapping(path = "insertService")
    public void insertService(@RequestBody Servicee servicee){
        serviceeService.insertService(servicee);
    }

    @PutMapping(path = "{idService}")
    public void updatetatService(@PathVariable("idService") long idService){
            serviceeService.updatetatService(idService);
    }


    /*@PutMapping(path = "{userId}")
    public void updateUser(
            @PathVariable("userId") Long studentId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email){
        userService.updateUser(userId,name,email);
    }*/
}

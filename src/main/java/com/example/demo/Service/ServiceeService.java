package com.example.demo.Service;

import com.example.demo.Entity.Servicee;
import com.example.demo.Entity.User;
import com.example.demo.Repository.ServiceeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ServiceeService {

    private final ServiceeRepository serviceerepository;

    @Autowired
    public ServiceeService(ServiceeRepository servicerepository) {
        this.serviceerepository = servicerepository;
    }


    public List<Servicee> getServices() {
        return serviceerepository.findAll();
    }
///////////////////////////////////////


    public void insertService(Servicee servicee) {
        serviceerepository.save(servicee);
    }
///////////////////////////////////////////

    @Transactional
    public void updatetatService(long idService) {

        Servicee servicee = serviceerepository.findById(idService).orElseThrow(()->new IllegalStateException("id doesnt exist to update"));
       /* if (name != null && name.length()>0 && !Objects.equals(student.getName(),name))
        {
            student.setName(name);
        }
        if (email != null && email.length()>0 && !Objects.equals(student.getEmail(),email))
        {
            Optional<Student> studentOptional = studentrepository.findStudentByEmail(email);
            if (studentOptional.isPresent())
            {
                throw new IllegalStateException("email is taken");
            }*/
            servicee.setEtatService("accepter");
        //}

        //servicee.setEtatService("accepter");
        //Optional<Servicee> studentOptional = serviceerepository.findOne(servicee);
    }


        /*Optional<Servicee> studentOptional = studentrepository.findStudentByEmail(email);
        if (studentOptional.isPresent())
        {
            throw new IllegalStateException("email is taken");
        }*/


}

package com.example.demo.Service;

import com.example.demo.Entity.Servicee;
import com.example.demo.Repository.ServiceeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceeService {

    private final ServiceeRepository serviceerepository;

    @Autowired
    public ServiceeService(ServiceeRepository servicerepository) {
        this.serviceerepository = servicerepository;
    }


    public List<Object> getServices() {
        return serviceerepository.findByallservices();
    }
///////////////////////////////////////


    public void insertService(Servicee servicee) {
        serviceerepository.save(servicee);
    }
///////////////////////////////////////////

    public List<Servicee> getServicebyStudent(long idUser) {
        return serviceerepository.findByserviceuser(idUser);
    }

    @Transactional
    public void updatetatService(long idService, String etatService) {

        Servicee servicee = serviceerepository.findById(idService).orElseThrow(()->new IllegalStateException("id doesnt exist to update"));
            servicee.setEtatService(etatService);
    }


        /*Optional<Servicee> studentOptional = studentrepository.findStudentByEmail(email);
        if (studentOptional.isPresent())
        {
            throw new IllegalStateException("email is taken");
        }*/


}

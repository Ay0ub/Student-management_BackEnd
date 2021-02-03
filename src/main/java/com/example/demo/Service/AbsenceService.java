package com.example.demo.Service;

import com.example.demo.Entity.Absence;
import com.example.demo.Repository.AbsenceRepository;
import com.example.demo.Repository.CoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbsenceService {

    private final AbsenceRepository absenceRepository;

    @Autowired
    public AbsenceService(AbsenceRepository absenceRepository) {
        this.absenceRepository = absenceRepository;
    }

    public List<Absence> getAbsences() {
        return absenceRepository.findAll();
    }
///////////////////////////////////////

    public List<Object> getModulePrctng(long idUser) {
        return absenceRepository.findByprcntAbsence(idUser);
    }
///////////////////////////////////////////

    ///////////////////////////////////////

    /*public void inscription(User user) {
        userrepository.save(user);
    }*/
///////////////////////////////////////////

    /*public void deleteStudent(Long studentId) {
        boolean exist = userrepository.existsById(studentId);
        if(!exist){
            throw new IllegalStateException("Id doesnt exists");
        }
        userrepository.deleteById(studentId);
    }*/

    /*@Transactional
    public void updateStudent(Long studentId, String name, String email) {
        User user = userrepository.findById(studentId).orElseThrow(()->new IllegalStateException("id doesnt exist to update"));
        if (name != null && name.length()>0 && !Objects.equals(user.getName(),name))
        {
            user.setName(name);
        }
        if (email != null && email.length()>0 && !Objects.equals(user.getEmail(),email))
        {
            Optional<User> studentOptional = studentrepository.findStudentByEmail(email);
            if (studentOptional.isPresent())
            {
                throw new IllegalStateException("email is taken");
            }
            user.setEmail(email);
        }
    }*/
}

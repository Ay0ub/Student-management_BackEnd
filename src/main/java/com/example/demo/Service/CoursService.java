package com.example.demo.Service;

import com.example.demo.Entity.Cours;
import com.example.demo.Entity.User;
import com.example.demo.Repository.CoursRepository;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoursService {

    private final CoursRepository coursRepository;

    @Autowired
    public CoursService(CoursRepository coursRepository) {
        this.coursRepository = coursRepository;
    }

    public List<Cours> getCourses() {
        return coursRepository.findAll();
    }
///////////////////////////////////////

    public List<Cours> getCoursesWithMotCle(String motcle) {
        return coursRepository.findByMotcle(motcle);
    }
///////////////////////////////////////////

    public void addCours(Cours cours) {
        coursRepository.save(cours);
    }
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

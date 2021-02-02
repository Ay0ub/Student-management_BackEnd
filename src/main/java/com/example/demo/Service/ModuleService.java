package com.example.demo.Service;

import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModuleService {

    private final UserRepository userrepository;

    @Autowired
    public ModuleService(UserRepository studentrepository) {
        this.userrepository = studentrepository;
    }


    public List<User> getUsers() {
        return userrepository.findAll();
    }
///////////////////////////////////////

    public void authentifier(User user) {
        Optional<User> userbyEmail = userrepository.findUserByEmailUser(user.getEmailUser());
        if (userbyEmail.isPresent()) {
            System.out.println("go to page home");
        }
        else System.out.println("return to login page");
    }
///////////////////////////////////////////

    ///////////////////////////////////////

    public void inscription(User user) {
        userrepository.save(user);
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

package com.example.demo.Service;

import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userrepository;

    @Autowired
    public UserService(UserRepository studentrepository) {
        this.userrepository = studentrepository;
    }


    public List<User> getUsers() {
        return userrepository.findAll();
    }
///////////////////////////////////////

    //@ResponseBody
    public User authentifier(String emailUser, String passwordUser) {
        //Optional<User> userbyEmail = userrepository.findUserByEmailUser(user.getEmailUser());
        return userrepository.findByemilpass(emailUser,passwordUser);
        //Optional<User> userbyidd = userrepository.findById(user.getIdUser());

        /*if (user==null) {
           // throw new IllegalStateException("Id doesnt exists");
            return null;
        }
        else return user;*/
    }
///////////////////////////////////////////

    ///////////////////////////////////////
    //@ResponseBody
    public User inscription(User user) {
        userrepository.save(user);
        return user;
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

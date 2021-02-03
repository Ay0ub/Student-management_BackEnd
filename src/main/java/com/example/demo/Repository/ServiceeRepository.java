package com.example.demo.Repository;

import com.example.demo.Entity.Servicee;
import com.example.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ServiceeRepository extends JpaRepository<Servicee,Long> {

    //Optional<User> findUserByEmailUser(String Email_user);
    @Query("SELECT s FROM Servicee s where s.idUser= ?1")
    List<Servicee> findByserviceuser(long idUser);

    @Query("SELECT u.nameUser,s.idService,s.nameService,s.dateService,s.etatService FROM Servicee s, User u where s.idUser= u.idUser")
    List<Object> findByallservices();
}

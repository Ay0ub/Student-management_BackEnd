package com.example.demo.Repository;

import com.example.demo.Entity.Servicee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ServiceeRepository extends JpaRepository<Servicee,Long> {

    //Optional<User> findUserByEmailUser(String Email_user);
}

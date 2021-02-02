package com.example.demo.Repository;

import com.example.demo.Entity.Cours;
import com.example.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
public interface CoursRepository extends JpaRepository<Cours,Long> {

    @Query("SELECT c FROM Cours c where c.motcleCours like %?1%")
    List<Cours> findByMotcle(String motcle) ;
}

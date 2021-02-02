package com.example.demo.Repository;

import com.example.demo.Entity.Absence;
import com.example.demo.Entity.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AbsenceRepository extends JpaRepository<Absence,Long> {

    //Optional<Cours> findUserBy(String Email_user);
    @Query("SELECT b.nameModule,((count(a))/b.nbrSeance)*100 FROM Absence a, Module b where a.idModule= ?1 and b.idModule= ?1  and a.idUser= ?2")
    List<Object> findByprcntAbsence(long idmodule,long iduser) ;
}

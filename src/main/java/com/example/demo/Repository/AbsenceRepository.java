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
   /* @Query("SELECT b.nameModule,((count(a))/b.nbrSeance)*100 FROM User u, Absence a, Module b " +
            "where a.idUser= 1 and u.idUser=a.idUser and a.idModule=b.idModule")*/
    @Query("SELECT m.nameModule,((count(a))/m.nbrSeance)*100 FROM Absence a, Module m " +
            "where a.idUser= ?1 and a.idModule=m.idModule GROUP BY a.idModule")
    List<Object> findByprcntAbsence(long iduser) ;
}

    /*SELECT m.name_module, ((count(a.id_absence))/m.nbr_seance)*100
        FROM Absence a , module m
where a.id_user=1 and a.id_module= m.id_module;*/

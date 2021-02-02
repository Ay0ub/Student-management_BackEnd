package com.example.demo.Repository;

import com.example.demo.Entity.Note;
import com.example.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NoteRepository extends JpaRepository<Note,Long> {

    @Query("SELECT m.nameModule, n.Note FROM Note n, Semestre s, Module m where n.idUser= ?1 and s.idSemestre= ?2 and s.idModule=m.idModule")
    List<Object> findBynoteModule(long idSemestre, long iduser) ;
}

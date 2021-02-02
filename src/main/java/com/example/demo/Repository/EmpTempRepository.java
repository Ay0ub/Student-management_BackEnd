package com.example.demo.Repository;

import com.example.demo.Entity.Cours;
import com.example.demo.Entity.EmpTemp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpTempRepository extends JpaRepository<EmpTemp,Long> {

    @Query("SELECT e FROM EmpTemp e where e.idSemestre = ?1")
    List<EmpTemp> findByEmpSemestre(long idSemestre);
}

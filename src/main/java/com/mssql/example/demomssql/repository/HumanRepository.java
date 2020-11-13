package com.mssql.example.demomssql.repository;

import com.mssql.example.demomssql.model.Human;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface HumanRepository extends JpaRepository<Human, Integer> {
    Human findByHumanName(String name);

}

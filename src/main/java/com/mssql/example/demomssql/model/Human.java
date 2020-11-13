package com.mssql.example.demomssql.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "Human")
public class Human {
    @Id

    private Integer humanId;

    private String humanName;
}

package org.scesi.example.clases;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "subject")
@Data
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
}

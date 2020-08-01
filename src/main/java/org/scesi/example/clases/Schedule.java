package org.scesi.example.clases;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "schedule")
@Data
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String teacher;
    @OneToMany(mappedBy = "schedule")
    private Set<SchedulePeriod> periods;
}

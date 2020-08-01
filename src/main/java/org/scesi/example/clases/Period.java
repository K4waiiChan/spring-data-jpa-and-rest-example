package org.scesi.example.clases;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "period")
@Data
public class Period {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String start;
    private String end;
    @OneToMany(mappedBy = "period")
    private Set<SchedulePeriod> schedules;
}

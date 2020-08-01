package org.scesi.example.clases;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "schedule_period")
@Data
public class SchedulePeriod {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String classroom;
    @ManyToOne
    @JoinColumn(name = "schedule_id", nullable = false)
    private Schedule schedule;
    @ManyToOne
    @JoinColumn(name = "period_id", nullable = false)
    private Period period;
}

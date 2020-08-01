package org.scesi.example.clases;

import lombok.Data;

import java.util.ArrayList;

@Data
public class ScheduleDAO {
    private ArrayList<PeriodDAO> periods;
    private String teacher;
}

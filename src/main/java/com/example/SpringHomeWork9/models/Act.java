package com.example.SpringHomeWork9.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Act {

    private int id;
    private String reportingPeriod;
    private String projectSection;
    private double price;
    private String status;

}



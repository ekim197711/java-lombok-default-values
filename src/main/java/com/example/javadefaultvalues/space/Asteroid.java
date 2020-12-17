package com.example.javadefaultvalues.space;

import lombok.Data;

@Data
public class Asteroid {
    private Integer diameter;
    private Integer weight;

    Asteroid(Integer diameter, Integer weight) {
        this.diameter = diameter;
        this.weight = weight;
    }
}

package com.example.javadefaultvalues.space;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SpaceShip {
    private String model;
    @Builder.Default
    private String captain="Mike";
    @Builder.Default
    private Integer fuel=33;
}




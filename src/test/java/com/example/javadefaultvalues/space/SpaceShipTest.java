package com.example.javadefaultvalues.space;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpaceShipTest {

    @Test
    void tryStuff(){
        SpaceShip spaceShip = new SpaceShip();
        System.out.println(spaceShip);

        SpaceShip spaceShip2 = SpaceShip.builder()
                .captain("Susan")
                .build();
        System.out.println(spaceShip2);
    }

    @Test
    void tryToBuilder(){
        SpaceShip spaceShip = new SpaceShip("Round", "Morten", 99);
        System.out.println(spaceShip);

        SpaceShip.SpaceShipBuilder spaceShipBuilder = spaceShip.toBuilder();

        System.out.println(spaceShipBuilder.model("Pyramid").build());
        System.out.println(spaceShipBuilder.model("Box").build());
        System.out.println(spaceShipBuilder.model("Flying sourcer").build());
        System.out.println(spaceShipBuilder.model("Weird").captain("Mike").build());
    }

}
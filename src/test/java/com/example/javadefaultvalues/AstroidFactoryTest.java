package com.example.javadefaultvalues;

import com.example.javadefaultvalues.space.Asteroid;
import com.example.javadefaultvalues.space.AstroidFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AstroidFactoryTest {

    @Test
    void gimmeAstroid() {
        Asteroid asteroid = AstroidFactory.gimmeAstroid();
        asteroid.setWeight(110);
        System.out.println(asteroid);

    }
}
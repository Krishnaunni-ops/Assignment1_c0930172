package com.example.Assignment1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DogTest {

    @Test
    void testDogInitialization() {
        Dog dog = new Dog("Rock", 5);
        assertEquals("Rock", dog.getName());
        assertEquals(5, dog.getAge());
    }

    @Test
    void testSetName() {
        Dog dog = new Dog("John", 5);
        dog.setName("Heidi");
        assertEquals("Heidi", dog.getName());
    }
}

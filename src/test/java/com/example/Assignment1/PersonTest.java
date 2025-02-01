package com.example.Assignment1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    void testPersonWithoutDog() {
        Person person = new Person("Krishna", 30);
        assertFalse(person.getDog().isPresent());
    }

    @Test
    void testPersonWithDog() {
        Dog dog = new Dog("Peter", 5);
        Person person = new Person("Bob", 40, dog);
        assertTrue(person.getDog().isPresent());
        assertEquals("Peter", person.getDog().get().getName());
    }

    @Test
    void testHasOldDog() {
        Dog oldDog = new Dog("gumm", 12);
        Person person = new Person("Robert", 45, oldDog);
        assertTrue(person.hasOldDog());

        Dog youngDog = new Dog("Pitha", 4);
        Person person2 = new Person("Sophia", 29, youngDog);
        assertFalse(person2.hasOldDog());
    }

    @Test
    void testChangeDogsNameSuccess() {
        Dog dog = new Dog("Scar", 6);
        Person person = new Person("Yulen", 30, dog);
        person.changeDogsName("Rocky");
        assertEquals("Rocky", person.getDog().get().getName());
    }

    @Test
    void testChangeDogsNameFailure() {
        Person person = new Person("Michael", 40);
        RuntimeException exception = assertThrows(RuntimeException.class, () -> person.changeDogsName("Rex"));
        assertEquals("Michael does not own a dog!", exception.getMessage());
    }
}

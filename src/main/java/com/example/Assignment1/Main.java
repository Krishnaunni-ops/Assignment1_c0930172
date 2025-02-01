package com.example.Assignment1;

public class Main {
    public static void main(String[] args) {
        // Creating a person without a dog
        Person personWithoutDog = new Person("Lisaa", 28);

        // Trying to change the name of a non-existent dog (should throw an exception)
        try {
            personWithoutDog.changeDogsName("Buddy");
        } catch (RuntimeException e) {
            System.out.println("Unable to change dog's name: " + e.getMessage());
        }

        // Creating a person with a dog
        Dog dog = new Dog("Charlie", 5);
        Person personWithDog = new Person("Bob", 40, dog);

        // Displaying initial details
        System.out.println("\nPerson Details:");
        System.out.println("Name: " + personWithDog.getName());
        System.out.println("Age: " + personWithDog.getAge());
        System.out.println("Dog's Name: " + personWithDog.getDog().get().getName());
        System.out.println("Dog's Age: " + personWithDog.getDog().get().getAge());

        // Changing the dog's name
        personWithDog.changeDogsName("Rocky");
        System.out.println("\nAfter changing dog's name:");
        System.out.println("Dog's Name: " + personWithDog.getDog().get().getName());
    }
}

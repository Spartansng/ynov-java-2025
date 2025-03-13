package fr.ynov.java.medium;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    String name;
    //int age;
    LocalDate birthdate;
    String gender;
    float height;
    float weight;
    Nationality nationality;

    public enum Nationality {
        nationality1, nationality2, nationality3, nationality4, nationality5
    }

    public Person(String name, /*int age*/ LocalDate birthdate, String gender, float height, float weight, Nationality nationality) {
        this.name = name;
        //this.age = age;
        this.birthdate = birthdate;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
    }
    public int calculateAge() {
        return Period.between(this.birthdate, LocalDate.now()).getYears();
    }
    public void displayInfo() {
        System.out.println("Nom : " + name);
        System.out.println("Âge : " + calculateAge() + " ans");
        System.out.println("Genre : " + gender);
        System.out.println("Taille : " + height + "m");
        System.out.println("Poids : " + weight + "kg");
        System.out.println("Nationalité : " + nationality);
    }

    public static void main(String[] args) {
        Person p1 = new Person("nom", LocalDate.of(2000, 1, 1), "Femme", 1.68f, 60.5f, Nationality.nationality3);

        // Display of information
        p1.displayInfo();
    }
}
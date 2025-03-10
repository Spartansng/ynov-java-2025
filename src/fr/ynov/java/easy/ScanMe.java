package fr.ynov.java.easy;

import java.util.Scanner;

public class ScanMe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer votre nom :");
        String nom = sc.nextLine();

        System.out.println("Veuillez entrer votre age :");
        int age = sc.nextInt();

        System.out.println("Bonjour : "+nom+", vous avez "+age);
    }
}

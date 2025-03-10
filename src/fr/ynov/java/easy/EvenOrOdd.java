package fr.ynov.java.easy;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer un chiffre :");
        int chiffre = sc.nextInt();
        if (chiffre % 2 == 0) {
            System.out.println("Le chiffre est even");
        }else {
            System.out.println("Le chiffre odd");
        }
    }
}

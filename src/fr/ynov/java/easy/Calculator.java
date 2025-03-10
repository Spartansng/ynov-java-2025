package fr.ynov.java.easy;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le premier nombre: ");
        int nombre1 = sc.nextInt();

        sc.nextLine();

        System.out.println("Entrer un operateur: ");
        String operateur = sc.nextLine();

        System.out.println("Entrez le second nombre: ");
        int nombre2 = sc.nextInt();

        int resultat = 0;
        if (operateur.equals("+")) {
            resultat = nombre1 + nombre2;
            System.out.println("Votre résultat est " + resultat);
        } else if (operateur.equals("-")) {
            resultat = nombre1 - nombre2;
            System.out.println("Votre résultat est " + resultat);
        } else if (operateur.equals("*")) {
            resultat = nombre1 * nombre2;
            System.out.println("Votre résultat est " + resultat);
        } else if (operateur.equals("/")) {
            if (nombre2 == 0) {
                System.out.println("On ne peut pas diviser un nombre par 0");
            } else {
                resultat = nombre1 / nombre2;
                System.out.println("Votre résultat est " + resultat);
            }
        }
    }
}

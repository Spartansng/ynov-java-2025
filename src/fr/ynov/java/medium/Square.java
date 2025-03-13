package fr.ynov.java.medium;

import java.util.Scanner;

public class Square {
    public static int carre(int nombre) {
        return nombre * nombre;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez un nombre");
        int nombre = sc.nextInt();

        int resultat = carre(nombre);
        System.out.println("Le carré de " + nombre + " est " + resultat);
    }
}

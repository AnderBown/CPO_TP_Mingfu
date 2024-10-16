
/*
 * TP1 - Manipulation de nombres entiers
 * Sun Mingfu
 */

package com.mycompany.tp1_manipnombresint_mingfu_tricca;

import java.util.Scanner;

/**
 *
 * @author AnderBown
 */
public class TP1_manipNombresInt_MINGFU_TRICCA {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Demande des entiers
        System.out.print("Veuillez entrer le premier nombre entier : ");
        int nombre1 = scanner.nextInt();

        System.out.print("Veuillez entrer le second nombre entier : ");
        int nombre2 = scanner.nextInt();

        // Affichage des deux nombres saisis
        System.out.println("Vous avez saisi : " + nombre1 + " et " + nombre2);

        // Calcul et affichage de la somme, la différence, et le produit
        int somme = nombre1 + nombre2;
        int difference = nombre1 - nombre2;
        int produit = nombre1 * nombre2;

        System.out.println("Somme : " + somme);
        System.out.println("Difference : " + difference);
        System.out.println("Produit : " + produit);

        // Calcul et affichage du quotient entier et du reste de la division euclidienne
        if (nombre2 != 0) { // Vérification pour éviter la division par zéro
            int quotient = nombre1 / nombre2;
            int reste = nombre1 % nombre2;

            System.out.println("Quotient entiere : " + quotient);
            System.out.println("Reste de la division euclidienne : " + reste);
        } else {
            System.out.println("Division par zéro non autorisée.");
        }

        scanner.close();
    }
}

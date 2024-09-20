/*
 * TP1 Exercice 1
 * 17/09/2024
 */

package com.mycompany.exo2;

import java.util.Scanner;

/**
 *
 * @author AnderBown
 */
public class Exo2 {

    public static void main(String[] args) {
        
        //Declaration des variables
        int nb; // nombre dentiers a additionner
        int result; // resultat
        int ind; //indice

        result=0;
        //nb=5;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        nb=sc.nextInt(); // On demande a sc de donner le prochain entier

        // Addition des nb premiers entiers
        ind=1;
        
        while (ind <= nb) {
            result=result+ind; 
        // Affichage du resultat
        ind = ind + 1;
        }
        
        System.out.println();
        System.out.println("La somme des "+ nb + "entiers est: "+result); 
    }
}
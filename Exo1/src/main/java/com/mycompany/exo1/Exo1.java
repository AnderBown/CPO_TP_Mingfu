/*
 * TP0 Exercice 1
 * 17/09/2024
 */

package com.mycompany.exo1;

import java.util.Scanner;

/**
 *
 * @author AnderBown
 */
public class Exo1 {

    public static void main(String[] args) {
        System.out.println("Bonjour");
        int variable = 20;
        variable = variable + 15;
        System.out.println(variable);
        
        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour, quel est votre prenom ?");
        prenom = sc.nextLine(); 
    }
}

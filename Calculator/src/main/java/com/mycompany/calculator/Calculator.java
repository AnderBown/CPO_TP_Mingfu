/*
 * Calculette
 */

package com.mycompany.calculator;

import java.util.Scanner;

/**
 *
 * @author AnderBown
 */
public class Calculator {

    public static void main(String[] args) {
        
        int resultat = 0;
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the operator:\n1) add\n2) substract\n3) multiply\n4) divide\n5) modulo");
        System.out.println();
        int operateur = sc.nextInt();
        System.out.println("Please enter the first number:");
        int operande1 = sc.nextInt();
        System.out.println("Please enter the second number:");
        int operande2 = sc.nextInt();
        
        if (operateur == 1){
            resultat = operande1 + operande2;
            System.out.println("The result is : " + resultat);
        }
        else if (operateur == 2){
            resultat = operande1 - operande2;
            System.out.println("The result is : " + resultat);
        }
        else if (operateur == 3){
            resultat = operande1 * operande2;
            System.out.println("The result is : " + resultat);
        }
        else if (operateur == 4){
            resultat = operande1 / operande2;
            System.out.println("The result is : " + resultat);
        }
        else {
            System.out.println("Please enter a value of the operatorfrom 1 to 5");
        }
            
    }
}

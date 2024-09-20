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
        int operateur = sc.nextInt();
        if (operateur > 5){
            System.out.println("Please enter a value of the operatorfrom 1 to 5");
        }
        else if (operateur < 1){
            System.out.println("Please enter a value of the operatorfrom 1 to 5");
        }
        else {
            System.out.println("Please enter the first number:");
            int operande1 = sc.nextInt();
            System.out.println("Please enter the second number:");
            int operande2 = sc.nextInt();
        
            switch (operateur) {
                case 1:
                    resultat = operande1 + operande2;
                    System.out.println("The result is : " + resultat);
                    break;
                case 2:
                    resultat = operande1 - operande2;
                    System.out.println("The result is : " + resultat);
                    break;
                case 3:
                    resultat = operande1 * operande2;
                    System.out.println("The result is : " + resultat);
                    break;
                case 4:
                    resultat = operande1 / operande2;
                    System.out.println("The result is : " + resultat);
                    break;
                case 5:
                    resultat = operande1 % operande2;
                    System.out.println("The result is : " + resultat);
                    break;
                default:
                    break;
            }
        }      
    }
}

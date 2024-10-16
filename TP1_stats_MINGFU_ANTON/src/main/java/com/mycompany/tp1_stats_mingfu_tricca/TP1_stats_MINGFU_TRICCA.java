/*
 * TP1 - stats
 *
 * Sun Mingfu
 */

package com.mycompany.tp1_stats_mingfu_tricca;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author AnderBown
 */
public class TP1_stats_MINGFU_TRICCA {

    public static void main(String[] args) {
        
        Random generateurAleat = new Random();

        int[] distribution = new int[6];

        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez saisir un nombre entier m : ");
        int m = scanner.nextInt();

        for (int i = 0; i < m; i++) {
            int lance = generateurAleat.nextInt(6); 
            distribution[lance]++; 
        }

        System.out.println("Distribution des resultats :");
        for (int i = 0; i < distribution.length; i++) {
            System.out.println("Face " + (i + 1) + ": " + distribution[i] + " fois");
        }

        System.out.println("\nPourcentages des resultats :");
        for (int i = 0; i < distribution.length; i++) {
            double pourcentage = ((double) distribution[i] / m) * 100;
            System.out.printf("Face %d: %.2f%%\n", (i + 1), pourcentage);
        }

        scanner.close();
    }
}

/*
 * TP1
 */

/**
 *
 * @author AnderBown
 */

import java.util.Random;
import java.util.Scanner;

public class TP1_guessMyNumber_MINGFU_ANTON {

    public static void main(String[] args) {
        // TODO code application logic here
        int NbTour = 0;
        int mode = 0;
        int result = 0;
        int diff = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                           Mode de jeu:
                           1) Facile
                           2) Normal
                           3) Cauchemar
                           """);
        mode =sc.nextInt();
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100);
        System.out.println(n);
        while (result != n) 
        {
        result =sc.nextInt();
                if (result < n)
                {
                     diff = n - result;
                        if ((diff > 20) && (mode == 1)) 
                        {
                            System.out.println("Bien trop Bas!");
                        }
                        else if (mode == 3)
                        {
                            int luck = generateurAleat.nextInt(100);
                            if (luck >30)
                            {
                                System.out.println("trop Bas");
                            }
                            else 
                            {
                            System.out.println("trop Haut");
                            }
                        }
                        else 
                        {
                            System.out.println("trop Bas");
                        }
                    NbTour = NbTour + 1;
                }
                if (result > n)
                {
                    diff = result - n;
                        if ((diff > 20) && (mode == 1)) 
                        {
                            System.out.println("Bien trop Haut!");
                        }
                        else if (mode == 3)
                        {
                            int luck = generateurAleat.nextInt(100);
                            if (luck >30)
                            {
                                System.out.println("trop Haut");
                            }
                            else 
                            {
                            System.out.println("trop Bas");
                            }
                        }
                        else 
                        {
                            System.out.println("trop Haut");
                        }
                    NbTour = NbTour + 1;
                } 
            
            if (result == n)
            { 
            System.out.println("Bonne reponse!!!!!!!!!!!!!!!!!");
            NbTour = NbTour + 1;
            }
        }
        {
        System.out.print("Vous avez trouve la bonne reponse en ");
        System.out.print(NbTour);
        System.out.println(" tours, Bravo!");
                }
    }
}

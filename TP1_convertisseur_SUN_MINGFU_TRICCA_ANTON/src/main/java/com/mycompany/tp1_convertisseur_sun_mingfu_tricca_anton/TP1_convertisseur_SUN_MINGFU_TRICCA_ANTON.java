/*
 * TP1 Temperature
 * Sun Mingfu et TRICCA ANTON
 */

package com.mycompany.tp1_guessmynumber_sun_mingfu;
import java.util.Scanner;

/**
 *
 * @author AnderBown
 */
public class TP1_guessMyNumber_SUN_MINGFU {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bonjour, saisissez une valeur de temperature : ");
        double temperature = scanner.nextDouble();

        // Affichage du menu
        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celcius vers Kelvin");
        System.out.println("2) De Kelvin vers Celcius");
        System.out.println("3) De Farenheit vers Celcius");
        System.out.println("4) De Celcius vers Farenheit");
        System.out.println("5) De Kelvin vers Farenheit");
        System.out.println("6) De Farenheit vers Kelvin");

        int choix = scanner.nextInt();

        double resultat = 0;

        switch (choix) {
            case 1:
                resultat = CelciusVersKelvin(temperature);
                System.out.println(temperature + " degre Celcius est egal a " + resultat + " degres Kelvin.");
                break;
            case 2:
                resultat = KelvinVersCelcius(temperature);
                System.out.println(temperature + " degre Kelvin est egal a " + resultat + " degres Celcius.");
                break;
            case 3:
                resultat = FarenheitVersCelcius(temperature);
                System.out.println(temperature + " degre Farenheit est egal a " + resultat + " degres Celcius.");
                break;
            case 4:
                resultat = CelciusVersFarenheit(temperature);
                System.out.println(temperature + " degre Celcius est egal a " + resultat + " degres Farenheit.");
                break;
            case 5:
                resultat = KelvinVersFarenheit(temperature);
                System.out.println(temperature + " degre Kelvin est egal a " + resultat + " degres Farenheit.");
                break;
            case 6:
                resultat = FarenheitVersKelvin(temperature);
                System.out.println(temperature + " degre Farenheit est égal a " + resultat + " degres Kelvin.");
                break;
            default:
                System.out.println("Choix invalide.");
        }

        scanner.close();
    }

    public static double CelciusVersKelvin(double tCelcius) {
        return tCelcius + 273.15;
    }

    public static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 273.15;
    }

    public static double FarenheitVersCelcius(double tFarenheit) {
        return (tFarenheit - 32) * 5 / 9;
    }

    public static double CelciusVersFarenheit(double tCelcius) {
        return (tCelcius * 9 / 5) + 32;
    }

    public static double KelvinVersFarenheit(double tKelvin) {
        return CelciusVersFarenheit(KelvinVersCelcius(tKelvin));
    }

    public static double FarenheitVersKelvin(double tFarenheit) {
        return CelciusVersKelvin(FarenheitVersCelcius(tFarenheit));
    }
}

/*
 * TP2
 * 
 */
package com.mycompany.tp2_bieres_mingfu_anton;

/**
 *
 * @author AnderBown
 */
public class BouteilleBiere {
    

    String nom;        
    double degreAlcool;  
    String brasserie;  
    boolean ouverte;     


    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom +" (" + degreAlcool +
    " degres) \nBrasserie : " + brasserie ) ;
    }
    
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
    nom = unNom;
    degreAlcool = unDegre;
    brasserie = uneBrasserie;
    ouverte = false;
    }
    
    public boolean Decapsuler() {
        if (!ouverte) {
           ouverte = true;  
           return true;    
        } else {
            return false;  
        }
    }
    
    
    @Override
    public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = nom + " (" + degreAlcool + " degres) Ouverte ? ";
    if (ouverte == true ) chaine_a_retourner += "oui" ;
    else chaine_a_retourner += "non" ;
    return chaine_a_retourner ;
    }
    
}



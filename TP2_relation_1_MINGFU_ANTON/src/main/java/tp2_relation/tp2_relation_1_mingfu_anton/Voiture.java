/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation.tp2_relation_1_mingfu_anton;

/**
 *
 * @author AnderBown
 */
public class Voiture {
    
    String Modele;        
    String Marque;  
    int PuissanceCV;
    Personne Proprietaire ;
    
    public Voiture(String Nom, String unmarque, int puissance) {
        Modele = Nom;
        Marque = unmarque;
        PuissanceCV = puissance;
        Proprietaire = null;
    }
    
    @Override
    public String toString() {
        return Modele + " " + Marque + " " + PuissanceCV;
    }
}
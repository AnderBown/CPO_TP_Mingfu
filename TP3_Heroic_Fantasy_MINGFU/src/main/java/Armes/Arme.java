package Armes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnderBown
 */
public class Arme {
    private String nom; 
    private int niveauAttaque; 

  
    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        setNiveauAttaque(niveauAttaque); 
    }

    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    public String getNom() {
        return nom;
    }

    public void setNiveauAttaque(int niveauAttaque) {
        if (niveauAttaque <= 100) {
            this.niveauAttaque = niveauAttaque;
        } else {
            throw new IllegalArgumentException("Le niveau d'attaque doit etre <= 100.");
        }
    }

    @Override
    public String toString() {
        return "Arme: " + nom + ", Niveau d'attaque: " + niveauAttaque;
    }
}

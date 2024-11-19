package Personnages;

import Armes.Baton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnderBown
 */
public class Magicien extends Personnage {
    private boolean confirme;

    public Magicien(String nom, int niveauDeVie, boolean confirme) {
        super(nom, niveauDeVie);
        this.confirme = confirme;
        
        nbMagiciens++;
    }
    
    /*
    public void finalize() throws Throwable {
        super.finalize();
        System.out.println("Un magicien a été détruit.");
    }
    */
    public boolean isConfirme() {
        return confirme;
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }
    
    /*
    @Override
    public void attaquer(Personnage cible) {
        System.out.println(this.getNom() + " attaque " + cible.getNom() + " et inflige 20 points de degats !");
        cible.estAttaque(20);
    }
    */
    
     @Override
    public void attaquer(Personnage cible) {
        int dommages = obtenirDommagesDeLArme();
        if (armeEnMain instanceof Baton) {
            dommages *= ((Baton) armeEnMain).getAge();
        }

        // Réduction si le magicien est confirmé
        if (confirme) {
            dommages /= 2;
        }

        // Se fatiguer et appliquer les dommages
        seFatiguer();
        System.out.println(getNom() + " attaque " + cible.getNom() + " et inflige " + dommages + " points de degats !");
        cible.estAttaque(dommages);
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Confirme: " + (confirme ? "Oui" : "Non");
    }
}

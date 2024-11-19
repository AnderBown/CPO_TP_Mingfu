package Personnages;

import Armes.Epee;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnderBown
 */
public class Guerrier extends Personnage {
    private boolean aCheval;

    public Guerrier(String nom, int niveauDeVie, boolean aCheval) {
        super(nom, niveauDeVie);
        this.aCheval = aCheval;
        
        nbGuerriers++;
    }
    
    /*
    public void finalize() throws Throwable {
        super.finalize();
        System.out.println("Un guerrier a été détruit.");
    }
    */

    public boolean isACheval() {
        return aCheval;
    }

    public void setACheval(boolean aCheval) {
        this.aCheval = aCheval;
    }
    
    /*
    @Override
    public void attaquer(Personnage cible) {
        System.out.println(this.getNom() + " attaque " + cible.getNom() + " et inflige 30 points de degats !");
        cible.estAttaque(30);
    }
    */
    
    @Override
    public void attaquer(Personnage cible) {
        int dommages = obtenirDommagesDeLArme();
        if (armeEnMain instanceof Epee) {
            dommages *= ((Epee) armeEnMain).getFinesse();
        }

        // Réduction si le guerrier est à cheval
        if (aCheval) {
            dommages /= 2;
        }

        // Se fatiguer et appliquer les dommages
        seFatiguer();
        System.out.println(getNom() + " attaque " + cible.getNom() + " et inflige " + dommages + " points de degats !");
        cible.estAttaque(dommages);
    }
    
    @Override
    public String toString() {
        return super.toString() + ", A cheval: " + (aCheval ? "Oui" : "Non");
    }
}


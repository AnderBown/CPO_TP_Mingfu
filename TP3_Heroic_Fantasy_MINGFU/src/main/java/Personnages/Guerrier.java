package Personnages;

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
    
    public void finalize() throws Throwable {
        super.finalize();
        System.out.println("Un guerrier a été détruit.");
    }

    public boolean isACheval() {
        return aCheval;
    }

    public void setACheval(boolean aCheval) {
        this.aCheval = aCheval;
    }

    @Override
    public String toString() {
        return super.toString() + ", A cheval: " + (aCheval ? "Oui" : "Non");
    }
}


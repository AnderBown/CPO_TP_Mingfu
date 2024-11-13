package Personnages;

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
    
    public void finalize() throws Throwable {
        super.finalize();
        System.out.println("Un magicien a été détruit.");
    }

    public boolean isConfirme() {
        return confirme;
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

    @Override
    public String toString() {
        return super.toString() + ", Confirme: " + (confirme ? "Oui" : "Non");
    }
}

package Personnages;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnderBown
 */
import Armes.Arme;
import java.util.ArrayList;

public abstract class Personnage {
    private String nom;
    private int niveauDeVie;
    private ArrayList<Arme> armes;  
    Arme armeEnMain;  
    
    
    protected static int nbPersonnages = 0;
    protected static int nbGuerriers = 0;
    protected static int nbMagiciens = 0;
    
    public Personnage(String nom, int niveauDeVie) {
        this.nom = nom;
        this.niveauDeVie = niveauDeVie;
        this.armes = new ArrayList<>();  
        this.armeEnMain = null;  
        
        nbPersonnages++;
    }
    
    /*
    @Override
    public void finalize() throws Throwable{
        super.finalize();

        
        nbPersonnages--;
        if (this instanceof Guerrier) {
            nbGuerriers--;
        } else if (this instanceof Magicien) {
            nbMagiciens--;
        }
        System.out.println("Un personnage a ete detruit. Mise à jour des compteurs.");
    }
    */
    
    public static int getNbPersonnages() {
        return nbPersonnages;
    }

    public static int getNbGuerriers() {
        return nbGuerriers;
    }

    public static int getNbMagiciens() {
        return nbMagiciens;
    }

    public int getNiveauDeVie() {
        return niveauDeVie;
    }

    public String getNom() {
        return nom;
    }

    public void ajouterArme(Arme arme) {
        if (armes.size() < 5) {
            armes.add(arme);
            System.out.println(arme.getNom() + " ajoute a l'inventaire de " + nom);
        } else {
            System.out.println("Inventaire plein. Impossible d'ajouter " + arme.getNom());
        }
    }

    public Arme getArmeEnMain() {
        return armeEnMain;
    }

    public void equiperArme(String nomArme) {
        for (Arme arme : armes) {
            if (arme.getNom().equals(nomArme)) {
                armeEnMain = arme;
                System.out.println(nom + " est maintenant equipe de " + arme.getNom());
                return;
            }
        }
        System.out.println(nomArme + " n'est pas dans l'inventaire de " + nom);
    }
    
    public ArrayList<Arme> getArmes() {
        return armes;
    }
    
    public void seFatiguer() {
        this.niveauDeVie -= 10;
        if (this.niveauDeVie < 0) {
            this.niveauDeVie = 0;
        }
    }
    
    public boolean estVivant() {
        return this.niveauDeVie > 0;
    }
    
    public void estAttaque(int points) {
        this.niveauDeVie -= points;
        if (this.niveauDeVie < 0) {
            this.niveauDeVie = 0;
        }
    }
    
    public void attaquer(Personnage cible) {
    
    }
    
    protected int obtenirDommagesDeLArme() {
        if (armeEnMain == null) {
            System.out.println(getNom() + " n'a pas d'arme equipee !");
            return 0;
        }
        return armeEnMain.getNiveauAttaque();
    }
    
    @Override
    public String toString() {
        String description = "Nom: " + nom + ", Niveau de vie: " + niveauDeVie;
        if (armeEnMain != null) {
            description += ", Arme en main: " + armeEnMain;
        } else {
            description += ", Pas d'arme en main";
        }
        return description;
    }
}


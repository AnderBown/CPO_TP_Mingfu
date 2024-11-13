package Armes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnderBown
 */
public class Epee extends Arme {
    int finesse; 


    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque); 
        setFinesse(finesse); 
    }


    public int getFinesse() {
        return finesse;
    }


    public void setFinesse(int finesse) {
        if (finesse < 100) {
            this.finesse = finesse;
        } else {
            throw new IllegalArgumentException("L'indice de finesse doit etre < 100.");
        }
    }


    @Override
    public String toString() {
        return super.toString() + ", Finesse: " + finesse;
    }
}

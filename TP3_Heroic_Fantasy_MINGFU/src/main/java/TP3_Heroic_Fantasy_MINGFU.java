/*
 * TP3
 */

/**
 *
 * @author AnderBown
 */

import Personnages.Guerrier;
import Personnages.Personnage;
import Personnages.Magicien;
import Armes.Arme;
import Armes.Epee;
import Armes.Baton;
import java.util.ArrayList;

public class TP3_Heroic_Fantasy_MINGFU {

    public static void main(String[] args) {
        
        // Afficher les armes crées
        Epee epee1 = new Epee("Excalibur", 75, 5);
        Epee epee2 = new Epee("Durandal", 40, 7);
        Epee epee3 = new Epee("Dragon Slayer", 90, 8);

        Baton baton1 = new Baton("Chene", 40, 5);
        Baton baton2 = new Baton("Charme", 50, 6);
        Baton baton3 = new Baton("Ancien", 55, 2);

        ArrayList<Arme> armes = new ArrayList<>();

        armes.add(epee1);
        armes.add(epee2);
        armes.add(epee3);
        armes.add(baton1);
        armes.add(baton2);
        armes.add(baton3);

        for (int i = 0; i < armes.size(); i++) {
            System.out.println(armes.get(i));
        }
        System.out.println();
       
        Magicien magicien1 = new Magicien("Gandalf", 65, true);  
        Magicien magicien2 = new Magicien("Garcimore", 44, false);  

        
        Guerrier guerrier1 = new Guerrier("Conan", 78, false);  
        Guerrier guerrier2 = new Guerrier("Lannister", 45, true);  

        // Créer un ArrayList 
        ArrayList<Personnage> personnages = new ArrayList<>();

        
        personnages.add(magicien1);
        personnages.add(magicien2);
        personnages.add(guerrier1);
        personnages.add(guerrier2);

        
        for (int i = 0; i < personnages.size(); i++) {
            System.out.println(personnages.get(i));
        }
        System.out.println();
        
        guerrier1.ajouterArme(baton1);
        guerrier1.ajouterArme(epee1);
        guerrier1.ajouterArme(epee2);
        guerrier1.equiperArme("Excalibur");
        
        magicien1.ajouterArme(baton2);
        magicien1.ajouterArme(baton3);
        magicien1.ajouterArme(epee3);
        
        System.out.println("Nombre d'armes de " + magicien1.getNom() + " : " + magicien1.getArmes().size());
        System.out.println(guerrier1);
        System.out.println(magicien1);
        System.out.println();
        
        /*
        System.out.println("Nombre total de personnages : " + Personnage.getNbPersonnages());
        System.out.println("Nombre total de guerriers : " + Personnage.getNbGuerriers());
        System.out.println("Nombre total de magiciens : " + Personnage.getNbMagiciens());
        System.out.println();
        
        
        guerrier2 = null;
        magicien2 = null;     

        System.out.println("Nombre total de personnages apres destruction : " + Personnage.getNbPersonnages());
        System.out.println("Nombre total de guerriers apres destruction : " + Personnage.getNbGuerriers());
        System.out.println("Nombre total de magiciens apres destruction : " + Personnage.getNbMagiciens());
        */
        
        // Afficher leurs caractéristiques initiales
        System.out.println("Personnages crees :");
        System.out.println(guerrier1);
        System.out.println(magicien1);
        System.out.println("Nombre total de personnages : " + Personnage.getNbPersonnages());
        System.out.println("Nombre de guerriers : " + Personnage.getNbGuerriers());
        System.out.println("Nombre de magiciens : " + Personnage.getNbMagiciens());

        // Fatiguer le guerrier
        System.out.println("\nLe guerrier se fatigue...");
        guerrier1.seFatiguer();
        System.out.println(guerrier1);

        // Vérifier si le guerrier est toujours vivant
        if (guerrier1.estVivant()) {
            System.out.println(guerrier1.getNom() + " est toujours vivant.");
        } else {
            System.out.println(guerrier1.getNom() + " est mort.");
        }

        // Le guerrier attaque le magicien
        System.out.println("\nLe guerrier attaque le magicien !");
        guerrier1.attaquer(magicien1);

        // Afficher les caractéristiques après l'attaque
        System.out.println("\nCaracteristiques apres l'attaque :");
        System.out.println(guerrier1);
        System.out.println(magicien1);
        System.out.println();
        
        // Création des épées
        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4, 7);

        // Création des bâtons
        Baton chene = new Baton("Chene", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);

        // Création des personnages
        Magicien magicien = new Magicien("Merlin", 80, false); // Magicien non confirmé
        Guerrier guerrier = new Guerrier("Arthur", 100, true); // Guerrier à cheval

        // Donner une épée et un bâton à chaque personnage
        magicien.ajouterArme(excalibur);
        magicien.ajouterArme(chene);

        guerrier.ajouterArme(durandal);
        guerrier.ajouterArme(charme);

        // Choisir une arme pour chaque personnage
        magicien.equiperArme("Excalibur");
        guerrier.equiperArme("Durandal");

        // Affichage initial des personnages
        System.out.println("=== Avant les attaques ===");
        System.out.println(magicien);
        System.out.println(guerrier);

        // Faire attaquer le magicien
        System.out.println("\n=== Le magicien attaque le guerrier ===");
        magicien.attaquer(guerrier);

        // Affichage après l'attaque du magicien
        System.out.println(magicien);
        System.out.println(guerrier);

        // Faire attaquer le guerrier
        System.out.println("\n=== Le guerrier attaque le magicien ===");
        guerrier.attaquer(magicien);

        // Affichage après l'attaque du guerrier
        System.out.println(magicien);
        System.out.println(guerrier);

        // Tester si les personnages sont vivants
        System.out.println("\n=== Vitalite des personnages ===");
        System.out.println(magicien.getNom() + " est vivant ? " + magicien.estVivant());
        System.out.println(guerrier.getNom() + " est vivant ? " + guerrier.estVivant());
    }
}

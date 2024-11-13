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
        
        System.out.println("Nombre total de personnages : " + Personnage.getNbPersonnages());
        System.out.println("Nombre total de guerriers : " + Personnage.getNbGuerriers());
        System.out.println("Nombre total de magiciens : " + Personnage.getNbMagiciens());
        System.out.println();
        
        
        guerrier2 = null;
        magicien2 = null;     

        System.out.println("Nombre total de personnages apres destruction : " + Personnage.getNbPersonnages());
        System.out.println("Nombre total de guerriers apres destruction : " + Personnage.getNbGuerriers());
        System.out.println("Nombre total de magiciens apres destruction : " + Personnage.getNbMagiciens());
    }
    
}

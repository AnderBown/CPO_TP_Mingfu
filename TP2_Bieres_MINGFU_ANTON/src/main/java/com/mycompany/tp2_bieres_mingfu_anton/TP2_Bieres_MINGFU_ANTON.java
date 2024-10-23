/*
 * TP2
 */

package com.mycompany.tp2_bieres_mingfu_anton;

/**
 *
 * @author AnderBown
 */
public class TP2_Bieres_MINGFU_ANTON {

    public static void main(String[] args) {
        /*
        BouteilleBiere uneBiere = new BouteilleBiere() ;
        
        uneBiere.nom = "Cuvee des trolls";
        uneBiere.degreAlcool = 7.0 ;
        uneBiere.brasserie = "Dubuisson";
        uneBiere.ouverte = false;
        
        uneBiere.lireEtiquette();
        
        uneBiere.nom = "Leffe";
        uneBiere.degreAlcool = 6.6 ;
        uneBiere.brasserie = "Abbaye de Leffe";
        
        
        uneBiere.lireEtiquette();
        */
        
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls",7.0 ,"Dubuisson") ;
        uneBiere.lireEtiquette();
        
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6,"Abbaye de Leffe") ;
        autreBiere.lireEtiquette();
        
        BouteilleBiere uneBiere1 = new BouteilleBiere("Heineken", 5.0, "Heineken International");
        uneBiere1.lireEtiquette();

        BouteilleBiere uneBiere2 = new BouteilleBiere("Guinness", 4.2, "Diageo");
        uneBiere2.lireEtiquette();

        BouteilleBiere uneBiere3 = new BouteilleBiere("Leffe Blonde", 6.6, "Abbaye de Leffe"); 
        uneBiere3.lireEtiquette();
        
        System.out.println() ;
        System.out.println(uneBiere) ;
        
        System.out.println() ;
        System.out.println(autreBiere) ;
        
        System.out.println() ;
        System.out.println(uneBiere1) ;
    }

}

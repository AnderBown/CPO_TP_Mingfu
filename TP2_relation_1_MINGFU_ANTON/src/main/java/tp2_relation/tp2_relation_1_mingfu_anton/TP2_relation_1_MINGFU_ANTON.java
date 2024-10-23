/*
 * 
 */

package tp2_relation.tp2_relation_1_mingfu_anton;

/**
 *
 * @author AnderBown
 */
public class TP2_relation_1_MINGFU_ANTON {

    public static void main(String[] args) {
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Voiture uneAutreMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        System.out.println("liste des voitures disponibles "+ "\n" + uneClio +"\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        
        bob.liste_voitures[0] = uneClio ;
        bob.liste_voitures[1] = une2008 ;
        bob.nbVoitures = 2 ;
        uneClio.Proprietaire = bob ;
        une2008.Proprietaire = bob ;
        
        reno.liste_voitures[0] = uneAutreClio ;
        reno.liste_voitures[1] = uneMicra ;
        reno.nbVoitures = 2 ;
        uneAutreClio.Proprietaire = reno ;
        uneMicra.Proprietaire = reno ;
        
        System.out.println("la premiere voiture de Bob est " + bob.liste_voitures[0] ) ;
        
        System.out.println("Ajout de uneClio pour Bob: " + bob.ajouter_voiture(uneClio));
        System.out.println("Ajout de uneAutreMicra pour Bob: " + bob.ajouter_voiture(uneAutreMicra));
        
        System.out.println("Les voitures de Bob:");
        for (Voiture voiture : bob.liste_voitures) {
            if (voiture != null) {
                System.out.println(voiture);
            }
        }
    }
}

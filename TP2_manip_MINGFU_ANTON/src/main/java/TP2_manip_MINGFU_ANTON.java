/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author AnderBown
 */
public class TP2_manip_MINGFU_ANTON {

    public static void main(String[] args) {
        // TODO code application logic here
    Tartiflette assiette1 = new Tartiflette();
    assiette1.nbCalories = 500;
    Tartiflette assiette2 = new Tartiflette();
    assiette2.nbCalories = 600;
    Tartiflette assiette3 = assiette2 ;
    /* 
     * assiette3 refere a assiette2: pas de nouvelle tartiflette car pas de nouvelle "new Tartiflette()"
    */
    System.out.println("nb de calories de Assiette 2 : " +
    assiette2.nbCalories) ;
    System.out.println("nb de calories de Assiette 3 : " +
    assiette3.nbCalories) ;
    
    Tartiflette temp = assiette2 ;
    temp = assiette2 ;
    assiette2= assiette1 ;
    assiette1= temp;
    temp = null;
        int i;
    /* une référence objet qui annonce référencer un type d’objet
peut-elle en référencer un autre qui n’a aucun rapport ?
    * Dans le cas ou la reference objet ne change pas de type objet (type objet statique) 
    elle ne peut pas referencer un autre qui n'a aucun rapport
    */
    /* Moussaka assiette666 = assiette1 ; 
        Moussaka assiette667 = new Tartiflette() ;
        Erreurs dues a laffectation a une classe Moussaka une variable/classe Tartiflette
    */
    Moussaka monTableau[ ] = new Moussaka[10];
    }
}

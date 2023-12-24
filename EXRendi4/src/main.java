public class main {
public static void main(String[] args) {
 boites boite = new boites();
 boite.ajouterCourrier(new lettre(150, "normal", "Tunis", "A4"));
 boite.ajouterCourrier(new lettre(100, "express", "Tunis", "A3"));
 boite.ajouterCourrier(new lettre(120, "normal", "Tunis", "A4"));
 boite.ajouterCourrier(new colis(30, "express", "Djerba", 2000));
 boite.ajouterCourrier(new colis(40, "normal", "Djerba", 3000));
 boite.ajouterCourrier(new colis(30, "normal", "", 2000));
 boite.ajouterCourrier(new colis(60, "express", "", 1200));
 boite.ajouterCourrier(new publicite(100, "normal", "Djerba"));
 boite.ajouterCourrier(new publicite(200, "normal", ""));
 boite.ajouterCourrier(new publicite(110, "express", "Tunis"));
 System.out.println("Montant total d'affranchissement : " + boite.affranchir() + " DT");
 System.out.println("Nombre de courriers invalides : " + boite.courriersInvalides());
 System.out.println("----------Contenu de la boîte----------");
 boite.afficher();
 }
} 

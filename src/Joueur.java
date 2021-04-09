
//Ceci importe la classe Scanner du package java.util
import java.util.Scanner; 
//Ceci importe toutes les classes du package java.util
import java.util.*;

public class Joueur extends Carte { //

		
		int Pv = 10;        //creation des points de vie
		int Inventaire;    //creation de l'inventaire  
		int x;
		int y;
		String[][]position = new String[x][y];

		String[][]pointdevueJoueur = new String[15][15]; //creation de la map de largeur et hauteur 15
//renommer point de vu joueur 
		
		
			int getting() {         //recuperation et affichage des pv du joueur
			return Pv;
		}
		
		public void settingPv(int Pv) {
			if(Pv >0) {
				this.Pv=Pv;
				System.err.println("Vous avez "+Pv+" points de vie.");
			}
			else {
				System.err.println("Vous avez perdu la partie.");	
			}
				
		}
		
		public int getInventaire() {        //recuperation et affichage de l'inventaire du joueur
			return Inventaire;
		}
		
		public void settingInventaire(int Inventaire) {
			if(Inventaire >0) {
				System.err.println("Vous avez "+ Inventaire +" objets dans votre inventaire.");
			}
			else {
				System.err.println("Votre inventaire est vide.");	
			}
			

		}

		
		public void ramasser(int x, int y) {     //fonction ramassage d'un objet 
			if(Inventaire < 5 && mapObjet [x][y].equals("p")) {
				Inventaire += 1;                   // ajout de l'objet,dans l'inventaire si celui ci n'est pas plein
				for(int i = 0; i<1; i++) {         // boucle de rajout d'un soin sur la map
					for(int j = 0; j<1; j++) {     // si il y a eu ajout dans l'inventaire
						boolean b = true;
						while(b) {
							if(mapObjet[i][j].equals(",") && b) {
								mapObjet[(int) (Math.random()*(15))][(int) (Math.random()*(15))]= "s";
								b = false;
							}
						}
					}
				}
				mapObjet[x][y] = ",";
			}
			else {                           // si l'inventaire est plein, on affiche la phrase au joueur 
				if(Inventaire >= 5) {
					System.err.println("L'invenatire est d�j� plein");
				}
				else {                       // si le joueur ramasse et qu'il n'y a pas de soins on affiche la phrase 
					System.err.println("Pas d'objet � ramasser");
				}
			}
		}
		
		
		Joueur(Carte machin) {                   //fonction de creation de map
			for(int x = 0; x< 15; x++) {         //boucle parcourant l'axe des x
				for(int y = 0; y< 15; y++) {     //boucle parcourant l'axe des y
					pointdevueJoueur[x][y]= "?";         //action pour mettre une virgule (signe comme quoi la case est vide) 
					                             //sur chaque case 
				} 
			}
		
			if(pointdevueJoueur[x][y].equals("?")) {   //placement du joueur 
				pointdevueJoueur[(int) (Math.random()*(15))][(int) (Math.random()*(15))]= "*"; 
				while (pointdevueJoueur[x][y].equals("p")||pointdevueJoueur[x][y].equals("M")||pointdevueJoueur[x][y].equals("s")||pointdevueJoueur[x][y].equals("V")||pointdevueJoueur[x][y].equals("!")) {
					pointdevueJoueur[(int) (Math.random()*(15))][(int) (Math.random()*(15))]= "*"; 
				}
			}
			
		
		}
			
		public void affichercartejoueur () {  // affichage de la map du joueur 
			System.out.println();
			for(int x = 0; x< 15; x++) {        
				for(int y = 0; y< 15; y++) {
					System.out.print("?" + pointdevueJoueur[x][y]);
				}
				System.out.println(" ");
				}
			System.out.println(); 
		}
		
		public void ActualisationAffichageJoueur (Carte machin) {
			pointdevueJoueur[x][y] = "*";
			
		}


		
		/* public class ExceptionMort extends Exception {

    public ExceptionMort() {
        super();
    }
    public ExceptionMort (String Message) {
        super(Message);//Prévient le joueur qu'il est mort
    }
}


Classe Joueur :

    public void settingPv(int Pv) throws ExceptionMort {
            if(Pv <=0) {
                throw new ExceptionMort();
            }
            else {
                this.Pv = Pv;
                System.err.println("Vous avez "+Pv+" points de vie !");
            }

        } */


}


	
	
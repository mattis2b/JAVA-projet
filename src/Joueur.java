
public class Joueur extends Carte { //

		
		int Pv = 10;        //creation des points de vie
		int Inventaire;    //creation de l'inventaire vide 
		
		
			int getting() {         //recuperation et affichage des pv du joueur
			return Pv;
		}
		
		public void setting(int Pv) {
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
		
		public void ramasser() {            //fonction ramassage d'un objet 
			if(Inventaire < 5 && mapObjet [i] [j].equals("p")) {
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
				mapObjet[i][j] = ",";
			}
			else {                           // si l'inventaire est plein, on affiche la phrase au joueur 
				if(Inventaire >= 5) {
					System.err.println("L'invenatire est deja� plein");
				}
				else {                       // si le joueur ramasse et qu'il n'y a pas de soins on affiche la phrase 
					System.err.println("Pas d'objet à ramasser");
				}
			}
		}
		
		int x;
		int y;
		String[][]mapObjet2 = new String[15][15]; //creation de la map de largeur et hauteur 15

		void Cartejoueur() {                   //fonction de creation de map
			for(int x = 0; x< 15; x++) {         //boucle parcourant l'axe des x
				for(int y = 0; y< 15; y++) {     //boucle parcourant l'axe des y
					mapObjet2[x][y]= "-";         //action pour mettre une virgule (signe comme quoi la case est vide) 
					                             //sur chaque case 
				} 
			}
		}
		
		
		public void affichercartejoueur () {
			System.out.println();
			for(int x = 0; x< 15; x++) {        
				for(int y = 0; y< 15; y++) {
					System.out.print("-" + mapObjet2[x][y]);
				}
				System.out.println("-");
				}
			System.out.println(); //oui
			

		}
		
	}
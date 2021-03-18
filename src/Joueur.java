
public class Joueur { //

	public static void main(String[] args) {  //à demander au prof, cette methode main fait apparaitre des erreurs 
		
		int Pv = 10;        //creation des points de vie
		int Inventaire;    //creation de l'inventaire vide 
		
		public int getting() {         //r�cup�ration et affichage des pv du joueur
			return Pv;
		}
		
		public void setting(int Pv) {
			if(Pv >0) {
				this.Pv=Pv;
				System.err.println("Vous avez"+Pv+"points de vie.");
			}
			else {
				System.err.println("Vous avez perdu la partie.");	
			}
				
		}
		
		public int getInventaire() {        //r�cup�ration et affichage de l'inventaire du joueur
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
					System.err.println("L'invenatire est déjà plein");
				}
				else {                       // si le joueur ramasse et qu'il n'y a pas de soins on affiche la phrase 
					System.err.println("Pas d'objet à ramasser");
				}
			}
		}
		
		
		
		
	}
	
		
		
		
		
		
	}
	

	
	

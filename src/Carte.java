
public class Carte { //

	int i;
	int j;	          
	String[][]mapObjet = new String[15][15]; //creation de la map de largeur et hauteur 15

		
		 
		Carte() {                   //fonction de creation de map
			for(int i = 0; i< 15; i++) {         //boucle parcourant l'axe des x
				for(int j = 0; j< 15; j++) {     //boucle parcourant l'axe des y
					mapObjet[i][j]= "-";         //action pour mettre une virgule (signe comme quoi la case est vide) 
					                             //sur chaque case
				} 

			}
			
			for(int i = 0; i< 15; i++) {     //boucle qui place les soins (s), pièges (p) et murs (!)  
			for(int j = 0; j< 15; j++) {
				if(mapObjet[i][j].equals("-")) {
					mapObjet[(int) (Math.random()*(15))][(int) (Math.random()*(15))]= "s"; 
				}
				if(mapObjet[i][j].equals("-")) {
					mapObjet[(int) (Math.random()*(15))][(int) (Math.random()*(15))]= "p"; 
				}
				if(mapObjet[i][j].equals("-")) {
					mapObjet[(int) (Math.random()*(15))][(int) (Math.random()*(15))]= "!"; 
				}
				
			}
		}
		}
		public void afficher () {
			System.out.println();
			for(int i = 0; i< 15; i++) {        
				for(int j = 0; j< 15; j++) {
					System.out.print("-" + mapObjet[i][j]);
				}
				System.out.println("-");
				}
			System.out.println();

		}
}


public class Carte { //

	int i;
	int j;	          
	String[][]mapObjet = new String[5][5]; //creation de la map de largeur et hauteur 15
	
	
	Carte(int i, int j) {
	 setAxeI(i);
	 setAxeJ(j);
}
		 

		private void setAxeI(int i) {
			this.i = i;
		}
		private void setAxeJ(int j) {
			this.j = j;
		}
		
		 
		Carte(int a) {                   //fonction de creation de map
			for(int i = 0; i< 5; i++) {         //boucle parcourant l'axe des x
				for(int j = 0; j< 5; j++) {     //boucle parcourant l'axe des y
					mapObjet[i][j]= ",";         //action pour mettre une virgule (signe comme quoi la case est vide) 
					                             //sur chaque case
				} 

			}
			
			for(int i = 0; i< 5; i++) {     //boucle qui place les soins (s), piÃ¨ges (p) et murs (!)  
			for(int j = 0; j< 5; j++) {
				if(mapObjet[i][j].equals(",")) {
					mapObjet[(int) (Math.random()*(5))][(int) (Math.random()*(5))]= "s"; 
				}
				if(mapObjet[i][j].equals(",")) {
					mapObjet[(int) (Math.random()*(5))][(int) (Math.random()*(5))]= "p"; 
				}
				if(mapObjet[i][j].equals(",")) {
					mapObjet[(int) (Math.random()*(5))][(int) (Math.random()*(5))]= "!"; 
				}
			}
			

		}
		}
		public void afficher () {
			System.out.println();
			for(int i = 0; i< 5; i++) {        
				for(int j = 0; j< 5; j++) {
					System.out.print("x" + mapObjet[i][j]); //mapObjet créé les "null" dans la console lors de l'execution de la fonction affichage
					//Le probleme vient probablement de la ligne 26, où mapObjet ne prend pas en compte les ","
				}
				System.out.println("x");
				}
			System.out.println();

		}
}

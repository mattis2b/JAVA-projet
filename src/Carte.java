
public class Carte { //

	public static void main(String[] args) {

		private int i = 15;          
		private int j = 15;          
		private String[][]mapObjet = new String[15][15]; //creation de la map de largeur et hauteur 15
		
		public Carte(int a) {                   //fonction de creation de map
			for(int i = 0; i< 15; i++) {         //boucle parcourant l'axe des x
				for(int j = 0; i< 15; i++) {     //boucle parcourant l'axe des y
					mapObjet[i][j]= ",";         //action pour mettre une virgule (signe comme quoi la case est vide) 
					                             //sur chaque case
				} 

			}
	}
		for(int i = 0; i< 4; i++) {                //boucle qui place les soins (s), pièges (p) et murs (!)  
			for(int j = 0; j< 4; j++) {
				if(mapObjet[i][j].equals(",")) {
					mapObjet[(int) (Math.random()*(15))][(int) (Math.random()*(15))]= "s"; 
				}
				if(mapObjet[i][j].equals(",")) {
					mapObjet[(int) (Math.random()*(15))][(int) (Math.random()*(15))]= "p"; 
				}
				if(mapObjet[i][j].equals(",")) {
					mapObjet[(int) (Math.random()*(15))][(int) (Math.random()*(15))]= "!"; 
				}
			}

		}
		
		

}
}

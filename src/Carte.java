
public class Carte { //
	          
	String[][]mapObjet = new String[15][15]; //creation de la map de largeur et hauteur 15
	String[][]pointdevueJoueur = new String[15][15]; //creation de la map de largeur et hauteur 15
	int iVictoire=(int) (Math.random()*(15));
	int jVictoire=(int) (Math.random()*(15));
		
		
		Carte() {                   //fonction de creation de map
			for(int i = 0; i< 15; i++) {         //boucle parcourant l'axe des x
				for(int j = 0; j< 15; j++) { //boucle parcourant l'axe des y
					int symbole = (int)(Math.random()*(5));
					if (symbole==1){
						mapObjet[i][j]= "-";
					}
					else if (symbole==2){
						mapObjet[i][j]= "s";
					}
					else if (symbole==3){
						mapObjet[i][j]= "p";
					}
					else if (symbole==4){
						mapObjet[i][j]= "!";
					}
					else if (symbole==5){
						mapObjet[i][j]= "M";
					}
					         //action pour mettre une virgule (signe comme quoi la case est vide) 
					                             //sur chaque case 
				} 

			}
			
			mapObjet[iVictoire][jVictoire]= "V"; 
		
			//for(int i = 0; i< 6; i++) {     //boucle qui place les soins (s), pièges (p) et murs (!)  
			//for(int j = 0; j< 6; j++) {
			//	if(mapObjet[i][j].equals("-")) {
			//		mapObjet[(int) (Math.random()*(15))][(int) (Math.random()*(15))]= "s"; 
			//	}
			//	if(mapObjet[i][j].equals("-")) {
			//		mapObjet[(int) (Math.random()*(15))][(int) (Math.random()*(15))]= "p"; 
			//	}
			//	if(mapObjet[i][j].equals("-")) {
			//		mapObjet[(int) (Math.random()*(15))][(int) (Math.random()*(15))]= "!"; 
			//	}
			//	if(mapObjet[i][j].equals("-")) {
			//		mapObjet[(int) (Math.random()*(15))][(int) (Math.random()*(15))]= "M"; 
			//	}
				
			//}
		}
			
		
			
		public void afficher () {
			System.out.println();
			for(int i = 0; i< 15; i++) {        
				for(int j = 0; j< 15; j++) {
					System.out.print("-" + mapObjet[i][j]);
				}
				System.out.println("-");
				}
			System.out.println(); //oui
			

		}
		
		public void deplacerH() {

            String tmp;
            for(int i=0; i<15; i++) {
                for(int j =0; j<15; j++) {
                    if(pointdevueJoueur[i][j]=="*"){//chercher position du joueur
                        if(i-1 >=0) {// Test de la position
                            tmp = pointdevueJoueur[i][j];
                            pointdevueJoueur[i][j] = "-"; //On vide la case
                            pointdevueJoueur[i-1][j] = tmp; //On déplace le perso
                    }
                }
            }
        }

        }
        public void deplacerB() {

            String tmp;
            for(int i=0; i<15; i++) {
                for(int j =0; j<15; j++) {
                    if(pointdevueJoueur[i][j]=="*"){//chercher position du joueur
                        if(i+1 <= 15) {// Test de la position
                            tmp = pointdevueJoueur[i][j];
                            pointdevueJoueur[i][j] = "-"; //On vide la case
                            pointdevueJoueur[i+1][j] = tmp; //On déplace le perso
                        }
                    }
                }
            }
        }

        public void deplacerG() {

            String tmp;
            for(int i=0; i<15; i++) {
                for(int j =0; j<15; j++) {
                    if(pointdevueJoueur[i][j]=="*"){//chercher position du joueur
                        if(j-1 >=0) {// Test de la position
                            tmp = pointdevueJoueur[i][j];
                            pointdevueJoueur[i][j] = "-"; //On vide la case
                            pointdevueJoueur[i][j-1] = tmp; //On déplace le perso
                        }
                    }
                }
            }
        }
        public void deplacerD() {

            String tmp;
            for(int i=0; i<15; i++) {
                for(int j =0; j<15; j++) {
                    if(pointdevueJoueur[i][j]=="*"){//chercher position du joueur
                        if(j+1 <= 15) {// Test de la position
                            tmp = pointdevueJoueur[i][j];
                            pointdevueJoueur[i][j] = "-"; //On vide la case
                            pointdevueJoueur[i][j+1] = tmp; //On déplace le perso
                        }
                    }
                }
            }
        }
}


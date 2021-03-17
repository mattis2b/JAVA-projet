
public class donjon {            

	private int Pv = 10;        //creation des points de vie
	private int Inventaire;    //creation de l'inventaire vide 
	private int i = 15;          
	private int j = 15;          
	private String[][]mapObjet = new String[15][15]; //creation de la map de largeur et hauteur 15
	
	public donjon(int a) {                   //fonction de creation de map
		for(int i = 0; i< 15; i++) {         //boucle parcourant l'axe des x
			for(int j = 0; i< 15; i++) {     //boucle parcourant l'axe des y
				mapObjet[i][j]= ",";         //action pour mettre une virgule (signe comme quoi la case est vide) 
				                             //sur chaque case
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
		             // les placements des objets ne sont pas effectués si un objet est déjà sur la case 
		
		mapObjet[(int) (Math.random()*(15))][(int) (Math.random()*(15))]= "V"; 
		//placement de la case à atteindre (V)
	}
	
	public int getting() {
		return Pv;
	}
	
	public void setting(int Pv) {
		if(Pv == 10 && Pv == 0 ) {
			this.Pv=Pv;
		}
		else {
			System.err.println("");	
		}
			
	}
	
	public int getInventaire() {
		return Inventaire;
	}
	
	public void ramasser() {
		if(Inventaire < 5 && mapObjet [i] [j].equals("p")) {
			Inventaire += 1;
			for(int i = 0; i< 1; i++) {
				for(j = 0; j<1; j++) {
					boolean b = true;
					while(b) {
						if(mapObjet[i][j].equals(",") && b) {
							mapObjet[(int) (Math.random()*(15))][(int) (Math.random()*(15))]= "p";
							b = false;
						}
					}
				}
			}
			mapObjet[i][j] = ",";
		}
		else {
			if(Inventaire >= 5) {
				System.err.println("L'invenatire est déjà plein");
			}
			else {
				System.err.println("Pas d'objet à ramasser");
			}
		}
	}
	public String toString() {
		String r = "";
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				r += mapObjet[i][j];
			}
			r+="\n";
		}
		return r;
	}
	
	
}

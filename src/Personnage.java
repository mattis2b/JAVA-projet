//Je ne supprime rien de Donjon au cas ou je fais n'importe quoi
public class Personnage {
	
	private int Pv = 10;        //creation des points de vie
	private int Inventaire;    //creation de l'inventaire vide 
	
	
	public int getting() {         //r�cup�ration et affichage des pv du joueur
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
	
	public int getInventaire() {        //r�cup�ration et affichage de l'inventaire du joueur
		return Inventaire;
	}
	

}

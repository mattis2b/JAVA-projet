import java.	io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Room{

	final static int port = 2511;


	public static void main(String[] args) {
        Carte carteTest1 = new Carte();
		@SuppressWarnings("unused") //ligne generer par java qui enleve une erreur sur "joueurtest1"
		Joueur joueurTest1 = new Joueur(carteTest1);
        
    
try {
    ServerSocket socketServeur = new ServerSocket(port);
    System.out.println("Bonjour, bienvenue sur le serveur Donjon");
    System.out.println("Serveur se lance sur le port " + (port)  );
    
    // faire un drapeau vrai jusqu'a arrivee a V
    // boucle qui fait appel au deplacement 
    
   boolean a = true;
   Scanner sc = new Scanner(System.in);
	while (a) {  
		joueurTest1.settingPv(10);
	
        joueurTest1.settingInventaire(0);
        
    	joueurTest1.affichercartejoueur();
		
		
    	System.out.println("Veuillez saisir un deplacement :");
    	String str = sc.nextLine();
    	
    	
    	switch(str) {
        case "z":
        	joueurTest1.deplacerH();
        	System.out.println("Vous vous etes deplace d'une case vers le haut");
            break;
        case "s":
        	joueurTest1.deplacerB();
    		System.out.println("Vous vous etes deplace d'une case vers le bas");
            break;
        case "q":
        	joueurTest1.deplacerG();
    		System.out.println("Vous vous etes deplace d'une case vers la gauche");
            break;
        case "d":
        	joueurTest1.deplacerD();
    		System.out.println("Vous vous etes deplace d'une case vers la droite");
            break;
        default:
        	System.out.println("Le deplacement n'est pas valide, veuillez saisir : z, q, s ou d");    
            }
    
    	System.out.println("");
    	
    	joueurTest1.ActualisationAffichageJoueur(carteTest1);
    	
    }
	sc.close();

    

    
  } catch (Exception e) {
    
  }

}
}

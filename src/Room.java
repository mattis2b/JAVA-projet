import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Room{
	final static int port = 2440;

	public static void main(String[] args) {
        Carte carteTest1 = new Carte();
		@SuppressWarnings("unused") //ligne generer par java qui enleve une erreur sur "joueurtest1"
		Joueur joueurTest1 = new Joueur();
        
    
try {
    ServerSocket socketServeur = new ServerSocket(port);
    System.out.println("Bonjour, bienvenue sur le serveur Donjon");
    System.out.println("Serveur se lance sur le port " + (port)  );
    
    joueurTest1.settingPv(10);
    joueurTest1.settingInventaire(0);
    //carteTest1.afficher();
    joueurTest1.affichercartejoueur();
    
    // faire un drapeau vrai jusqu'a arrivee a V
    // boucle qui fait appel au deplacement 
    
   boolean a;
   Scanner sc = new Scanner(System.in);
	while (a=true) {       
    	System.out.println("Veuillez saisir un deplacement :");
    	String str = sc.nextLine();
    	if (str.equals("z")) {
    		joueurTest1.deplacerH();
    		System.out.println("Vous vous etes deplacer d'une case vers le haut");
    	}
    	if (str.equals("s")) {
    		joueurTest1.deplacerB();
    		System.out.println("Vous vous etes deplacer d'une case vers le bas");
    	}
    	if (str.equals("q")) {
    		joueurTest1.deplacerG();
    		System.out.println("Vous vous etes deplacer d'une case vers la gauche");
    	}
    	if (str.equals("d")) {
    		joueurTest1.deplacerD();
    		System.out.println("Vous vous etes deplacer d'une case vers la droite");
    	}
    	
    	joueurTest1.affichercartejoueur();
        //joueurTest1.deplacement(str);
    }
	sc.close();

    

    while (true) {
      Socket socketClient = socketServeur.accept();
      ServeurHorloge newJoueur = new ServeurHorloge(socketClient);
      newJoueur.start();
      String message = "";

     /* System.out.println("Connexion avec : "+socketClient.getInetAddress());

      // InputStream in = socketClient.getInputStream();
      // OutputStream out = socketClient.getOutputStream();

      BufferedReader in = new BufferedReader(
        new InputStreamReader(socketClient.getInputStream()));
      PrintStream out = new PrintStream(socketClient.getOutputStream());
      message = in.readLine();
      out.println(message);			*/

      socketClient.close();
      socketServeur.close();
    }
  } catch (Exception e) {
    e.printStackTrace();
    System.out.format(" Cannot create to the server, port %d may be busy\n", port);
    System.exit(-1);
  }

}
}

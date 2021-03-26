import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Room{
	final static int port = 1876;

	public static void main(String[] args) {
        Carte carteTest1 = new Carte();
		@SuppressWarnings("unused") //ligne generer par java qui enleve une erreur sur "joueurtest1"
		Joueur joueurTest1 = new Joueur();
        
    
try {
    ServerSocket socketServeur = new ServerSocket(port);
    System.out.println("Bonjour, bienvenue sur le serveur Donjon");
    System.out.println("Serveur lance sur " + (port)  );
    
    joueurTest1.settingPv(10);
    joueurTest1.settingInventaire(0);
    carteTest1.afficher();
    joueurTest1.affichercartejoueur();

    

    while (true) {
      Socket socketClient = socketServeur.accept();
     ServeurHorloge newJoueur = new ServeurHorloge(socketClient);
      newJoueur.start();
      String message = "";

      System.out.println("Connexion avec : "+socketClient.getInetAddress());

      // InputStream in = socketClient.getInputStream();
      // OutputStream out = socketClient.getOutputStream();

      BufferedReader in = new BufferedReader(
        new InputStreamReader(socketClient.getInputStream()));
      PrintStream out = new PrintStream(socketClient.getOutputStream());
      message = in.readLine();
      out.println(message);

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

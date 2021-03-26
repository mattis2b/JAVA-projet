import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Room{
	final static int port = 8613;

	public static void main(String[] args) {
        Carte carteTest1 = new Carte();
        
try {
    ServerSocket socketServeur = new ServerSocket(port);
    System.out.println("Bonjour, bienvenue sur le serveur Donjon");

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
  }

carteTest1.afficher();

}
}

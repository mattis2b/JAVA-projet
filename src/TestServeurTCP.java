import java.net.*;
import java.io.*;

public class TestServeurTCP{
  final static int port = 8500;

  public static void main(String[] args) {
    try {
      ServerSocket socketServeur = new ServerSocket(port);
      System.out.println("Bonjour, bienvenue sur le serveur Donjon");

      while (true) {
        Socket socketClient = socketServeur.accept();
       ServeurHorloge newJoueur = new ServeurHorloge(socket);
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
  }
}

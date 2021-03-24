import java.net.*;
import java.io.*;

public class TestServeurThreadTCP extends Thread {

  final static int port = 9630;
  private Socket socket;

  public static void main(String[] args) {
    try {
      ServerSocket socketServeur = new ServerSocket(port);
      System.out.println("Lancement du serveur");
      while (true) {
        Socket socketClient = socketServeur.accept();
        TestServeurThreadTCP t = new TestServeurThreadTCP(socketClient);
        t.start();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public TestServeurThreadTCP(Socket socket) {
    this.socket = socket;
  }

  public void run() {
    traitements();
  }

  public void traitements() {
    try {
      String message = "";

      System.out.println("Connexion avec le client : " + socket.getInetAddress());

      BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      PrintStream out = new PrintStream(socket.getOutputStream());
      message = in.readLine();
      out.println("Bonjour " + message);

      socket.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
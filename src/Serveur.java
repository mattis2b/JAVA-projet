

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Serveur {
        
private static int PORT = 1029;
        
        public Serveur(){
                ServerSocket s = null;
                try {
                        s = new ServerSocket(PORT);
                        System.out.print("Le serveur se lance");
                }
                catch(IOException e){
                        e.printStackTrace();
                        System.err.print("Démarrage du serveur impossible");
                }
                
                
                while(true){
                        Socket socket;
                        try {
                                socket = s.accept();
                                Room2 newPlayer = new Room2(socket);
                                System.out.println("Bonjour, bienvenue sur le serveur Donjon \nVous allez apparaître aléatoirement dans un Donjon, atteignez la case <V> en vie pour gagner!");
                                newPlayer.start();
                                
                                
                        }catch(IOException e) {
                                System.err.println("ca marche pas");
                        }
                                
                }

        }
        
                
        public static void main(String[] args) throws UnknownHostException, IOException{
                new Serveur();
        }

}

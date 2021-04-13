import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Random; 

public class Room2 extends Thread  {
        private Socket socket;
        private PrintStream out;
        private BufferedReader in;
        private Joueur joueurTest1;
        
        public Room2 (Socket socket) {
                try {
                        this.socket=socket;
                        out=new PrintStream(socket.getOutputStream());
                        in = new BufferedReader(new InputStreamReader (socket.getInputStream()));
                }catch (IOException e) {
                        e.printStackTrace();
                }
                Carte carteTest1 = new Carte();
                joueurTest1= new Joueur(carteTest1);
        }
        
        public void run() {
                boolean a = true;
                try {
                        while(a) {
                                String tmp = in.readLine(); //Recupere le coup du joueur
                                
                                
                                GestionCoup(tmp);
                                out.println(joueurTest1.affichercartejoueur2());
                                }
                        //boucle for pour faire jouer chaque joueur ?
                                
                        this.socket.close();
                }catch(IOException e) {
                        e.printStackTrace();
                }
    
        }
        
        
        
        public void GestionCoup(String str) {
        	switch(str) {
            case "z":
            	joueurTest1.deplacerH();
            	//out.print("yesss");
            	//System.out.println("Vous vous etes deplace d'une case vers le haut");
                break;
            case "s":
            	joueurTest1.deplacerB();
        		//System.out.println("Vous vous etes deplace d'une case vers le bas");
                break;
            case "q":
            	joueurTest1.deplacerG();
        		//System.out.println("Vous vous etes deplace d'une case vers la gauche");
                break;
            case "d":
            	joueurTest1.deplacerD();
        		//System.out.println("Vous vous etes deplace d'une case vers la droite");
                break;
            default:
            	//System.out.println("Le deplacement n'est pas valide, veuillez saisir : z, q, s ou d");    
                }
        }
        
        
        
        
        
        
        

}


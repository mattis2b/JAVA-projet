import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class ServeurHorloge extends Thread{
     Socket socket;
     PrintStream out;
     BufferedReader in;

    public ServeurHorloge(Socket socket) {
        try {
            this.socket=socket;
            out = new PrintStream( socket.getOutputStream() );
            in = new BufferedReader( new InputStreamReader( socket.getInputStream() ) );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public void run() {
        int compteur = 3;
        try {
            while(compteur-->0) {
                String tmp = in.readLine();
                if (tmp.equals("heure")) {
                    out.println(System.nanoTime());
                }else {
                    out.println("commande inconnue");
                }
            }
            this.socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }}
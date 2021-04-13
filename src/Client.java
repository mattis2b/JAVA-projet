import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
        private PrintStream out = null;
        private BufferedReader in = null;
        private Socket socket;
        public Client() {
                try {
                        socket = new Socket("127.0.0.1",1028);
                        out = new PrintStream (socket.getOutputStream());
                        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                }catch(IOException e) {
                        System.out.println("ça marche pas");
                }
                
        }
        
        public void loop() {
                Scanner sc = new Scanner(System.in);
                while(true) {
                        String line = sc.next();
                        out.println(line);
                        String reponse;
                        try {
                                reponse = in.readLine();
                                System.out.println(reponse);
                        }catch(IOException e) {
                                System.out.println("connexion perdue!");
                                System.exit(1);
                        }
                }
                
        }
        
        
        
        
        public static void main(String argv[]) {
                Client c = new Client();
                c.loop();
        }
        
        
                

}

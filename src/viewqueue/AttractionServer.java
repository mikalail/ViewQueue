package viewqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * The AttractionServer manages communication with the ViewQueue client (Android) using the TCP protocol.
 * note: this implementation is *not* a threaded server, only a simple one.  Exit AttractionServer by pressing Ctrl-C
 * This code adapted from the book Killer Game Programming in Java.
 */
public class AttractionServer {

    AttractionManager am;

    private void processClient(BufferedReader in, PrintWriter out){


      String line;
      boolean done = false;
      try{
          while(done == false){
              if( (line = in.readLine() ) == null){
                  done = true;
                  }
              else{
                  System.out.println("Client msg: " + line);
                  if(line.trim().equals("bye")){
                      done = true;
                  }else{
                      doRequest(line, out);
                  }
              }
          }
      }catch(IOException e){
          System.out.println(e);
      }

    }

    private void doRequest(String line, PrintWriter out){

        if( line.trim().toLowerCase().equals("get")){

            System.out.println("Processing 'get'");
            out.println( am.toString() );
        }
        else{
            System.out.println("Ignoring input line");
        }

    }

    /**
     * Constructs a new AttractionServer
     * @param rides an AttractionManager object
     */
    public AttractionServer(AttractionManager rides) {

        this.am = rides;

        try {

            ServerSocket serverSock = new ServerSocket(9999);
            Socket clientSock;
            BufferedReader in;
            PrintWriter out;

            while (true) {

                System.out.println("Waiting for a client . . . .Press Ctrl-C to exit server.");
                clientSock = serverSock.accept();
                System.out.println("Client connection from " + clientSock.getInetAddress().getHostAddress());
                in = new BufferedReader(new InputStreamReader(clientSock.getInputStream()));
                out = new PrintWriter(clientSock.getOutputStream(), true);

                processClient(in, out);

                clientSock.close();
                System.out.println("Client connection closed\n");
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

}

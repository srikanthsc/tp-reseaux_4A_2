


import java.net.*;
import java.io.*;




public class HTTPdServerV1 { //class

public static ServerSocket Serverreseau;


public static void main (String[ ] argc)  throws   Exception
{
 int LPort = 1222;
 String cc="content-lenght";
 String va= "tp";
try {
Serverreseau = new ServerSocket(LPort); 
}
catch (Exception e1) {
            //System.out.println("tp reseaux");
System.out.println("connexion impossible : " + LPort); 
}




System.out.println("ecoute du numero du port: " + LPort);

while(true)
{
try(Socket client_Socket_t = Serverreseau.accept())
{
System.out.println("connexion du client...");


InputStreamReader ISR = new InputStreamReader(client_Socket_t.getInputStream());
BufferedReader buffer_t = new     BufferedReader(ISR);

while(!buffer_t.readLine().equals(""));


String Content = "<!DOCTYPE html>\n<html>\n<head> t.p reseaux etudiant 4A-41, etudiant:srikanth collaty\n</head>\n<body>"
+
"\n<h1>TP reseaux</h1>\n"
+

"<p>voici le site pour la programmation reseaux</p>\n</body>\n</html>";

String ResponseHeader = "HTTP/1.1 200 OK   \n"

+ "content-type:text/html;charset=utf-8   \n" 

+ "cc:" + Content.getBytes().length + "\r\n\r\n";

String myData = ResponseHeader + Content;

client_Socket_t.getOutputStream().write(myData.getBytes("UTF-8"));

client_Socket_t.getOutputStream().flush();

client_Socket_t.close();
            }
        }
    }

    public static void net()
    {
      
    }
}
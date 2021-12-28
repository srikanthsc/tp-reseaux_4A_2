import java.io.*;
import java.net.*;









public class    HTTPdServerV3 {
public static ServerSocket Serverreseau;

public static void main (String[ ]  argc) throws   Exception
{

int LPort = 9000;
try {
Serverreseau = new ServerSocket(LPort); }
catch (Exception e1) {
System.out.println("connexion impossible  : " + LPort); 
}

System.out.println(" numero du port  : " + LPort);
		

		
while(true)
		{
try(Socket client_Socket_t = Serverreseau.accept())
{
System.out.println("connexion client...");
InputStreamReader ISR = new InputStreamReader(client_Socket_t.getInputStream());
BufferedReader buffer_t = new BufferedReader(ISR);
				

String x;


while( !( x = buffer_t.readLine() ).equals("") )
{
System.out.println(x);
}

String Content = "<!DOCTYPE html>\n<html>\n<head> T.P programmation reseaux etudiant:srikanth collaty\n</head>\n<body>"
 +
"\n<h1> TP reseaux</h1>\n"
 +
"<p> page web du tp programmation reseaux</p>\n</body>\n</html>";
				
String ResponseHeader = "HTTP/1.1 200 O K \n"
+ "content - type : text / html ; charset = utf -8\n" 
+ "content  -  length:" + Content.getBytes().length +    "\r\n\r\n";

String myData = ResponseHeader + Content;
client_Socket_t.getOutputStream().write(myData.getBytes("UTF-8"));

client_Socket_t.getOutputStream().flush();

client_Socket_t.close();
				}
		}
	}
}
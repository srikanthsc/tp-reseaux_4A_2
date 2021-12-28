import java.io.*;
import java.net.*;







public class HTTPdServerV2 {
public static ServerSocket Serverreseau;
	
public static void main (String[  ] argc) throws Exception
{
 int LPort = 9000;

try {
Serverreseau = new ServerSocket(LPort); }

catch (Exception e1) {
System.out.println("overture refuser pour le port : " + LPort); }

System.out.println("numero du port: " + LPort);

while(true)
{
try(Socket client_Socket_t = Serverreseau.accept())
{
System.out.println("connexion client...");

InputStreamReader ISR = new InputStreamReader(client_Socket_t.getInputStream());

BufferedReader buffer_t = new BufferedReader(ISR);
				
while(!buffer_t.readLine().equals(""));

String Content = "";
String indPath = "./index.html";
BufferedReader indReader = new BufferedReader(new FileReader(indPath));
String line;

while( (line = indReader.readLine() )!=   null)
{
Content = Content.concat(line);
}
				
String ResponseHeader = "HTTP/1.1 200 O  K\n"
+ "content-type:text /  html;charset=  utf - 8 \n" 
+ "content-length:" + Content.getBytes().length + "\r\n\r\n";
				
String myData = ResponseHeader + Content;

				
client_Socket_t.getOutputStream().write(myData.getBytes("UTF-8"));


client_Socket_t.getOutputStream().flush();
				
client_Socket_t.close();
				}
		}
	}
	
	
}
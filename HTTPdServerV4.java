import java.io.*;


import java.net.*;





public class    HTTPdServerV4 {



public static ServerSocket Serverreseau;
	
public static void main (String[ ] argc) throws Exception
{
int LPort = 9000;
try {
Serverreseau = new ServerSocket(LPort); }

catch (Exception e1) {
System.out.println("connexion ...: " + LPort); }



System.out.println(" ecoute du numero du port   : " + LPort);

		
while(true)


{
try(Socket client_Socket_t = Serverreseau.accept())
{
System.out.println("connexion client...");
InputStreamReader ISR = new InputStreamReader(client_Socket_t.getInputStream());

BufferedReader buffer_t = new BufferedReader(ISR);
String request = buffer_t.readLine();
String chemin;






if(request.contains("GET /   HTTP/1.1"))
{chemin = "  /index";}
else {
					
chemin = request.substring(4);

int x = chemin.indexOf(' ');

System.out.println("index : " + x);

chemin = chemin.substring(0, x);
}
				
while( buffer_t.readLine().equals("") );

String Content = "";
String indexPathhtml = "." + chemin + " . html";
System.out.println(indexPathhtml);
FileReader file;
try
{
file = new FileReader(indexPathhtml);
}
catch(Exception e)
{
indexPathhtml = "error.html";
file = new FileReader(indexPathhtml);
}
BufferedReader indexReaderhtml = new BufferedReader(file);
String line;
while( (line = indexReaderhtml.readLine() ) !=null)
{
Content = Content.concat(line);
}
String ResponseHeader = "HTTP /1.1  200  OK  \n  content  -  type :  text  /html ; charset = utf-8 \n"

+ "content - length:"
+ Content.getBytes().length;
				
String myData = ResponseHeader + Content;

				
client_Socket_t.getOutputStream().write(myData.getBytes("UTF-8"));

client_Socket_t.getOutputStream().flush();

client_Socket_t.close();
             }
		}
	}

	
	
}

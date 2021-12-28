
import java.io.*; // import
import java.net.*; // import





public   class    ScannerTCPv1 {// declaration de la class
public static ServerSocket ServerSocket;

public static  int PORT_t=1234;
static void mymethod() {
    System.out.println("connextion:" +PORT_t + "\n" );
}

public static void main(String[ ] argc) {

mymethod();

try{
ServerSocket = new ServerSocket(PORT_t);
}catch (  IOException e){


System.out.println("connexion  impossible \n");
System.exit(1);    }
   }
}
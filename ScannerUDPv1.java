
import java.net.*;// import

import java.io.*;//import





public class ScannerUDPv1 { // class

static void mymethod() {

for (int pPORT  = 1500; pPORT <= 65535; pPORT++) {

try {
            
DatagramSocket server_t = new DatagramSocket(pPORT);
server_t.close();
} catch 
(SocketException e) {
System.out.println(" port " + pPORT ); 
}
}
        
}
public static void main(String[ ] argc) {



mymethod();
}
 }
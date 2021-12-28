import java.net.*; //import 

import java.io.*;  // import





public class ScannerTCPv2 { //class 

  static void mymethod() {
    String site = "www.esiea.fr";

String site1 = "www.google.fr";


for (int x = 79; x < 81; x++) {

try { // gerer les erreurs

Socket a = new Socket(site, x); // socket s
Socket y = new Socket(site1, x); // socket y
System.out.println(" port :" + x + " of " + site);

System.out.println(" port :" + x + " of " + site1);

} catch (   UnknownHostException e1) {  // catch gerer les exceptions
System.err.println(e1);
break; //sortir du break

} catch // gerer les exeptions
    (IOException e1) {
}   }

  }
public static void main(String[ ] argc) {
  mymethod();
  }}

package canche;

import java.util.Scanner;
public class Canche {

 
    public static Scanner Almacenar;
                public static void main(String[] args){
                    
           Almacenar = new Scanner(System.in);
            System.out.println("En esta aplicacion tu puedes enryptar tus mensajes");

String Letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String AlrevesLetras = "";
for (int i = Letras.length()-1; i > -1; i--) {
            AlrevesLetras += Letras.charAt(i);
        }
System.out.println("Ingresa el mensaje ");
        String mensaje = Almacenar.nextLine();
        Almacenar.nextLine();
  
          mensaje = mensaje.toUpperCase();

String OcultarLetras = "";

 for (int i = 0; i < mensaje.length(); i++) {
            if(mensaje.charAt(i) == (char)32){
                OcultarLetras += " ";
            } else {
                for (int j = 0; j < Letras.length(); j++) {
                    if (mensaje.charAt(i) == Letras.charAt(j)){
                        OcultarLetras += AlrevesLetras.charAt(j);
                        break;
                    }
                }
            } 
        } 
  System.out.println("Tome su texto encryptado: " + OcultarLetras);
    }

}
    

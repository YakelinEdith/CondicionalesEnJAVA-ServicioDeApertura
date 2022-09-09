
package sistemadeapertura;

import java.util.Scanner;

public class SistemaDeApertura {

    public static void main(String[] args) {
        
   
    
    System.out.println("Por favor introduce la contraseña");
    
    Scanner teclado = new Scanner(System.in);
    
    String Contra = teclado.nextLine();
    
   if (Contra.equals("Hola")) {
        System.out.println("Contraseña Correcta");  
    } else {
       System.out.println("Contraseña Incorrecta");
       
       }   
    }   
}    

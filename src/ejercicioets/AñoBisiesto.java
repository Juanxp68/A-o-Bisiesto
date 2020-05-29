/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioets;

import java.util.Scanner;

/**
 *
 * @author Nucks
 */
public class AñoBisiesto {
    
      Scanner teclado= new Scanner(System.in);
    static int año;
             
    public static boolean esBisiesto (int año) {
        
 if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) {
     
     return true;
 
 } else {
     
    return false;
 }
}
 public static void main(String[] args) throws Exception{
     AñoBisiesto AB= new AñoBisiesto();
     AB.entradaaño();
     if(esBisiesto(año)){
         System.out.println("Es bisiesto");
         
     } else{
         
         System.out.println("No es bisiesto");
                 
                 }
 }
 
 
 public void entradaaño(){
  
   System.out.print("Introduzca el año: ");
   año=teclado.nextInt();

	
}
}
    


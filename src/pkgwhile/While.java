/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgwhile;
import java.util.Scanner; //impoamos el paq scanner
/**
 *
 * @author Alumno
 */
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dato = new Scanner (System.in);
         System.out.println("ingrese un valo: ");
        int num = dato.nextInt();
        int suma = 0;  
        int i = 0;
        while (i<=num){         
                suma = suma + i;
                i = i + 2;
           System.out.println("los pares son: " +(i-2));
        }   
        System.out.println("la suma es " +suma);
    }
     
}

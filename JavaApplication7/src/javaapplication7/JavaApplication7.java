/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;
import java.util.Scanner;

public class JavaApplication7 
{

  
    public static void main(String[] args) 
    {
       Scanner leer = new Scanner(System.in);
        
        System.out.println("_______________________________________");
        System.out.println("             actividad 1                ");
        System.out.println("_______________________________________");
        
        boolean d = true;
        int  numero = 0;
        int i = 0, j=999, k = 0, rango = 0;
        do{
        System.out.println("\ningresa un numero entero positivo: ");
        numero = leer.nextInt();
        
        if(numero <= 0 && i == 0){d = false;}
       
        if(numero >= 0){i++;}
      
        if(numero<=j && numero>=0){j = numero;}
      
        else if(numero>=j){k = numero;}
      
        rango = k-j;
        
        }while(numero >= 0);
       
        if(d == false){
        System.out.println("_________________________________________");
        System.out.println("       no hay datos ingresados           ");
        System.out.println("_________________________________________");
        }
        System.out.println("cantidad de numeros ingresados: " + i);
        System.out.println("minimo: " + j);
        System.out.println("maximo: " + k);
        System.out.println("rango: " + rango);
        System.out.println("_________________________________________");
        System.out.println("       Fin del programa                  ");
        System.out.println("_________________________________________");
    }
    
}

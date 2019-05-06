/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Hugo
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        Random azar = new Random();
        
         
        int numero = 0, x=0, y=0, z =0, cont = 13;
        
        
        System.out.println("_______________________________________");
        System.out.println("    ramdom                             ");
        System.out.println("_______________________________________");
        
        System.out.println("bienvenido");
        System.out.println("desea adivinar el numero? 1/0");
        System.out.println("0 = no");
        System.out.println("1 = si");
        z = leer.nextInt();
        
        if(z == 1){
        
        y = azar.nextInt(1000);
        //System.out.println(y);
        System.out.println("escribe el numero correcto");
        do{
            
        cont--;
        System.out.println("te quedan: "+cont+" intentos");
        x = leer.nextInt();
        
        
        if( x == y){
            System.out.println("excelente");
            System.out.println("ganaste fin del juego");
            System.exit(0);
        }
        else if ( x > y){
            System.out.println("el numero es uno mas abajo");
        }
        else if ( x < y){
            System.out.println("el numero es uno mas arriba");
        }
        numero++;
        }while(numero <= 12);
        
        System.out.println("has fallado los 12 intentos \nfin del juego");
        }
        else if(z == 0){
            System.out.println("fin del juego");
        }
    }
    
    
    
}
    


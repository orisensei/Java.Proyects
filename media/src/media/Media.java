/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media;
import java.util.Scanner;
/**
 *
 * @author Hugo
 */
public class Media {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [] numero1 = new int[101];
        int i = 0;
        int suma=0;
        
        System.out.println("ingresa la cantidad de numeros que deseas colocar:");
        System.out.println("|mayor que 5 y menor o igual a 15|");
        
        do{
        i = leer.nextInt();
        
        
        if(!(i>5 && i <=15)){
        System.out.println("error: por favor ingresa numeros mayor que 5 "
                + "y menor o igual a 15");}
       
        }while(!(i>5 && i<=15));
        System.out.println("ingresa numeros entre 10 y 100");
        
        
        
        for(int j = 1; j<=i; j++){
            
            do{
            numero1[j] = leer.nextInt();
            
            if(!(numero1[j]>=10 && numero1[j]<=100)){
                System.out.println(" error: introduce numeros entre 10 y 100");
            }
            else{
                System.out.println("numero "+j+" ingresado");
            }
            
            }while(!(numero1[j]>=10 && numero1[j]<=100));
        }
        
        for(int k = 1;k <=i;k++){
            
            //System.out.println(numero1[k]);
             suma = suma + numero1[k];
           
            
        }
        int media = suma/i;
        System.out.println("la media del numero es: "+ media);
    }
    
}

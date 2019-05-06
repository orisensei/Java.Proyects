/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;
import java.util.Scanner;
/**
 *
 * @author Hugo
 */
public class Proyecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        double [] numero1 = new double[1000000];
        double i = 0;
        double suma = 0,multi = 1, suma2 = 0;
        
        System.out.println("ingresa la cantidad de numeros que deseas colocar:");
        System.out.println("mayor o igual a 3 y menor o igual a 20");
        
        do{
        i = leer.nextDouble();
        
        
        if(!(i>=3 && i <=20)){
        System.out.println("error: por favor ingresa numeros mayor o iguales 3 "
                + "y menor o igual a 20");}
       
        }while(!(i>=3 && i<=20));
        System.out.println("ingresa numero mayores a 0.0");
        
        
        
        for(int j = 1; j<=i; j++){
            
            do{
            numero1[j] = leer.nextDouble();
            
            if(!(numero1[j]>=0.0 && numero1[j]<=1000000)){
                System.out.println(" error: introduce numeros mayores a 0.0");
            }
            else{
                System.out.println("numero "+j+" ingresado");
            }
            }while(!(numero1[j]>= 0.0 && numero1[j]<=1000000));
        }
        
        for(int k = 1;k <=i;k++){
             suma = suma + numero1[k];
               
        }
        
        for(int m = 1; m<=i;m++){ 
            multi = multi * numero1[m];   
        }
        
        for(int k = 1; k<=i; k++){  
            suma2 = suma2 + 1/numero1[k];
        }
        
        double media = suma/i;
        double mediageometrica = Math.sqrt(multi);
        double mediaarmonica = i/suma2;
        
        System.out.println("la media del numero es: "+ media);
        System.out.println("la media geometrica del numero es: "+ mediageometrica);
        System.out.println("la media armonica del numero es: "+mediaarmonica);
    }
    
}

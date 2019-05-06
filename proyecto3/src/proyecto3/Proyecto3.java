/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3;
import java.util.Scanner;
/**
 *
 * @author Hugo
 */
public class Proyecto3 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double [] numero1 = new double[1000000];
        double i = 0;
        double suma = 0, suma2 = 0;
        
        System.out.println("ingresa la cantidad de numeros que deseas colocar:");
        System.out.println("mayor o igual a 5 y menor o igual a 15");
        
        do{
        i = leer.nextDouble();
        
        
        if(!(i>=5 && i <=15)){
        System.out.println("error: por favor ingresa numeros mayores o iguales  a 5 "
                + "y menores o iguales a 15");}
       
        }while(!(i>=5 && i<=15));
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
        double media = suma/i;
         
        for(int m = 1; m<=i;m++){ 
            
            suma2 = Math.abs((suma2 + numero1[m])- media); 
          
        
        }
     
        double varianza = Math.pow(suma2, 2)/(i-1);
        double desviacion = Math.sqrt(varianza);
        
        System.out.println("la media del numero es: "+ media);
        System.out.println("la desviacion estandar del numero es: "+ desviacion);
    }
    
}

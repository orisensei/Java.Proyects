/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto4;
import  java.util.Scanner;
/**
 *
 * @author Hugo
 */
public class Proyecto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double [] numero1 = new double[1000000];
        double infinitopositivo = Double.POSITIVE_INFINITY;
        double infinitonegativo = Double.NEGATIVE_INFINITY;
        double i = 0;
        double suma = 0, suma2 = 0;
        double das = 0, num = 0, num1 = 0,num2 = 0;
        System.out.println("ingresa la cantidad de numeros que deseas colocar:");
        System.out.println("mayor o igual a 5 y menor o igual a 15");
        do{
        i = leer.nextDouble();
        if(!(i>=5 && i <=15)){
        System.out.println("error: por favor ingresa numeros mayores o iguales  a 5 "
                + "y menores o iguales a 15");}
        }while(!(i>=5 && i<=15));
        System.out.println("ingresa los numeros");
        for(int j = 1; j<=i; j++){
            do{
            numero1[j] = leer.nextDouble();
            if(!(numero1[j]>=infinitonegativo && numero1[j]<=infinitopositivo)){
                System.out.println(" error: introduce numeros infinitos positivos o negativos");
            }
            else{
                System.out.println("numero "+j+" ingresado");
            }
            }while(!(numero1[j]>= infinitonegativo && numero1[j]<=infinitopositivo));
        }
        for(int k = 1;k <=i;k++){
             suma = suma + numero1[k];  
        }
        double media = suma/i;
        for(int m = 1; m<=i;m++){ 
            suma2 = suma2 + numero1[m]; 
            das = Math.pow(numero1[m], 2);
            num = num + das;
        }
        num1 = Math.pow(suma2, 2)/i;
        num2 = (num - num1)/(i-1.0);
        double desviacion = Math.sqrt(num2); 
        System.out.println("\nla media del numero es: "+ media);
        System.out.println("la desviacion estandar del numero es: "+ desviacion);
    }
}
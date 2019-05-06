/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea7;

/**
 *
 * @author Hugo
 */
public class metodos 
{
    int numero;
    public void par(int numero)
    {
        if (numero == 0){}
        else{
            System.out.println(numero + " par");
           
        inpar(numero-1);
        }
       
    }
    public void inpar(int numero)
    {
        if (numero == 0){}
        else{
        System.out.println(numero + " inpar");
          
        par(numero-1);
           
        }
        
    }
    public int cuentavocales (String refran){
        int i=0;
        char c;
        if ((refran == null)||(refran.length()<=1)||(refran.length() == 1)) {
            return 1;
        } 
        else {
             c =refran.charAt(0);
            if(c=='b'||c=='c'||c=='d'||c=='f'||c=='g'||c=='h'||c=='j'||c=='k'||c=='l'||c=='m'
                    ||c=='n'||c=='p'||c=='r'||c=='s'||c=='t'||c=='v'||c=='w'||c=='x'||c=='z'){
                i++;}
        }
        return i+cuentaconsonantes(refran.substring(1));
    }
    public int cuentaconsonantes(String refran){
        int i=0;
        char c;
        if ((refran == null)||(refran.length()<=1)|| (refran.length() == 1)) { 
            return 1;
        } 
        else {
              c =refran.charAt(0);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                i++;}
        }
        return i+cuentavocales(refran.substring(1));
    }
 }
    
    

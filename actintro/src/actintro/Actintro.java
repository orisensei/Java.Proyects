package actintro;
import java.util.Scanner;
/**
 * equipo de ids:
 * 
 * Hugo Eduardo Matos Uribe
 * Oscar Ismael Beltrán Miramontes
   Jesús Leobardo Verdugo Mendoza
 * 
 */
public class Actintro {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int programas;
      
        do{
        System.out.println("_________________________________________________");
        System.out.println("              programas                          ");
        System.out.println("_________________________________________________");
        System.out.println("ingresa 0 para los convertir  romanos a numeros arabicos");
        System.out.println("ingresa 1 para obtener los factores primos");
        System.out.println("ingresa 2 para obtener un polindromo");
        System.out.println("ingresa 3 para convertir una numero de base 2 hasta base 20");
        System.out.println("ingresa cualquier numero arriba de 4 para salir de la aplicacion");
        programas = leer.nextInt();
        
        switch(programas){
            case 0: 
                System.out.println("Programa 1");
                String romano = "";
       
        int aceptar =1;
        int nEnt []=new int [9];
        int total;
        
        int rep=1;//este valor es para comprobar que una letra no se repita 4 o mas veces seguidas
        int cI=0, cX=0, cC=0, cM=0;
        int cV=0, cL=0, cD=0;
        int rI=0, rX=0, rC=0, rM=0;
        
        
        char let []=new char [9];
        
        System.out.println("Introduzca un numero romano: ");
        do{
            rep=1;
            cI=0;cX=0;cC=0;cM=0;
            cV=0;cL=0;cD=0;
            
            
            aceptar =1;
            total=0;
            romano = leer.next();
            romano = romano.toUpperCase();
            
            //VALIDACION DE LONGITUD DE LETRAS
            if (romano.length()>9) {aceptar =0; System.out.println("Numero invalido, introduzca otro.");}
            
            //VALIDACION DE LETRAS
            for(int i=0; i<romano.length();i++){
                //let[i]=romano.charAt(i);
                switch(romano.charAt(i)){
                case 'I': nEnt[i]=1;cI++;break;//cI++
                case 'X': nEnt[i]=10;cX++;break;
                case 'C': nEnt[i]=100;cC++;break;
                case 'M': nEnt[i]=1000;cM++;break;
                
                //para los valores que NO pueden repetirse
                case 'V': nEnt[i]=5;cV++;break;
                case 'L': nEnt[i]=50;cL++;break;
                case 'D': nEnt[i]=500;cD++;break;
                default: aceptar = 0; System.out.println("No se acepta el numero. Ponga otro"); break;
                    
                }
                
            }
            
            total=nEnt[0];
            
            for (int i =0; i<(romano.length()-1);i++){
                
                
                //*
                if (nEnt[i]>nEnt[i+1]){//suma de numeros
                rep=1;
                total+=nEnt[i+1];
                
                }
                //
                
                else if(nEnt[i]<nEnt[i+1]){//resta de numeros
                rep=1;
                
                if (nEnt[i]==1){
                    if ((nEnt[i+1]==5)||(nEnt[i+1]==10)){
                        total -=nEnt[i];
                        total +=(nEnt[i+1]-nEnt[i]);
                    }
                }
                
                if (nEnt[i]==10){
                    if ((nEnt[i+1]==50)||(nEnt[i+1]==100)){
                        total -=nEnt[i];
                        total +=(nEnt[i+1]-nEnt[i]);
                    }
                }
                if (nEnt[i]==100){
                    if ((nEnt[i+1]==500)||(nEnt[i+1]==1000)){
                        total -=nEnt[i];
                        total +=(nEnt[i+1]-nEnt[i]);
                    }
                }
                else {aceptar = 0; System.out.println("No se acepta el numero. Ponga otro");}
                
                }
                //*/
                
                else if (nEnt[i]==nEnt[i+1]){ //este cacho si funciona. evita vv, ll y dd
                    rep++;
                    switch (nEnt[i]) {
                        case 5:
                            aceptar = 0;
                            System.out.println("No se acepta el numero. Ponga otro");
                            break;
                        case 50:
                            aceptar = 0;
                            System.out.println("No se acepta el numero. Ponga otro");
                            break;
                        case 500:
                            aceptar = 0;
                            System.out.println("No se acepta el numero. Ponga otro");
                            break;
                        default:
                            total+=nEnt[i+1];
                            break;
                    }
                    
                    if (rep==3){
                        switch (romano.charAt(i)){
                            case 'I':rI=1;break;
                            case 'X':rX=1;break;
                            case 'C':rC=1;break;
                            case 'M':rM=1;break;
                            default: aceptar =0; System.out.println("No se acepta el numero. Ponga otro"); break;
                        }
                    }
            }
            
            
            }
            
            if(rep>3){//este cacho evita que una letra se repita mas de 3 veces seguidas
                aceptar=0;
                System.out.println("No se acepta el numero. Ponga otro");
            }
            
            
            if (romano.length()>=3){
                if ((romano.charAt((romano.length()-3))=='I')&&(romano.charAt((romano.length()-1))!='I')&&(cI>1)){
                    aceptar=0;
                    System.out.println("No se acepta el numero. Ponga otro");
                }
            }
            
            if ((cV>1)||(cL>1)||(cD>1)){//evita que v, l o d se repitan
                aceptar=0;
                System.out.println("No se acepta el numero. Ponga otro");
            }
            //Este tramo evita que se introduzcan numeros tales como iix
            if ((cI>1)&&(romano.charAt((romano.length()-1))!='I')){
                aceptar=0;
                System.out.println("No se acepta el numero. Ponga otro");
            }
            
            if ((cX>4)&&(rX==1)){
                aceptar=0;
                System.out.println("No se acepta el numero. Ponga otro");
            }
            
            if ((cC>4)&&(rC==1)){
                aceptar=0;
                System.out.println("No se acepta el numero. Ponga otro");
            }
            
            if ((cM>4)&&(rM==1)){
                aceptar=0;
                System.out.println("No se acepta el numero. Ponga otro");
            }
            
            if (aceptar ==1){
            System.out.println(total);}
            
            }while(aceptar==0);
        
                
                System.out.println("_________________________________________________");
                System.out.println("                 fin de Programa 1               ");
              
                break;
            case 1: 
                System.out.println("Programa 2");
                int primo;
                
                System.out.println("ingresa el numero a determinar sus variables primas");
                primo = leer.nextInt();
               
                System.out.println("numeros primos generados");
                 
                for (int k = 1; k < primo; k++) {
                 
                    if(k%2==0){
                        System.out.println(k);
                    }  
                }
                System.out.println("_________________________________________________");
                System.out.println("                 fin de Programa 2               ");
                break;
            case 2: 
                
                System.out.println("Programa 3");
                System.out.println("ingresa una palabra para determinar si es polindromo");
                String Palabra = leer.next();
                
                 int LetraInicio=0;
                 int LetraFinal=Palabra.length()-1;
                 boolean error=false;
                 
                 while((LetraInicio<LetraFinal)&&(!error))
                 {
                    if (Palabra.charAt(LetraInicio)==Palabra.charAt(LetraFinal)){				
		LetraInicio++;
		LetraFinal--;
                  }
                    else {
		error = true;
                 }
                }
                 if (!error){
                  System.out.println(Palabra + " es PALINDROMO");
                    }
                else{
                  System.out.println(Palabra + " no es palindromo");
                    }
                    System.out.println("_________________________________________________");
                    System.out.println("                 fin de Programa 3               ");
                break; 
            case 3: 
                System.out.println("Convertidor de bases");
                        System.out.println("ingresa el numero a convertir de base 2 hasta base 20 ");
                        int b;
                        b = leer.nextInt();
                        for(int i=2;i<=20;i++){
                         System.out.println("" + b + " en base "+i+" es "+Integer.toString(b,i));
                            } 
                    System.out.println("_________________________________________________");
                    System.out.println("                 fin de Programa 4               ");
                break;
            default:
                System.out.println("_________________________________________________");
                System.out.println("               fin de Programa                   ");
                System.out.println("_________________________________________________");
                System.exit(0);
        }
        }while(programas != 4);
    }
    
}

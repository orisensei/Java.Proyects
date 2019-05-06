package palindromo;
import java.util.Scanner;
/**
 *
 * @author Leobardo
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String Palabra=leer.nextLine();
       int LetraInicio=0;
       int LetraFinal=Palabra.length()-1;
       boolean error=false;
       while((LetraInicio<LetraFinal)&&(!error)){
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
    }
}

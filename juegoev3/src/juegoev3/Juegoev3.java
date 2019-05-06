
package juegoev3;
import javax.swing.*;
public class Juegoev3 {

    public static void main(String[] args) {
        try {
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
	} catch (Exception e) {
		e.printStackTrace();
	}
 
        juegoventana n = new juegoventana();
        n.setSize(820,800);
        n.setTitle("hakudan");
        n.setLocation(400,10);
        n.setVisible(true); 
    }
    
}

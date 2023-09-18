
package electricity.billing.system;

import java.awt.Color;
import javax.swing.border.*;
import javax.swing.*;


public class Signup extends JFrame {
    
    Signup(){
        setSize(700,400);
        setLocation(450,150);
          // OR // you can either use this or upper one or below one
//        setBounds(450,150,700,400);
    
        getContentPane().setBackground(Color.WHITE);// This set a frame in whitet ccolor
        setLayout(null);
        
        JPanel panel = new JPanel(); // panel is something from which , we can higlight things its like one specific
        
        panel.setBounds(30,30,650,300);
        panel.setBorder( new TitledBorder(new LineBorder(new Color(173,216,230),2),"Create account"));
        add(panel);
        
   
        setVisible(true);
    }
    public static void main (String[]args){
        new Signup();
    }
}


package electricity.billing.system;
import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame{
    Splash(){
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/elect.jpg"));
        Image i2= i1.getImage().getScaledInstance(730,550,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        setSize(730,550);
        setLocation(500,200);
        setVisible(true);
    }

    public static void main(String[]args){
        new Splash();
    }
}

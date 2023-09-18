
package electricity.billing.system;
import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable{
    Thread t;
    Splash(){
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/elect.jpg"));
        Image i2= i1.getImage().getScaledInstance(730,550,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        
        add(image);
        
        
        int x = 1;
        for ( int i=2; i <600; i+=4,x+=1){
            setSize(i+x,i);
            setLocation(700-((i+x)/2),400-(i/2));
           
// This  values are randomm values taken 
        // to get size of interface that we are using ~ Diwakar
        // it will take only that much space which is size of the image, it can be manually add only
        try{
            Thread.sleep(2);
        }catch(Exception e){
            e.printStackTrace();
        }
        
        }
        t= new Thread(this);
        t.start();//start method internally call run method as run method can't be called directly
       
         setVisible(true);
        }
    
     public void run(){
             try{
                 Thread.sleep(5000);
                 setVisible(false);
                 
                 // login frame
             }catch(Exception e){
                 e.printStackTrace();
             
             }
     }

    public static void main(String[]args){
        new Splash();
    }
}

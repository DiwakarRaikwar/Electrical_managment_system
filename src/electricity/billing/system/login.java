
package electricity.billing.system;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;

public class login extends JFrame{


    login (){
        super ("Login page");
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);//default layout deleted
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(300,20,100,20);
        add(lblusername);
        // setbounds used for setting  the location of password and username , as 
        // passwords the width increases by 20 , so they wont overlap
        // basically set bounds used for setting the place where string wants us to be
        
        JTextField username= new JTextField();
        username.setBounds(400,20,150,20);
        add(username);
        
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(300, 60,100,20);
        add(lblpassword);
        
        // jtextfield is for the area where we write our input
        JTextField password = new JTextField();
        password.setBounds(400,60,150,20);
        add(password);
        
        
        JLabel logininas = new JLabel("Loggin in as ");
        logininas.setBounds(300,100,100,20);
        add(logininas);
        
        //jcombobox is used to dropdown , like we can select one option from the provided connditions
        JComboBox logginin = new JComboBox();
        logginin.addItem("Admin");
        logginin.addItem("Customer");
        logginin.setBounds(400,100,150,20);
        add(logginin);
        
        // for adding image
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
        Image i2 = i1.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        
        JButton login= new JButton("Login",new ImageIcon(i2));
        login.setBounds(330, 160,100 ,20 );
        add(login);
        
        // jbutton is used for selecting one /Enter
        JButton cancel = new JButton("Cancel");
        cancel.setBounds(450,160,100,20);
        add(cancel);
        
        JButton signup = new JButton("Signup");
        signup.setBounds(380,200,100,20);
        add(signup);
        
        
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icon/user.jpg"));
        Image i8 =i7.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i9= new ImageIcon(i8);
        
        JLabel image = new JLabel(i9);
        image.setBounds(0, 0,250, 250);
        add(image);
       
        
        
        setSize (640, 300);
        setLocation(400,200);
        setVisible(true);
        
    }



    public static void main(String[] args){
        new login();
    }
}
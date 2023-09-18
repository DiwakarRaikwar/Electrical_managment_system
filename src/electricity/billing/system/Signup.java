
package electricity.billing.system;

import java.awt.Color;
import java.awt.Font;
import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Signup extends JFrame implements ActionListener{
    
    JButton back, create;
    
    
    Signup(){
        setSize(700,400);
        setLocation(450,150);
          // OR // you can either use this or upper one or below one
//        setBounds(450,150,700,400);
    
        getContentPane().setBackground(Color.WHITE);// This set a frame in whitet ccolor
        setLayout(null);
        
        JPanel panel = new JPanel(); // panel is something from which , we can higlight things its like one specific
        
        panel.setBounds(30,30,650,300);
        panel.setBorder( new TitledBorder(new LineBorder(new Color(173,216,230),2),"Create account",TitledBorder.LEADING,TitledBorder.TOP,null,new Color(171,216,230)));
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        panel.setForeground(new Color(34,139,34));
        add(panel);
        
        JLabel heading = new JLabel("Create account as");
        heading.setBounds(100,50,140,20);
        heading.setForeground(Color.GRAY);
       // heading.setFont(new Font("Tahoma", Font.BOLD ,14));
        heading.setFont( new Font("Tahoma", Font.BOLD,14));
        panel.add(heading);
        
        
        JComboBox accountType = new JComboBox();
        accountType.addItem("Admin");
        accountType.addItem("Customer");
        accountType.setBounds(260,50,150,20);
        panel.add(accountType);
        
        // Field for metere 
        JLabel lblmeter = new JLabel("Meter number");
        lblmeter.setBounds(100,90,140,20);
        lblmeter.setForeground(Color.GRAY);
       // heading.setFont(new Font("Tahoma", Font.BOLD ,14));
        lblmeter.setFont( new Font("Tahoma", Font.BOLD,14));
        panel.add(lblmeter);
        
        // textfield for metre
         JTextField meter = new JTextField();
        meter.setBounds(260,90,150,20);
        panel.add(meter);
        
         // Field for metere 
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(100,130,140,20);
        lblusername.setForeground(Color.GRAY);
       // heading.setFont(new Font("Tahoma", Font.BOLD ,14));
        lblusername.setFont( new Font("Tahoma", Font.BOLD,14));
        panel.add(lblusername);
        
        // textfield for username
         JTextField username = new JTextField();
        username.setBounds(260,130,150,20);
        panel.add(username);
        
         // Field for metere 
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(100,170,140,20);
        lblname.setForeground(Color.GRAY);
       // heading.setFont(new Font("Tahoma", Font.BOLD ,14));
        lblname.setFont( new Font("Tahoma", Font.BOLD,14));
        panel.add(lblname);
        
        // textfield for username
         JTextField name = new JTextField();
        name.setBounds(260,170,150,20);
        panel.add(name);
        
       
        
        // for password
         JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(100,210,140,20);
        lblpassword.setForeground(Color.GRAY);
        lblpassword.setFont( new Font("Tahoma", Font.BOLD,14));
        panel.add(lblpassword);
        
        // textfield for password
         JTextField password = new JTextField();
        password.setBounds(260,210,150,20);
        panel.add(password);
        
        //Making button for creatin account
         create = new JButton("Create");
        create.setBackground(Color.BLACK);
        create.setForeground(Color.WHITE);
        create.setBounds(140,260,120,25);
        create.addActionListener(this); // mendatory to add or link between clasees
        panel.add(create);
       
        
        // butoton for back
         back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(300,260,120,25);
        back.addActionListener(this);// important to link classes
        panel.add(back);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/signupimage.png"));
        Image i2 = i1.getImage().getScaledInstance(230, 230, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(415,30,250,250);
        panel.add(image);
        
   
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if ( ae.getSource() == back){
            setVisible(false);
            new login();
            
        }else if ( ae.getSource() == create){
            
        }
    }
    public static void main (String[]args){
        new Signup();
    }
}

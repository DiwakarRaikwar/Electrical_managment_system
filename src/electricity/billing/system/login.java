  
package electricity.billing.system;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class login extends JFrame implements ActionListener{

    JButton cancel;
    JButton signup;
    JButton login;
    
    JTextField username, password;
    JComboBox logginin ;

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
        
        username= new JTextField();
        username.setBounds(400,20,150,20);
        add(username);
        
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(300, 60,100,20);
        add(lblpassword);
        
        // jtextfield is for the area where we write our input
        password = new JTextField();
        password.setBounds(400,60,150,20);
        add(password);
        
        
        JLabel logininas = new JLabel("Loggin in as ");
        logininas.setBounds(300,100,100,20);
        add(logininas);
        
        //jcombobox is used to dropdown , like we can select one option from the provided connditions
        logginin = new JComboBox();
        logginin.addItem("Admin");
        logginin.addItem("Customer");
        logginin.setBounds(400,100,150,20);
        add(logginin);
        
        // for adding image
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
        Image i2 = i1.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        login= new JButton("Login",new ImageIcon(i2));
        login.setBounds(330, 160,100 ,20 );
        login.addActionListener(this);
        add(login);
        
        // jbutton is used for selecting one /Enter
        cancel = new JButton("Cancel");
        cancel.setBounds(450,160,100,20);
        cancel.addActionListener(this);
        add(cancel);
        
        
        signup = new JButton("Signup");
        signup.setBounds(380,200,100,20);
        signup.addActionListener(this);
        add(signup);
        
        
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icon/user.jpg"));
        Image i8 =i7.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i9= new ImageIcon(i8);
        
        JLabel image = new JLabel(i9);
        image.setBounds(0, 0,250, 250);
        add(image);
       
        
        
        setSize (640, 300);// This setsize is basically used for seting up size of whole page in which our interface's is going to be seted
       
        setLocation(400,200);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){// actin performed to link one class to another
        
        if ( ae.getSource()== login){
            String susername = username.getText();
            String spassword = password.getText();
            String user = (String)logginin.getSelectedItem();
            
            try{
                Conn c = new Conn();
                String query = "Select * from login where username= '"+susername+"' and password= '"+spassword+"' and user= '"+user+"'";
                // when we are trying to execute data then using execute because we are gettin result
//                c.s.executeQuery(query);
                
                ResultSet rs = c.s.executeQuery(query);
                if ( rs.next()){// if user and password get matcch / then show us the page
                   String meter = rs.getString("meter_no");

                    setVisible(false);
                    
                    new Project(user, meter);
                }else{
                    JOptionPane.showMessageDialog(null,"Invalid Login");
                    username.setText("");
                    password.setText("");
                    
                }   
            
            }catch (Exception e){
                e.printStackTrace();
            }
            
        }else if(ae.getSource() == cancel){
            setVisible(false);
        }else if ( ae.getSource() == signup){
            setVisible(false);
            new Signup();

        }
    }



    public static void main(String[] args){
        new login();
    }
}

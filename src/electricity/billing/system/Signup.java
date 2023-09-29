
package electricity.billing.system;

import java.awt.Color;
import java.awt.Font;
import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;



public class Signup extends JFrame implements ActionListener{
    JTextField meter,username,name,password;
    JButton back, create;
    JComboBox accountType;
    
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
        
        
        accountType = new JComboBox();
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
        lblmeter.setVisible(false);
        panel.add(lblmeter);
        
        
        
        // textfield for metre
         meter = new JTextField();
        meter.setBounds(260,90,150,20);
        meter.setVisible(false);
        panel.add(meter);
        

         // Field for metere 
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(100,130,140,20);
        lblusername.setForeground(Color.GRAY);
       // heading.setFont(new Font("Tahoma", Font.BOLD ,14));
        lblusername.setFont( new Font("Tahoma", Font.BOLD,14));
        panel.add(lblusername);
        
        // textfield for username
        username = new JTextField();
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
        name = new JTextField();
        name.setBounds(260,170,150,20);
        panel.add(name);
        
       
        meter.addFocusListener(new FocusListener(){
            
            public void focusGained ( FocusEvent fe){};
            
            
            public void focusLost (FocusEvent fe){
            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery("select * from login where meter_no = '"+meter.getText()+"'");
                
                while ( rs.next()){
                    name.setText(rs.getString ("name"));
                    
                }
            }catch(Exception e){
                e.printStackTrace();
            }
            
            };
        });
        
        // for password
         JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(100,210,140,20);
        lblpassword.setForeground(Color.GRAY);
        lblpassword.setFont( new Font("Tahoma", Font.BOLD,14));
        panel.add(lblpassword);
        
        // textfield for password
        password = new JTextField();
        password.setBounds(260,210,150,20);
        panel.add(password);
        
        accountType.addItemListener(new ItemListener(){
            
            public void itemStateChanged(ItemEvent ae){
                String user = (String)accountType.getSelectedItem();
                if ( user.equals("Customer")){
                    lblmeter.setVisible(true);
                    meter.setVisible(true);
                    name.setEditable(false);
                }else{
                     lblmeter.setVisible(false);
                    meter.setVisible(false);
                    name.setEditable(true);
                }
            }
        });
        
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
            String atype = (String) accountType.getSelectedItem();
            String susername = username.getText();
            String sname = name.getText();
            String spassword = password.getText();
            String smeter = meter.getText();
            
            try{
                Conn c = new Conn();// Insert query is a DML command 
                // meaning we are updating the query in database
                String query = null;
                if (atype.equals("Admin")){
                 query ="insert into login values('"+smeter+"', '"+susername+"','"+sname+"','"+spassword+"','"+atype+"')";
                }else{
                    query = "update login set username ='"+susername+"', password = '"+spassword+"',user= '"+atype+"' where meter_no = '"+smeter+"'";
                }
                        c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Account created successfully");
                setVisible(false);
                new login();
                
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }
    }
    public static void main (String[]args){
        new Signup();
    }
}

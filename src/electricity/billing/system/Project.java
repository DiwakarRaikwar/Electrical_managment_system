
package electricity.billing.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Project extends JFrame implements ActionListener{
    String atype, meter;
    
    Project(String atype, String meter ){
        this.atype = atype;
        this.meter= meter;
        
       setExtendedState(JFrame.MAXIMIZED_BOTH);
       ImageIcon i1= new ImageIcon (ClassLoader.getSystemResource("icon/elect1.jpg"));
       Image i2 = i1.getImage().getScaledInstance(1550, 850, Image.SCALE_DEFAULT);
       ImageIcon i3= new ImageIcon(i2);
       JLabel image = new JLabel(i3);
       add(image);
       
       // to make a menu bar we used a JMenubar
       JMenuBar mb = new JMenuBar();
       
       setJMenuBar(mb);
       
       JMenu master = new JMenu("Master");
       master.setForeground(Color.BLUE);
       
       
       
       JMenuItem newcustomer = new JMenuItem("New Customer");
       newcustomer.setFont ( new Font("monospaced", Font.PLAIN,12));
       newcustomer.setBackground ( Color.white);
       ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icon/icon1.png"));
       Image image1 = icon1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
       newcustomer.setIcon(new ImageIcon(image1));
       newcustomer.setMnemonic('D');
       newcustomer.addActionListener (this);
       newcustomer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
       master.add(newcustomer);
       
       
        JMenuItem customerdetails = new JMenuItem("Customer Details");
       customerdetails.setFont ( new Font("monospaced", Font.PLAIN,12));
       customerdetails.setBackground ( Color.white);
       ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("icon/icon2.png"));
       Image image2 = icon2.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
       customerdetails.setIcon(new ImageIcon(image2));
       customerdetails.setMnemonic('M');
        customerdetails.addActionListener (this);
       customerdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
       master.add(customerdetails);
      
       
       
        JMenuItem depositdetails = new JMenuItem("Deposit Details");
       depositdetails.setFont ( new Font("monospaced", Font.PLAIN,12));
       depositdetails.setBackground ( Color.white);
       ImageIcon icon3 = new ImageIcon(ClassLoader.getSystemResource("icon/icon3.png"));
       Image image3 = icon3.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
       depositdetails.setIcon(new ImageIcon(image3));
       depositdetails.setMnemonic('N');
        depositdetails.addActionListener (this);
       depositdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
       master.add(depositdetails);
       
       JMenuItem calculatebill = new JMenuItem("Calculate Bill");
       calculatebill.setFont ( new Font("monospaced", Font.PLAIN,12));
       calculatebill.setBackground ( Color.white);
       ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("icon/icon4.png"));
       Image image4 = icon4.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
       calculatebill.setIcon(new ImageIcon(image4));
       calculatebill.setMnemonic('O');
        calculatebill.addActionListener (this);
       calculatebill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.CTRL_MASK));
       master.add(calculatebill);
       
     
       JMenu info = new JMenu("Information");
       info.setForeground(Color.RED);
       mb.add(info);
       
       JMenuItem updateinformation = new JMenuItem("Update Information");
       updateinformation.setFont ( new Font("monospaced", Font.PLAIN,12));
       updateinformation.setBackground ( Color.white);
       ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("icon/icon5.png"));
       Image image5= icon5.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
       updateinformation.setIcon(new ImageIcon(image5));
       updateinformation.setMnemonic('5');
       
       updateinformation.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.CTRL_MASK));
       info.add(updateinformation);// Inplace of info we need to add a menu heading like in
       //information option there are multiple options
       
       
        JMenuItem viewinformation = new JMenuItem("View Information");
       viewinformation.setFont ( new Font("monospaced", Font.PLAIN,12));
       viewinformation.setBackground ( Color.white);
       ImageIcon icon6 = new ImageIcon(ClassLoader.getSystemResource("icon/icon4.png"));
       Image image6 = icon6.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
       viewinformation.setIcon(new ImageIcon(image6));
       viewinformation.setMnemonic('1');
       viewinformation.addActionListener(this);
       viewinformation.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1,ActionEvent.CTRL_MASK));
       info.add(viewinformation);
       
       
       
       JMenu user = new JMenu ("User");
       user.setForeground(Color.BLUE);
       mb.add(user);
       
       JMenuItem paybill = new JMenuItem("Pay Bill");
       paybill.setFont ( new Font("monospaced", Font.PLAIN,12));
       paybill.setBackground ( Color.white);
       ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("icon/icon4.png"));
       Image image7= icon7.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
       paybill.setIcon(new ImageIcon(image7));
       paybill.setMnemonic('U');
       paybill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U,ActionEvent.CTRL_MASK));
       user.add(paybill);// Inplace of info we need to add a menu heading like in
       //information option there are multiple options
       
       
        JMenuItem billdetails = new JMenuItem("Bill details");
       billdetails.setFont ( new Font("monospaced", Font.PLAIN,12));
       billdetails.setBackground ( Color.white);
       ImageIcon icon8 = new ImageIcon(ClassLoader.getSystemResource("icon/icon6.png"));
       Image image8 = icon8.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
       billdetails.setIcon(new ImageIcon(image8));
       billdetails.setMnemonic('D');
       billdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
       user.add(billdetails);
       
       
       JMenu report = new JMenu ("Report");
       report.setForeground(Color.RED);
       mb.add(report);
       
       JMenuItem generatebill = new JMenuItem("Generate Bill");
       generatebill.setFont ( new Font("monospaced", Font.PLAIN,12));
       generatebill.setBackground ( Color.white);
       ImageIcon icon9 = new ImageIcon(ClassLoader.getSystemResource("icon/icon7.png"));
       Image image9= icon9.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
       generatebill.setIcon(new ImageIcon(image7));
       generatebill.setMnemonic('G');
       generatebill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G,ActionEvent.CTRL_MASK));
       report.add(generatebill);// Inplace of info we need to add a menu heading like in
       //information option there are multiple options
       
       
       JMenu utility = new JMenu ("Utility");
       utility.setForeground(Color.BLUE);
       mb.add(utility);
       
       JMenuItem notepad = new JMenuItem("Notepad");
       notepad.setFont ( new Font("monospaced", Font.PLAIN,12));
       notepad.setBackground ( Color.white);
       ImageIcon icon10 = new ImageIcon(ClassLoader.getSystemResource("icon/icon7.png"));
       Image image10= icon10.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
       notepad.setIcon(new ImageIcon(image7));
       notepad.setMnemonic('G');
       notepad.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G,ActionEvent.CTRL_MASK));
       utility.add(notepad);// Inplace of info we need to add a menu heading like in
       //information option there are multiple options
       
       
       JMenuItem calculator = new JMenuItem("Calculator");
       calculator.setFont ( new Font("monospaced", Font.PLAIN,12));
       calculator.setBackground ( Color.white);
       ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("icon/icon9.png"));
       Image image11= icon11.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
       calculator.setIcon(new ImageIcon(image7));
       calculator.setMnemonic('C');
       calculator.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
       utility.add(calculator);// Inplace of info we need to add a menu heading like in
       //information option there are multiple options
       
       JMenu mexit = new JMenu ("Exit");
       mexit.setForeground(Color.RED);
       mb.add(mexit);
       
       JMenuItem exit = new JMenuItem("Exit");
       exit.setFont ( new Font("monospaced", Font.PLAIN,12));
       exit.setBackground ( Color.white);
       ImageIcon icon12 = new  ImageIcon(ClassLoader.getSystemResource("icon/icon11.png"));
       Image image12= icon12.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
       exit.setIcon(new ImageIcon(image12));
       exit.setMnemonic('W');
       exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,ActionEvent.CTRL_MASK));
       mexit.add(exit);// Inplace of info we need to add a menu heading like in
       //information option there are multiple options

       if ( atype.equals("Admin")){
           mb.add(master);
       }else{
           mb.add(report);
       mb.add(user);
       mb.add(info);
       }
        
       mb.add(mexit);
       mb.add(utility);
       
       
       
       
       setLayout(new FlowLayout());
       setVisible(true);
    }
    
    public void actionPerformed (ActionEvent ae){
        String msg = ae.getActionCommand();
        if ( msg.equals("New Customer")){
            new NewCustomer();
        }else if  ( msg.equals("Customer Details")){
            
            new CustomerDetails();;
        }else if ( msg.equals("Deposit Details")){
            
            new DepositDetails();
        }else if ( msg.equals("Calculate Bill")){
            new CalculateBill();
        }else if (msg.equals("View Information")){
            new ViewInformation(meter);
        }
    }
    
    public static void main( String[] args){
        new Project("","");
    }
}

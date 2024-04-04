package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class AddCustomer extends JFrame implements ActionListener{
    
    JLabel labelusername ,labelname;
    JComboBox comboid;
    JTextField tfnumber, tfcountry, tfaddress, tfemail, tfphonenumber ;
    JRadioButton rmale, rfemale;
    JButton add, back;
    
    AddCustomer(String username) {
    setBounds(450, 200, 850, 550);
    setLayout(null);
    getContentPane().setBackground(Color.WHITE);
    
    JLabel Iblusername = new JLabel("Username");
    Iblusername.setBounds(30, 50, 150, 25);
    add(Iblusername);
    
    labelusername = new JLabel("");
    labelusername.setBounds(220, 50, 150, 25);
    add(labelusername);
    
    JLabel Iblid = new JLabel("Id");
    Iblid.setBounds(30, 90, 150, 25);
    add(Iblid);
    
    comboid = new JComboBox(new String[] {"Passport", "Adhar card", "Pan card", "Ration card"});
    comboid.setBounds(220, 90, 150, 25);
       comboid.setBackground(Color.WHITE);
    add(comboid);
    
    JLabel Iblnumber= new JLabel("Number");
    Iblnumber.setBounds(30, 130, 150, 25);
    add(Iblnumber);
    
    tfnumber = new JTextField();
    tfnumber.setBounds(220, 130, 150, 25);
    add(tfnumber);
   
    JLabel Iblname = new JLabel("Name");
    Iblname.setBounds(30, 170, 150, 25);
    add(Iblname);
    
    labelname = new JLabel();
    labelname.setBounds(220, 170, 150, 25);
    add(labelname);
    
    JLabel Iblgender = new JLabel("Gender");
    Iblgender.setBounds(30, 210, 150, 25);
    add(Iblgender);
    
    rmale = new JRadioButton("Male");
    rmale.setBounds(220, 210, 70, 25);
    rmale.setBackground(Color.WHITE);
    add(rmale);
   
    rfemale = new JRadioButton("Female");
    rfemale.setBounds(300, 210, 70, 25);
    rmale.setBackground(Color.WHITE);
    add(rfemale);
    
    ButtonGroup bg = new ButtonGroup();
    bg.add(rmale);
    bg.add(rfemale);
    
     JLabel Iblcountry = new JLabel("Country");
    Iblcountry.setBounds(30, 250, 150, 25);
    add(Iblcountry);
    
    tfcountry = new JTextField();
    tfcountry.setBounds(220, 250, 150, 25);
    add(tfcountry);
    setVisible(true);
    
    JLabel Ibladdress = new JLabel("Address");
    Ibladdress.setBounds(30, 290, 150, 25);
    add(Ibladdress);
    
    tfaddress = new JTextField();
    tfaddress.setBounds(220, 290, 150, 25);
    add(tfaddress);
    
     JLabel Iblphonenumber = new JLabel("Phonenumber");
    Iblphonenumber.setBounds(30, 330, 150, 25);
    add(Iblphonenumber);
    
    tfphonenumber = new JTextField();
    tfphonenumber.setBounds(220, 330, 150, 25);
    add(tfphonenumber);
    
    JLabel Iblemail = new JLabel("Email");
    Iblemail.setBounds(30, 370, 150, 25);
    add(Iblemail);
    
    tfemail = new JTextField();
    tfemail.setBounds(220, 370, 150, 25);
    add(tfemail);
    
    add = new JButton("Add");
    add.setBackground(Color.BLACK);
    add.setForeground(Color.WHITE);
    add.setBounds(70, 430, 100, 25);
    add.addActionListener(this);
    add(add);
    
    back = new JButton("Back");
    back.setBackground(Color.BLACK);
    back.setForeground(Color.WHITE);
    back.setBounds(250, 430, 100, 25);
    back.addActionListener(this);
    add(back);
    
   ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg"));
   Image i2 = i1.getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT);
   ImageIcon i3 = new ImageIcon(i2);
   JLabel image = new JLabel(i3);
   image.setBounds(400, 40, 450, 420);
   add(image);
    
   try {
       Conn  c = new Conn();
       ResultSet rs = c.s.executeQuery("Select * from account where username = '"+username+"'");
       while(rs.next())  {
           labelusername.setText(rs.getString("username"));
           labelname.setText(rs.getString("name"));
           
       }
   }catch (Exception e) {
       e.printStackTrace();
   }
    setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)  {
        if(ae.getSource() == add)  {
            String username = labelusername.getText();
            String id =(String) comboid.getSelectedItem();
            String number = tfnumber.getText();
            String name = labelname.getText();
            String gender = null;
            if (rmale.isSelected()) {
                gender = "Male";
             }  else {
                gender = "Female";
            }
            String country = tfcountry.getText();
            String address = tfaddress.getText();
            String phonenumber = tfphonenumber.getText();
            String email = tfemail.getText();
            
            try {
                Conn c = new Conn();
                String query = "insert into customer values('"+username+"', '"+id+"', '"+number+"', '"+name+"', '"+gender+"', '"+country+"', '"+address+"', '"+phonenumber+"', '"+email+"')";
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Customer Details added successfully ");
                setVisible(false);
                
            } catch ( Exception e)  {
                e.printStackTrace();
            }
        
        } else {
            setVisible(false);
        }
    }
    public static void main(String[] args)    {
        new AddCustomer("sana");
    }
}


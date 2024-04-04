package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class UpdateCustomer extends JFrame implements ActionListener{
    
    JLabel labelusername ,labelname;
    JTextField tfnumber, tfcountry, tfaddress, tfemail, tfphonenumber, tfid, tfgender  ;
    JButton add, back;
    
    UpdateCustomer(String username) {
    setBounds(500, 200, 850, 550);
    setLayout(null);
    getContentPane().setBackground(Color.WHITE);
    
    JLabel text = new JLabel("UPDATE CUSTOMER DETAILS");
    text.setBounds(50, 0, 300, 25);
    text.setFont(new Font("Tahoma", Font.PLAIN, 20));
    add(text);
    
    JLabel Iblusername = new JLabel("Username");
    Iblusername.setBounds(30, 50, 150, 25);
    add(Iblusername);
    
    labelusername = new JLabel("");
    labelusername.setBounds(220, 50, 150, 25);
    add(labelusername);
    
    JLabel Iblid = new JLabel("Id");
    Iblid.setBounds(30, 90, 150, 25);
    add(Iblid);
    
    tfid = new JTextField();
    tfid.setBounds(220, 90, 150, 25);
    add(tfid);
    
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
    
    tfgender = new JTextField();
    tfgender.setBounds(220, 210, 150, 25);
    add(tfgender);
    
     JLabel Iblcountry = new JLabel("Country");
    Iblcountry.setBounds(30, 250, 150, 25);
    add(Iblcountry);
    
    tfcountry = new JTextField();
    tfcountry.setBounds(220, 250, 150, 25);
    add(tfcountry);
   
    JLabel Ibladdress = new JLabel("Address");
    Ibladdress.setBounds(30, 290, 150, 25);
    add(Ibladdress);
    
    tfaddress = new JTextField();
    tfaddress.setBounds(220, 290, 150, 25);
    add(tfaddress);
    
    JLabel Iblphonenumber= new JLabel("Phonenumber");
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
    
    add = new JButton("Update");
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
    
   ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/update.png"));
   Image i2 = i1.getImage().getScaledInstance(350, 400, Image.SCALE_DEFAULT);
   ImageIcon i3 = new ImageIcon(i2);
   JLabel image = new JLabel(i3);
   image.setBounds(400, 80, 450, 400);
   add(image);
    
   try {
       Conn  c = new Conn();
       ResultSet rs = c.s.executeQuery("Select * from customer where username = '"+username+"'");
       while(rs.next())  {
           labelusername.setText(rs.getString("username"));
           labelname.setText(rs.getString("name"));
           tfid.setText(rs.getString("id"));
           tfnumber.setText(rs.getString("number"));
           tfgender.setText(rs.getString("gender"));
           tfcountry.setText(rs.getString("country"));
           tfaddress.setText(rs.getString("address"));
           tfphonenumber.setText(rs.getString("phonenumber"));
           tfemail.setText(rs.getString("email"));
       }
   } catch (Exception e) {
       e.printStackTrace();
   }
    setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)  {
        if(ae.getSource() == add)  {
            String username = labelusername.getText();
            String id =tfid.getText();
            String number = tfnumber.getText();
            String name = labelname.getText();
            String gender = tfgender.getText();
            String country = tfcountry.getText();
            String address = tfaddress.getText();
            String phonenumber = tfphonenumber.getText();
            String email = tfemail.getText();
            
            try {
             Conn c = new Conn();               
             String query = "update customer set username = '"+username+"', id = '"+id+"', number = '"+number+"',name = '"+name+"', gender = '"+gender+"', country = '"+country+"', address =  '"+address+"', phonenumber = '"+phonenumber+"', email = '"+email+"'";
             c.s.executeUpdate(query);
                
              JOptionPane.showMessageDialog(null, "Customer Details Updated successfully ");
              setVisible(false);
                
            } catch ( Exception e)  {
                e.printStackTrace();
            }
        
        } else {
            setVisible(false);
        }
    }
    public static void main(String[] args)    {
        new UpdateCustomer("sana");
    }
}
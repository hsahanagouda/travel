package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
        
public class ViewPackage extends JFrame implements ActionListener {
        
    JButton back;
    JLabel labelprice, labelphonenumber;
    
    ViewPackage(String username) {
      setBounds(450, 200, 900, 800);
      getContentPane().setBackground(Color.WHITE);
      setLayout(null);
      
      JLabel text = new JLabel("VIEW PACKAGE DETAILS");
      text.setFont(new Font("Tahoma", Font.BOLD, 20));
      text.setBounds(60, 0, 300, 30);
      add(text);
      
      JLabel Iblusername = new JLabel("Username");
     Iblusername.setBounds(30, 50, 150, 25);
     add(Iblusername);
      
      JLabel labelusername = new JLabel();
    labelusername.setBounds(220, 50, 150, 25);
    add(labelusername);
    
    JLabel Iblpackage = new JLabel("Package");
    Iblpackage.setBounds(30, 90, 150, 25);
    add(Iblpackage);
      
      JLabel labelpackage = new JLabel();
    labelpackage.setBounds(220, 90, 150, 25);
    add(labelpackage);
    
    JLabel Iblpersons = new JLabel("Total persons");
    Iblpersons.setBounds(30, 130, 150, 25);
    add(Iblpersons);
      
      JLabel labelpersons = new JLabel("");
    labelpersons.setBounds(220, 130, 150, 25);
    add(labelpersons);
    
    JLabel IblId = new JLabel("Id");
    IblId.setBounds(30, 170, 150, 25);
    add(IblId);
      
      JLabel labelId = new JLabel("");
    labelId.setBounds(220, 170, 150, 25);
    add(labelId);
    
    JLabel Iblnumber = new JLabel("Number");
    Iblnumber.setBounds(30, 210, 150, 25);
    add(Iblnumber);
      
      JLabel labelnumber = new JLabel("");
    labelnumber.setBounds(220, 210, 150, 25);
    add(labelnumber);
    
     JLabel Iblphonenumber = new JLabel("Phonenumber");
    Iblphonenumber.setBounds(30, 250, 150, 25);
    add(Iblphonenumber);
      
    labelphonenumber = new JLabel();
    labelphonenumber.setBounds(220,250, 150, 25);
    add(labelphonenumber);
    
     JLabel Iblprice = new JLabel("Total Price");
    Iblprice.setBounds(30, 290, 410, 25);
    add(Iblprice);
      
    labelprice = new JLabel();
    labelprice.setBounds(220, 290, 150, 25);
    add(labelprice);
  
    back = new JButton("Back");
    back.setBackground(Color.BLACK);
    back.setForeground(Color.WHITE);
    back.setBounds(130, 360, 100, 25);
    back.addActionListener(this);
    add(back);
    
   ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
   Image i2 = i1.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
   ImageIcon i3 = new ImageIcon(i2);
   JLabel image = new JLabel(i3);
   image.setBounds(450, 20, 500, 400);
   add(image);
  
   try {
       Conn conn = new Conn();
       String query = "Select * from bookpackage where username = '"+username+"'";
       ResultSet rs = conn.s.executeQuery(query);
       while(rs.next())  {
          labelusername.setText(rs.getString("username"));
           labelId.setText(rs.getString("Id"));
           labelnumber.setText(rs.getString("Number"));
          labelpackage.setText(rs.getString("package"));
          labelprice.setText(rs.getString("Price"));
          labelphonenumber.setText(rs.getString("Phonenumber"));
          labelpersons.setText(rs.getString("persons"));
         
       }
   } catch(Exception e) {
       
   }
      setVisible(true);
  }
  public void actionPerformed(ActionEvent ae)  {
      setVisible(false);
  }
  
  public static void main(String[] args)  {
      new ViewPackage("sana");
  }
}

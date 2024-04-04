package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BookPackage extends JFrame implements ActionListener {
    
    Choice cpackage;
    JTextField tfpersons ;
    String username;
    JLabel labelusername, labelid, labelnumber, labelphonenumber, labelprice;
    JButton checkprice, bookpackage, back;
    
    
    BookPackage(String username) {
        this.username = username;
      setBounds(250, 200, 1000, 500);
      setLayout(null);
      getContentPane().setBackground(Color.WHITE);
      
      JLabel text = new JLabel("BOOK PACKAGE");
      text.setBounds(100,10,200,30);
      text.setFont(new Font("Tahoma", Font.PLAIN, 20));
      add(text);
      
      JLabel Iblusername = new JLabel("Username");
     Iblusername.setBounds(40, 70, 100, 20);
     Iblusername.setFont(new Font("Tahoma", Font.PLAIN, 16));
     add(Iblusername);
      
      labelusername = new JLabel();
      labelusername.setFont(new Font("Tahoma", Font.PLAIN, 16));
      labelusername.setBounds(250, 70, 100, 20);
     add(labelusername);
    
    JLabel IblPackage = new JLabel("Select Package");
    IblPackage.setFont(new Font("Tahoma", Font.PLAIN, 16));
    IblPackage.setBounds(40, 110, 150, 20);
    add(IblPackage);
      
      cpackage = new Choice();
      cpackage.add("Gold Package");
      cpackage.add("Silver Package");
      cpackage.add("Bronze Package");
      cpackage.setBounds(250,110,200,20);
      add(cpackage);
  
    JLabel Iblpersons = new JLabel("Total Persons");
    Iblpersons.setFont(new Font("Tahoma", Font.PLAIN, 16));
    Iblpersons.setBounds(40, 150, 150, 25);
    add(Iblpersons);
      
    tfpersons = new JTextField("1");
    tfpersons.setBounds(250, 150, 200, 20);
    add(tfpersons);
    
    JLabel Iblid = new JLabel("Id");
    Iblid.setFont(new Font("Tahoma", Font.PLAIN, 16));
    Iblid.setBounds(40, 190, 150, 20);
    add(Iblid);
      
    labelid = new JLabel();
    labelid.setBounds(250, 190, 200, 25);
    add(labelid);
    
    JLabel Iblnumber = new JLabel("Number");
    Iblnumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
    Iblnumber.setBounds(40, 230, 150, 25);
    add(Iblnumber);
      
    labelnumber = new JLabel();
    labelnumber.setBounds(250, 230, 150, 25);
    add(labelnumber);
    
    JLabel Iblphonenumber = new JLabel("Phonenumber");
    Iblphonenumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
    Iblphonenumber.setBounds(40, 270, 150, 20);
    add(Iblphonenumber);
      
    labelphonenumber = new JLabel();
    labelphonenumber.setBounds(250, 270, 200, 25);
    add(labelphonenumber);
    
    JLabel Ibltotal = new JLabel("Total price");
    Ibltotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
    Ibltotal.setBounds(40, 310, 150, 25);
    add(Ibltotal);
      
    labelprice = new JLabel();
    labelprice.setBounds(250, 310, 150, 25);
    add(labelprice);
    
    
     try {
       Conn conn = new Conn();
       String query = "Select * from customer where username = '"+username+"'";
       ResultSet rs = conn.s.executeQuery(query);
       while(rs.next())  {
          labelusername.setText(rs.getString("username"));
          labelid.setText(rs.getString("id"));
          labelnumber.setText(rs.getString("number"));
          labelphonenumber.setText(rs.getString("phonenumber"));

       }
   } catch (Exception e) {
       e.printStackTrace();
   }
     checkprice = new JButton("Check Price");
     checkprice.setBackground(Color.BLACK);
     checkprice.setForeground(Color.WHITE);
     checkprice.setBounds(60, 380, 120, 25);
     checkprice.addActionListener(this);
     add(checkprice);
     
     bookpackage = new JButton("Book Package");
     bookpackage.setBackground(Color.BLACK);
     bookpackage.setForeground(Color.WHITE);
     bookpackage.setBounds(340, 380, 120, 25);
     bookpackage.addActionListener(this);
     add(bookpackage);
     
      back = new JButton("Back");
     back.setBackground(Color.BLACK);
     back.setForeground(Color.WHITE);
     back.setBounds(600, 380, 120, 25);
     back.addActionListener(this);
     add(back);
     
     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
    Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel I12 = new JLabel(i3);
    I12.setBounds(550, 20, 500, 400);
     add(I12);
   
      setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)  {
        if(ae.getSource() == checkprice) {
            String pack = cpackage.getSelectedItem();
            int cost = 0;
            if(pack.equals("Gold Package")) {
            cost += 12000;
        } else if (pack.equals("Silver Package")) {
            cost += 25000;
        } else {
            cost += 32000;
        }
            int persons = Integer.parseInt(tfpersons.getText());
            cost *= persons;
            labelprice.setText("Rs " + cost);
            
        } else if(ae.getSource() == bookpackage) {
            try {
                Conn c = new Conn();
                c.s.executeUpdate("insert into bookpackage values('"+labelusername.getText()+"', '"+cpackage.getSelectedItem()+"','"+tfpersons.getText()+"', '"+labelid.getText()+"', '"+labelnumber.getText()+"','"+labelphonenumber.getText()+"','"+labelprice.getText()+"')");
            
            JOptionPane.showMessageDialog(null, "Package Booked Successfully");
            setVisible(false);
            } catch(Exception e)  {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new BookPackage("sana");
    }
}

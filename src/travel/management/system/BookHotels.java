package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BookHotels extends JFrame implements ActionListener {
    
    Choice chotel, cac, cfood;
    JTextField tfpersons, tfdays ;
    String username;
    JLabel labelusername, labelid, labelnumber, labelphonenumber, labelprice;
    JButton checkprice, bookhotel, back;
    
    
    BookHotels(String username) {
        this.username = username;
      setBounds(250, 130, 1000, 700);
      setLayout(null);
      getContentPane().setBackground(Color.WHITE);
      
      JLabel text = new JLabel("BOOK HOTELS");
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
    
    JLabel IblPackage = new JLabel("Select Hotel");
    IblPackage.setFont(new Font("Tahoma", Font.PLAIN, 16));
    IblPackage.setBounds(40, 110, 150, 20);
    add(IblPackage);
      
     chotel = new Choice();
     chotel.setBounds(250,110,200,20);
     add(chotel);
  
     try {
         Conn c = new Conn();
         ResultSet  rs = c.s.executeQuery("Select * from hotel");
         while(rs.next())  {
             chotel.add(rs.getString("name"));
         }
         
     } catch (Exception e) {
         e.printStackTrace();
     }
    JLabel Iblpersons = new JLabel("Total Persons");
    Iblpersons.setFont(new Font("Tahoma", Font.PLAIN, 16));
    Iblpersons.setBounds(40, 150, 150, 25);
    add(Iblpersons);
      
    tfpersons = new JTextField("1");
    tfpersons.setBounds(250, 150, 200, 20);
    add(tfpersons);
    
     JLabel Ibldays = new JLabel("no. of Days");
    Ibldays.setFont(new Font("Tahoma", Font.PLAIN, 16));
    Ibldays.setBounds(40, 190, 150, 25);
    add(Ibldays);
      
    tfdays = new JTextField("1");
    tfdays.setBounds(250, 190, 200, 20);
    add(tfdays);
    
    JLabel Iblac = new JLabel("AC/ Non-AC");
    Iblac.setFont(new Font("Tahoma", Font.PLAIN, 16));
    Iblac.setBounds(40, 230, 150, 25);
    add(Iblac);
    
    cac = new Choice();
    cac.add("AC");
    cac.add("Non-AC");
     cac.setBounds(250,230,200,20);
     add(cac);
     
     JLabel Iblfood = new JLabel("Food Included");
    Iblfood.setFont(new Font("Tahoma", Font.PLAIN, 16));
    Iblfood.setBounds(40, 270, 150, 25);
    add(Iblfood);
    
    cfood = new Choice();
    cfood.add("Yes");
    cfood.add("No");
     cfood.setBounds(250,270,200,20);
     add(cfood);
     
    JLabel Iblid = new JLabel("Id");
    Iblid.setFont(new Font("Tahoma", Font.PLAIN, 16));
    Iblid.setBounds(40, 310, 150, 20);
    add(Iblid);
      
    labelid = new JLabel();
    labelid.setBounds(250, 310, 200, 25);
    add(labelid);
    
    JLabel Iblnumber = new JLabel("Number");
    Iblnumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
    Iblnumber.setBounds(40, 350, 150, 25);
    add(Iblnumber);
      
    labelnumber = new JLabel();
    labelnumber.setBounds(250, 350, 150, 25);
    add(labelnumber);
    
    JLabel Iblphonenumber = new JLabel("Phonenumber");
    Iblphonenumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
    Iblphonenumber.setBounds(40, 390, 150, 20);
    add(Iblphonenumber);
      
    labelphonenumber = new JLabel();
    labelphonenumber.setBounds(250, 390, 200, 25);
    add(labelphonenumber);
    
    JLabel Ibltotal = new JLabel("Total price");
    Ibltotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
    Ibltotal.setBounds(40, 430, 150, 25);
    add(Ibltotal);
      
    labelprice = new JLabel();
    labelprice.setBounds(250, 430, 150, 25);
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
     checkprice = new JButton("Check Hotel");
     checkprice.setBackground(Color.BLACK);
     checkprice.setForeground(Color.WHITE);
     checkprice.setBounds(60, 490, 120, 25);
     checkprice.addActionListener(this);
     add(checkprice);
     
     bookhotel = new JButton("Book Hotel");
     bookhotel.setBackground(Color.BLACK);
     bookhotel.setForeground(Color.WHITE);
     bookhotel.setBounds(340, 490, 120, 25);
     bookhotel.addActionListener(this);
     add(bookhotel);
     
      back = new JButton("Back");
     back.setBackground(Color.BLACK);
     back.setForeground(Color.WHITE);
     back.setBounds(600, 490, 120, 25);
     back.addActionListener(this);
     add(back);
     
     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
    Image i2 = i1.getImage().getScaledInstance(600, 300, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel I12 = new JLabel(i3);
    I12.setBounds(500, 20, 600, 400);
     add(I12);
   
      setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)  {
        if(ae.getSource() == checkprice) {
            try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("Select * from hotel where name='"+chotel.getSelectedItem()+"'");
            while(rs.next()) {
                int cost = Integer.parseInt(rs.getString("costperperson"));
                int food = Integer.parseInt(rs.getString("foodincluded"));
                int ac = Integer.parseInt(rs.getString("acroom"));

               int persons =Integer.parseInt(tfpersons.getText());
               int days =Integer.parseInt(tfdays.getText());
               
               String acselected =cac.getSelectedItem();
               String foodselected = cfood.getSelectedItem();
               
               if (persons * days > 0) {  
                   int total = 0;
                   total += acselected.equals("AC") ? ac : 0;
                   total += foodselected.equals("Yes") ?food : 0;
                   total += cost;
                   total= total * persons * days;
                   labelprice.setText("Rs " + total);
                   
               } else {
                   JOptionPane.showMessageDialog(null, "Please enter a valid number");
                }
               
               }
            } catch (Exception e) {
                e.printStackTrace();
            }       
        } else if(ae.getSource() == bookhotel) {
            try {
                Conn c = new Conn();
                c.s.executeUpdate("insert into bookhotel1 values('"+labelusername.getText()+"', '"+chotel.getSelectedItem()+"','"+tfpersons.getText()+"','"+tfdays.getText()+"', '"+cac.getSelectedItem()+"', '"+cfood.getSelectedItem()+"', '"+labelid.getText()+"', '"+labelnumber.getText()+"','"+labelphonenumber.getText()+"','"+labelprice.getText()+"')");
            
             JOptionPane.showMessageDialog(null, "Hotel Booked Successfully");
             setVisible(false);
         } catch(Exception e)  {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }
      }
    public static void main(String[] args) {
        new BookHotels("sana");
    }
}


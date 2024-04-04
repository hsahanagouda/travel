package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {
    
 String username;
 JButton addPersonalDetails, viewPersonalDetails, updatePersonalDetails, checkpackages, bookpackages, viewpackages, viewhotels, destinations, bookhotels, viewbookedhotels,payments, calculators, notepad, about ,  deletePersonalDetails ;
 
    Dashboard(String username)   {
       this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0, 0, 102));
        p1.setBounds(0, 0, 1600, 50);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon =new JLabel(i3);
        icon.setBounds(5, 0, 60, 60);
        p1.add(icon);
        
         JLabel heading = new JLabel("Dashboard");
         heading.setBounds(80, 10, 300, 40);
         heading.setForeground(Color.WHITE);
         heading.setFont(new Font("Tahoma", Font.BOLD,30));
         p1.add(heading);
         
         JPanel p2 = new JPanel();
         p2.setLayout(null);
         p2.setBackground(new Color(0, 0, 102));
         p2.setBounds(0, 50, 300, 900);
         add(p2);
        
         addPersonalDetails = new JButton("Add Personal Details");
         addPersonalDetails.setBounds(0, 0, 300, 50);
         addPersonalDetails.setBackground(new Color(0, 0, 102));
         addPersonalDetails.setForeground(Color.WHITE);
         addPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
         addPersonalDetails.setMargin(new Insets(0, 0, 0, 60));
         addPersonalDetails.addActionListener(this);
         p2.add(addPersonalDetails);
         
         updatePersonalDetails = new JButton("Update Personal Details");
         updatePersonalDetails.setBounds(0, 40, 300, 50);
         updatePersonalDetails.setBackground(new Color(0, 0, 102));
         updatePersonalDetails.setForeground(Color.WHITE);
         updatePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
         updatePersonalDetails.setMargin(new Insets(0, 0, 0, 30));
          updatePersonalDetails.addActionListener(this);
         p2.add(updatePersonalDetails);
         
         viewPersonalDetails = new JButton("View Details");
         viewPersonalDetails.setBounds(0, 80, 300, 50);
         viewPersonalDetails.setBackground(new Color(0, 0, 102));
         viewPersonalDetails.setForeground(Color.WHITE);
         viewPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
         viewPersonalDetails.setMargin(new Insets(0, 0, 0, 130));
         viewPersonalDetails.addActionListener(this);
         p2.add(viewPersonalDetails);
         
          deletePersonalDetails = new JButton(" Delete personal Details");
          deletePersonalDetails.setBounds(0, 120, 300, 50);
          deletePersonalDetails.setBackground(new Color(0, 0, 102));
          deletePersonalDetails.setForeground(Color.WHITE);
          deletePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
          deletePersonalDetails.setMargin(new Insets(0, 0, 0, 40));
            deletePersonalDetails.addActionListener(this);
          p2.add( deletePersonalDetails);
         
          checkpackages = new JButton(" Checkpackages ");
          checkpackages.setBounds(0, 160, 300, 50);
          checkpackages.setBackground(new Color(0, 0, 102));
          checkpackages.setForeground(Color.WHITE);
          checkpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
          checkpackages.setMargin(new Insets(0, 0, 0, 110));
          checkpackages.addActionListener(this);
          p2.add(checkpackages );
         
            bookpackages = new JButton(" Bookpackages ");
           bookpackages.setBounds(0, 200, 300, 50);
           bookpackages.setBackground(new Color(0, 0, 102));
           bookpackages.setForeground(Color.WHITE);
           bookpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
           bookpackages.setMargin(new Insets(0, 0, 0, 120));
            bookpackages.addActionListener(this);
            p2.add( bookpackages );
          
           viewpackages = new JButton(" Viewpackages ");
           viewpackages.setBounds(0, 240, 300, 50);
           viewpackages.setBackground(new Color(0, 0, 102));
           viewpackages.setForeground(Color.WHITE);
           viewpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
           viewpackages.setMargin(new Insets(0, 0, 0, 120));
           viewpackages.addActionListener(this);
          p2.add( viewpackages );
          
           viewhotels = new JButton(" View Hotels ");
           viewhotels.setBounds(0, 280, 300, 50);
           viewhotels.setBackground(new Color(0, 0, 102));
           viewhotels.setForeground(Color.WHITE);
           viewhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
           viewhotels.setMargin(new Insets(0, 0, 0, 130));
           viewhotels.addActionListener(this);

          p2.add( viewhotels );
          
           bookhotels = new JButton(" Book Hotels ");
           bookhotels.setBounds(0, 320, 300, 50);
           bookhotels.setBackground(new Color(0, 0, 102));
           bookhotels.setForeground(Color.WHITE);
           bookhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
           bookhotels.setMargin(new Insets(0, 0, 0, 140));
           bookhotels.addActionListener(this);
          p2.add( bookhotels );
          
           viewbookedhotels = new JButton(" View Booked Hotels ");
           viewbookedhotels.setBounds(0, 360, 300, 50);
           viewbookedhotels.setBackground(new Color(0, 0, 102));
           viewbookedhotels.setForeground(Color.WHITE);
           viewbookedhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
           viewbookedhotels.setMargin(new Insets(0, 0, 0, 70));
           viewbookedhotels.addActionListener(this);
          p2.add( viewbookedhotels );
          
          
           destinations = new JButton(" Destinations ");
           destinations.setBounds(0, 400, 300, 50);
           destinations.setBackground(new Color(0, 0, 102));
           destinations.setForeground(Color.WHITE);
           destinations.setFont(new Font("Tahoma", Font.PLAIN, 20));
           destinations.setMargin(new Insets(0, 0, 0, 125));
           destinations.addActionListener(this);
          p2.add( destinations );
          
           payments = new JButton("Payments");
           payments.setBounds(0, 440, 300, 50);
           payments.setBackground(new Color(0, 0, 102));
           payments.setForeground(Color.WHITE);
           payments.setFont(new Font("Tahoma", Font.PLAIN, 20));
           payments.setMargin(new Insets(0, 0, 0, 155));
           payments.addActionListener(this);
          p2.add( payments );
          
           calculators = new JButton("Calculators");
           calculators.setBounds(0, 480, 300, 50);
           calculators.setBackground(new Color(0, 0, 102));
           calculators.setForeground(Color.WHITE);
           calculators.setFont(new Font("Tahoma", Font.PLAIN, 20));
           calculators.setMargin(new Insets(0, 0, 0, 145));
           calculators.addActionListener(this);
          p2.add( calculators );
          
          notepad = new JButton("Notepad");
           notepad.setBounds(0, 520, 300, 50);
           notepad.setBackground(new Color(0, 0, 102));
           notepad.setForeground(Color.WHITE);
           notepad.setFont(new Font("Tahoma", Font.PLAIN, 20));
           notepad.setMargin(new Insets(0, 0, 0, 155));
           notepad.addActionListener(this);
          p2.add( notepad );
          
          about = new JButton("About");
           about.setBounds(0, 560, 300, 50);
           about.setBackground(new Color(0, 0, 102));
           about.setForeground(Color.WHITE);
           about.setFont(new Font("Tahoma", Font.PLAIN, 20));
           about.setMargin(new Insets(0, 0, 0, 175));
           about.addActionListener(this);
          p2.add(about );
          
          ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
          Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
          ImageIcon i6 = new ImageIcon(i5);
          JLabel image = new JLabel(i6); 
          image.setBounds(0, 0, 1650,1000);
          add(image);
          
          JLabel text = new JLabel("Travel and Toursim Management System");
          text.setBounds(400, 70, 1200, 70);
          text.setForeground(Color.WHITE);
          text.setFont(new Font("Raleway", Font.PLAIN, 52));
          image.add(text);
          
          
        setVisible(true);        
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == addPersonalDetails)  {
            new AddCustomer(username);
        } else if (ae.getSource() == viewPersonalDetails) {
            new ViewCustomer(username);
        } else if (ae.getSource() == updatePersonalDetails) {
            new UpdateCustomer(username);
        } else if (ae.getSource() == checkpackages) {
            new CheckPackages();
        } else if (ae.getSource() == bookpackages)  {
            new BookPackage(username);
        } else if (ae.getSource() == viewpackages)  {
            new ViewPackage(username);
        } else if (ae.getSource() == viewhotels) {
            new CheckHotels();
        } else if (ae.getSource() ==  destinations) {
            new Destinations();
        } else if (ae.getSource() ==  bookhotels) {
            new BookHotels(username);
        } else if (ae.getSource() == viewbookedhotels) {
           new ViewBookedHotels(username);
        } else if (ae.getSource() == payments) {
           new Payment();
        } else if (ae.getSource() == calculators) {  
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if(ae.getSource() == notepad) {
           try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e) {
                e.printStackTrace();  
        }
    }  else if (ae.getSource() == about) {
        new  About();
    }  else if (ae.getSource() ==   deletePersonalDetails) {
        new DeleteDetails(username);
    }  
    }


    public static void main(String[] args) {
    new Dashboard("");
}
    
}

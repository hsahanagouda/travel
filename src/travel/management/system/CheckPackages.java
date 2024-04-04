package travel.management.system;

import javax.swing.*;
import java.awt.*;

public class CheckPackages extends JFrame {
CheckPackages() {
    setBounds(450, 100, 900, 600);
    
    String[] package1 = {"GOLD PACKAGE", "6 Days and 7 Nights", "Airport Assistance","Half Day City Tour", "Daily Buffet" ,"Soft Drinks Free", "Full Day 3 Island Crusie","English Speaking Guide", "BOOK PACKAGE", "SUMMER SPECIAL", "Rs 12000/-", "package1.jpg" };
    String[] package2 = {"SILVER PACKAGE","5 Days and 6 Nights", "Toll Free", "Entrance Free Tickets", "Meet and Greet at Airport", "Welcome Drinks on Arrival","Night Safari", "Crusie with Dinner", "BOOK NOW","WINTER SPECIAL","Rs 2400/-", "package2.jpg"};
    String[] package3 = {"BRONZE PACKAGE","6 Days and 5 Nights", "Return Airfare", "Free Clubbing, Horse Ridding & other Games", "River Raffing", "Hard Drinks Free", "Daily Buffet", "BBQ Dinner", "BOOK NOW", "WINTER SPECIAL", "Rs 32000/-", "package3.jpg"};
    
    JTabbedPane tab = new JTabbedPane();
    
    JPanel p1 = createPackage(package1);
    tab.addTab("Package 1", null, p1);
    
     JPanel p2 = createPackage(package2);
    tab.addTab("Package 2", null, p2);
    
     JPanel p3 = createPackage(package3);
    tab.addTab("Package 3", null, p3);

    add(tab);
    
    setVisible(true);
}

public JPanel createPackage(String[] pack) {
    
    JPanel p1 = new JPanel();
    p1.setLayout(null);
    p1.setBackground(Color.WHITE);
    
    JLabel I1 = new JLabel(pack[0]);
    I1.setBounds(50, 5, 300, 30);
    I1.setForeground(Color.YELLOW);
    I1.setFont(new Font("Tahoma", Font.BOLD,30));
    p1.add(I1);
    
    JLabel I2 = new JLabel(pack[1]);
    I2.setBounds(30, 60, 300, 30);
    I2.setForeground(Color.GREEN);
    I2.setFont(new Font("Tahoma", Font.BOLD,20));
    p1.add(I2);
    
    JLabel I3 = new JLabel(pack[2]);
    I3.setBounds(30, 110, 300, 30);
    I3.setForeground(Color.BLUE);
    I3.setFont(new Font("Tahoma", Font.BOLD,20));
    p1.add(I3);
    
    JLabel I4 = new JLabel(pack[3]);
    I4.setBounds(30, 160, 300, 30);
    I4.setForeground(Color.BLUE);
    I4.setFont(new Font("Tahoma", Font.BOLD,20));
    p1.add(I4);
    
    JLabel I5 = new JLabel(pack[4]);
    I5.setBounds(30, 210, 300, 30);
    I5.setForeground(Color.YELLOW);
    I5.setFont(new Font("Tahoma", Font.BOLD,20));
    p1.add(I5);
    
    JLabel I6 = new JLabel(pack[5]);
    I6.setBounds(30, 260, 300, 30);
    I6.setForeground(Color.RED);
    I6.setFont(new Font("Tahoma", Font.BOLD,20));
    p1.add(I6);
    
    JLabel I7 = new JLabel(pack[6]);
    I7.setBounds(30, 310, 300, 30);
    I7.setForeground(Color.BLUE);
    I7.setFont(new Font("Tahoma", Font.BOLD,20));
    p1.add(I7);
    
    JLabel I8 = new JLabel(pack[7]);
    I8.setBounds(30, 360, 300, 30);
    I8.setForeground(Color.RED);
    I8.setFont(new Font("Tahoma", Font.BOLD,20));
    p1.add(I8);
    
    JLabel I9 = new JLabel(pack[8]);
    I9.setBounds(60, 430, 300, 30);
    I9.setForeground(Color.BLACK);
    I9.setFont(new Font("Tahoma", Font.BOLD,25));
    p1.add(I9);
    
    JLabel I10 = new JLabel(pack[9]);
    I10.setBounds(80, 480, 300, 30);
    I10.setForeground(Color.MAGENTA);
    I10.setFont(new Font("Tahoma", Font.BOLD,25));
    p1.add(I10);
    
    JLabel I11 = new JLabel(pack[10]);
    I11.setBounds(500, 480, 300, 30);
    I11.setForeground(Color.CYAN);
    I11.setFont(new Font("Tahoma", Font.BOLD,25));
    p1.add(I11);
    
     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/"+pack[11]));
   Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
   ImageIcon i3 = new ImageIcon(i2);
   JLabel I12 = new JLabel(i3);
   I12.setBounds(350, 20, 500, 400);
   p1.add(I12);
   
   return p1;
}

    public static void main(String[] args) {
     new CheckPackages();
    }    
    }


import java.awt.event.*;
import java.sql.SQLException;
import javax.swing.*;

public class Driver {
   
  JButton a, b, c, d, f, g, h;
  JTextField tf1,tf2,tf3,tf4,tf5; 
  JLabel j1,j2,j3,j4,j5;
  Database db = Database.getInstance();
  
     Driver(){
       
       try {
         db.connect();
       } catch (SQLException e) {
         System.out.println("Database connection failed");
         e.printStackTrace();
       }
       
       System.out.println("Connected");
       
       
        JFrame win = new JFrame();
        
        JButton a = new JButton("Insert");
        a.setBounds(20, 210, 100, 40);
        win.add(a);
        
        JButton b = new JButton("Delete");
        b.setBounds(200, 210, 100, 40);
        win.add(b);
        
        JButton c = new JButton("Update");
        c.setBounds(370, 210, 100, 40);       
        win.add(c);
        
        JButton d = new JButton("Okay");
        d.setBounds(20, 310, 100, 40);
        win.add(d);
        d.setVisible(false);
        
        JButton f = new JButton("Cancel");
        f.setBounds(180, 310, 100, 40);
        win.add(f);
        f.setVisible(false);
        
        JButton g = new JButton("Okay");
        g.setBounds(20, 310, 100, 40);
        win.add(g);
        g.setVisible(false);
        
        JButton h = new JButton("Okay");
        h.setBounds(20, 310, 100, 40);
        win.add(h);
        h.setVisible(false);
        
        tf1 = new JTextField();  
        tf1.setBounds(50,50,150,20);
        win.add(tf1);
        tf1.setVisible(false);
        
        tf2 = new JTextField();  
        tf2.setBounds(50,100,150,20);
        win.add(tf2);
        tf2.setVisible(false);
        
        tf3 = new JTextField();  
        tf3.setBounds(50,150,150,20);
        win.add(tf3);
        tf3.setVisible(false);
        
        tf4 = new JTextField();  
        tf4.setBounds(50,200,150,20);
        win.add(tf4);
        tf4.setVisible(false);
        
        tf5 = new JTextField();  
        tf5.setBounds(50,250,150,20);
        win.add(tf5);
        tf5.setVisible(false);
        
        j1 = new JLabel("Start Year");  
        j1.setBounds(250,50,100,30);
        win.add(j1);
        j1.setVisible(false);
        
        j2 = new JLabel("FirstName");  
        j2.setBounds(250,100,100,30);
        win.add(j2);
        j2.setVisible(false);
        
        j3 = new JLabel("Last Name");  
        j3.setBounds(250,150,100,30);
        win.add(j3);
        j3.setVisible(false);
        
        j4 = new JLabel("UserID");  
        j4.setBounds(250,200,100,30);
        win.add(j4);
        j4.setVisible(false);
        
        j5 = new JLabel("Age");  
        j5.setBounds(250,250,100,30);
        win.add(j5);
        j5.setVisible(false);
        
        
        a.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            a.setVisible(false);
            b.setVisible(false);
            c.setVisible(false);
            d.setVisible(true);
            f.setVisible(true);
            tf1.setVisible(true);
            tf2.setVisible(true);
            tf3.setVisible(true);
            tf4.setVisible(true);
            tf5.setVisible(true);
            j1.setVisible(true);
            j2.setVisible(true);
            j3.setVisible(true);
            j4.setVisible(true);
            j5.setVisible(true);
          }
        });
        
        b.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            a.setVisible(false);
            b.setVisible(false);
            c.setVisible(false);
            g.setVisible(true);
            f.setVisible(true);
            tf4.setVisible(true);
            j4.setVisible(true);
          }
        });
        
        c.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            a.setVisible(false);
            b.setVisible(false);
            c.setVisible(false);
            h.setVisible(true);
            f.setVisible(true);
            tf1.setVisible(true);
            tf2.setVisible(true);
            tf3.setVisible(true);
            tf4.setVisible(true);
            tf5.setVisible(true);
            j1.setVisible(true);
            j2.setVisible(true);
            j3.setVisible(true);
            j4.setVisible(true);
            j5.setVisible(true);
          }
        });
        
        d.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent ev) {
            a.setVisible(true);
            b.setVisible(true);
            c.setVisible(true);
            tf1.setVisible(false);
            tf2.setVisible(false);
            tf3.setVisible(false);
            tf4.setVisible(false);
            tf5.setVisible(false);
            j1.setVisible(false);
            j2.setVisible(false);
            j3.setVisible(false);
            j4.setVisible(false);
            j5.setVisible(false);
            d.setVisible(false);
            f.setVisible(false);
            String s1 = tf1.getText();
            String s2 = tf2.getText();
            String s3 = tf3.getText();
            String s4 = tf4.getText();
            String s5 = tf5.getText();
            int start = Integer.parseInt(s1);
            int id = Integer.parseInt(s4);
            int age = Integer.parseInt(s5);
            
            User u = new User(start, s2, s3, id, age);
            try {
              db.insertUser(u);
            } catch (SQLException e) {
              System.out.println("Something went wrong");
              e.printStackTrace();
            }
          }
          });
        
        f.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            a.setVisible(true);
            b.setVisible(true);
            c.setVisible(true);
            tf1.setVisible(false);
            tf2.setVisible(false);
            tf3.setVisible(false);
            tf4.setVisible(false);
            tf5.setVisible(false);
            j1.setVisible(false);
            j2.setVisible(false);
            j3.setVisible(false);
            j4.setVisible(false);
            j5.setVisible(false);
            d.setVisible(false);
            f.setVisible(false);
            g.setVisible(false);
            h.setVisible(false);
            
            
          }
        });
        
        g.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            a.setVisible(true);
            b.setVisible(true);
            c.setVisible(true);
            tf1.setVisible(false);
            tf2.setVisible(false);
            tf3.setVisible(false);
            tf4.setVisible(false);
            tf5.setVisible(false);
            j1.setVisible(false);
            j2.setVisible(false);
            j3.setVisible(false);
            j4.setVisible(false);
            j5.setVisible(false);
            g.setVisible(false);
            f.setVisible(false);
            
            String s4 = tf4.getText();
            int id = Integer.parseInt(s4);
            
            try {
              db.DeleteUser(id);
            } catch (SQLException e1) {
              System.out.println("Something went wrong");
              e1.printStackTrace();
            }
          }
        });
        
        h.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            a.setVisible(true);
            b.setVisible(true);
            c.setVisible(true);
            tf1.setVisible(false);
            tf2.setVisible(false);
            tf3.setVisible(false);
            tf4.setVisible(false);
            tf5.setVisible(false);
            j1.setVisible(false);
            j2.setVisible(false);
            j3.setVisible(false);
            j4.setVisible(false);
            j5.setVisible(false);
            h.setVisible(false);
            f.setVisible(false);
            String s1 = tf1.getText();
            String s2 = tf2.getText();
            String s3 = tf3.getText();
            String s4 = tf4.getText();
            String s5 = tf5.getText();
            int start = Integer.parseInt(s1);
            int id = Integer.parseInt(s4);
            int age = Integer.parseInt(s5);
            
            User u = new User(start, s2, s3, id, age);
            try {
              db.DeleteUser(id);
              db.insertUser(u);
            } catch (SQLException e1) {
              System.out.println("Something went wrong");
              e1.printStackTrace();
            }            
          }
        });
          
        win.setSize(500,500);  
        win.setTitle("Inserting, Deleting, Updating Information");
        win.setLayout(null);  
        win.setVisible(true);
      }
      
      
    public static void main(String[]args) {
      new Driver();
    }
      
}
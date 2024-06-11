package travel.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener {
   
    About(){
        setBounds(600, 200, 500, 500);
        setLayout(null);
        getContentPane().setBackground(Color.white);
       
        JLabel l1 = new JLabel("ABOUT US");
        l1.setBounds(200, 10, 100, 40);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(l1);
   
       
        TextArea area = new TextArea("Tourism Management System\n" + "\n" + "About  Us :-\n" + "\n" + "The objective of "
                + "the Travel and Tourism Management System project is to develop a system that automates the processes and "
                + "activities of a travel and the purpose is to design a system using which one can perform all operations "
                + "related to traveling.\n" + "\n" + "This application will help in accessing the information related to the "
                + "travel to the particular destination with great ease. The users can track the information related to their "
                + "tours by this application. The travel agency information can also be obtained through this application.\n" +"\n" +
"Advantages of Project:- Gives accurate information. Simalifia",10, 40, Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20, 100, 450, 300);
        add(area);
       
        JButton back = new JButton("Back");
       back.setBounds(200, 420, 100, 25);
       back.addActionListener(this);
       add(back);
       
        setVisible(true);
    }
   
    public void actionPerformed(ActionEvent ae)
    {
    setVisible(false);
   
   
    }
 
    public static void main(String args[]) {
        new About();
    }
}
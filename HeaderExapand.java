/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hrana
 */
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

public class HeaderExapand 
{
public static void main(String args[])
{
    JLabel l=new JLabel("This is Header : ");
    JFrame f=new JFrame("Frame");
    
    JButton b=new JButton(" Click Me" );

    JPanel p1=new JPanel();
    p1.setBounds(3,5,377,50);
    p1.setBackground(Color.GRAY);
    b.setBounds(240,60,100,30);
    JPanel p = new JPanel();
    p.setBounds(3,50,377,420);    
    p.setBackground(Color.ORANGE);  

    b.addActionListener(new ActionListener()
    {
       int temp=0;
       public void actionPerformed(ActionEvent e)
        {
           
            if(temp==0)
            {
            p.setBounds(120,120,100,150);
            temp++;
            }
            else if(temp==1)
            {
            p.setBounds(3,50,377,420);
            temp--;
            }           
        }


    });

    f.add(p);
    p1.add(b);
    f.add(p1);
    p1.add(l);
    p1.add(b);
    f.setSize(400,500);
    f.setLayout(null);
    f.setVisible(true);

}   
}

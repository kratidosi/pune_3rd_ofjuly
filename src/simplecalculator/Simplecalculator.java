/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalculator;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;


/**
 *
 * @author gagan
 */
public class Simplecalculator implements ActionListener
{
    JTextField tf1,tf2,tf3;
    JButton b1,b2;
 public Simplecalculator()
 {
     JFrame jf=new JFrame("Simplecalculator");
     jf.setSize(500,500);
     tf1=new JTextField();
       tf2=new JTextField();
         tf3=new JTextField();
         
         tf1.setBounds(50,50,80,30);
           tf2.setBounds(50,100,80,30);
             tf3.setBounds(50,150,80,30);
             
             b1=new JButton("+");
             b1.setBounds(60, 190, 50, 50);
             b1.addActionListener(this);
             
              b2=new JButton("-");
             b2.setBounds(100,190,50, 50);
             b2.addActionListener(this);
             
             jf.add(b1);
             jf.add(b2);
             jf.add(tf1);
             jf.add(tf2);
             jf.add(tf3);
             
             jf.setLayout(null);
             jf.setVisible(true);
             
             
      }   
 public void actionPerformed(ActionEvent e)
 {   
       String s1=tf1.getText();
        String s2=tf2.getText();
        int a=Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
        int c=0;
        if(e.getSource()==b1)
        {  c=a+b;
        }
         if(e.getSource()==b2)
        {  c=a-b;
        }
         String result=String.valueOf(c);
         tf3.setText(result);
         
        }
 
    public static void main(String[] args) {
   new Simplecalculator();     // TODO code application logic here
    }
    
}

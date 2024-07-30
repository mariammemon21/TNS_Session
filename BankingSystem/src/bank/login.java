package bank;

import java.awt.Color;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class login extends JFrame implements ActionListener {
    
	JLabel label1, label2, label3, label4;
	JTextField textField;
	JPasswordField textField1;
	
	JButton jb1,jb2,jb3;
	
	
    login() {
        super("Banking System");
       
        
        
        label1 = new JLabel ("Welcome to ATM");       
        label1 = new JLabel("ATM at your Fingertips!!");
        label1.setForeground(Color.white);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 38));
        label1.setBounds(380,20,450,50);
        add(label1);
            
        label2 = new JLabel("Login");
        label2.setForeground(Color.blue);
        label2.setFont(new Font("Ralway", Font.BOLD, 28));
        label2.setBounds(140,20,375,50);
        add(label2);
        
        label3 = new JLabel("Email:");
        label3.setForeground(Color.black);
        label3.setFont(new Font("Calibri", Font.ITALIC, 18));
        label3.setBounds(40,80,375,50);
        add(label3);
        
        textField = new JTextField(15);
        textField.setBounds(90,90,230,25);
        textField.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField);
        
        label3 = new JLabel("Password:");
        label3.setForeground(Color.black);
        label3.setFont(new Font("Calibri", Font.ITALIC, 18));
        label3.setBounds(40,120,375,50);
        add(label3);
        
        textField1 = new JPasswordField(15);
        textField1.setBounds(120,130,210,25);
        textField1.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField1);
        
        jb1 = new JButton("Login");
        jb1.setFont(new Font("Arial", Font.BOLD, 14));
        jb1.setForeground(Color.blue);
        jb1.setBounds(140,180,100,25);
        jb1.addActionListener(this);
        add(jb1);
        
        label4 = new JLabel("Don't have an account?");
        label4.setForeground(Color.blue);
        label4.setFont(new Font("Calibri", Font.ITALIC, 15));
        label4.setBounds(60,250,150,100);
        add(label4);
        
        jb2 = new JButton("Sign up");
        jb2.setFont(new Font("Arial", Font.BOLD, 13));
        jb2.setForeground(Color.blue);
        jb2.setBounds(210,286,90,20);
        jb2.addActionListener(this);
        add(jb2);
        
        // Load and scale the background image
        ImageIcon j1 = new ImageIcon(ClassLoader.getSystemResource("icon/Background1.png"));
        Image j2 = j1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon j3 = new ImageIcon(j2);
        JLabel background = new JLabel(j3);
        background.setBounds(0, 0, 850, 480);
        add(background);
        
        // Set layout and window properties
        setLayout(null);
        setSize(850, 480);
        setLocation(400, 200);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    	
    	try {
    		if(e.getSource() == jb1) {
    			
    			
    		}else if(e.getSource()== jb2 ) {
    		}
    		
    	}catch(Exception E) {
    		E.printStackTrace();
    	}

    }
    
    
    
    public static void main(String[] args) {
        new login();
    }
}

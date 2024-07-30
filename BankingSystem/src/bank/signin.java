package bank;

import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class signin extends JFrame implements ActionListener{
	
	JLabel l1,l2,l3,l4,l5,l6;
	
	JTextField textname,otp,accno,pass;
	JRadioButton r1,r2;
	JButton jl1;
	
	
	signin(){
		super("Banking System");
		
		l1 = new JLabel("Sign-In");
        l1.setForeground(Color.white);
        l1.setFont(new Font("Arial", Font.ITALIC , 28));
        l1.setBounds(390,35,375,50);
        add(l1);
        
        l2 = new JLabel("Mobile Number");
        l2.setForeground(Color.white);
        l2.setFont(new Font("Calibri", Font.ITALIC , 18));
        l2.setBounds(270,100,375,50);
        add(l2);
        
        textname =  new  JTextField(15);
        textname.setBounds(400,110,200,25);
        textname.setFont(new Font("Arial", Font.BOLD, 14));
        add(textname);
        
        l3 = new JLabel("Account Number");
        l3.setForeground(Color.white);
        l3.setFont(new Font("Calibri", Font.ITALIC , 18));
        l3.setBounds(260,140,375,50);
        add(l3);
        
        l6 = new JLabel("Gender");
        l6.setForeground(Color.white);
        l6.setFont(new Font("Calibri", Font.ITALIC , 18));
        l6.setBounds(300,180,375,50);
        add(l6);
        
        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 10));
        r1.setBounds(400,195,65,18);
        add(r1);
        
        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 10));
        r2.setBounds(495,195,65,18);
        add(r2);
        
        jl1 = new JButton("Sign In");
        jl1.setFont(new Font("Arial", Font.BOLD, 14));
        jl1.setForeground(Color.BLUE);
        jl1.setBounds(400,320,100,25);
        jl1.addActionListener(this);
        add(jl1);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        
        
        l4 = new JLabel("OTP");
        l4.setForeground(Color.white);
        l4.setFont(new Font("Calibri", Font.ITALIC , 18));
        l4.setBounds(310,220,375,50);
        add(l4);
        
        l5 = new JLabel("Password");
        l5.setForeground(Color.white);
        l5.setFont(new Font("Calibri", Font.ITALIC , 18));
        l5.setBounds(280,260,375,50);
        add(l5);
        
        otp =  new  JTextField(15);
        otp.setBounds(400,225,200,25);
        otp.setFont(new Font("Arial", Font.BOLD, 14));
        add(otp);
        
        accno =  new  JTextField(15);
        accno.setBounds(400,145,200,25);
        accno.setFont(new Font("Arial", Font.BOLD, 14));
        add(accno);
        
        pass =  new  JTextField(15);
        pass.setBounds(400,265,200,25);
        pass.setFont(new Font("Arial", Font.BOLD, 14));
        add(pass);
        
        
        
		
		 // Load and scale the background image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/Background2.png"));
        Image i2 = i1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel background = new JLabel(i3);
        background.setBounds(0, 0, 850, 480);
        add(background);
 
		
		// Set layout and window properties
        setLayout(null);
        setSize(850,480);
        setLocation(400, 200);
        setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		String name = textname.getText();
		String otp1 = otp.getText();
		String pass1 = pass.getText();
		String accno1 = accno.getText();
		String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }else if (r2.isSelected()){
            gender = "Female";
        }
		
        try {
        	if (textname.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            }else {
                co c = new co();
                String q = "insert into signup values('"+name+"','"+otp1+"','"+pass1+"','"+accno1+"','"+gender+"' )";
                c.statement.executeUpdate(q);
                setVisible(false);
            }

        }catch(Exception E)
        {
        	E.printStackTrace();
        }
	}
	
	public static void main(String[] args) {
		new signin();
		
	}
}

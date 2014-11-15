package com.Github.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class MainFrame extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 7227440523487440729L;
	private JButton Button_Cancel;
	private JButton Button_Confirm;
	private JLabel Label_User;
	private JLabel Label_Password;
	private JLabel Label_IP;
	private JLabel Label_Port;
	private JTextField TextField_User;
	private JPasswordField PassField_Password;
	private JTextField TextField_IP;
	private JTextField TextField_Port;
	
	public void init()
	{
		this.setTitle("Login");
		this.setSize(325, 300);
		this.setLocation(Main.getULPoint(325, 300));
		this.setResizable(false);
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		}catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		JPanel panel=new JPanel();
		panel.setLayout(null);
		Button_Confirm=new JButton("Confirm");
		Button_Confirm.setBounds(65, 200, 80, 35);
		Button_Confirm.addActionListener(this);
		Button_Cancel=new JButton("Cancel");
		Button_Cancel.setBounds(175, 200, 80, 35);
		Button_Cancel.addActionListener(this);
		Label_User=new JLabel("Username:");
		Label_User.setBounds(65, 50, 100, 20);
		Label_Password=new JLabel("Password:");
		Label_Password.setBounds(65, 80, 100, 20);
		Label_IP=new JLabel("IpAddress:");
		Label_IP.setBounds(65, 110, 100, 20);
		Label_Port=new JLabel("Port:");
		Label_Port.setBounds(65, 140, 100, 20);
		TextField_User=new JTextField(20);
		TextField_User.setBounds(150, 45, 115, 30);
		PassField_Password=new JPasswordField(10);
		PassField_Password.setBounds(150, 75, 115, 30);
		TextField_IP=new JTextField();
		TextField_IP.setBounds(150, 105, 115, 30);
		TextField_Port=new JTextField(20);
		TextField_Port.setBounds(150, 135, 115, 30);
		panel.add(Label_User);
		panel.add(Label_Password);
		panel.add(Label_IP);
		panel.add(Label_Port);
		panel.add(TextField_User);
		panel.add(PassField_Password);
		panel.add(TextField_IP);
		panel.add(TextField_Port);
		panel.add(Button_Cancel);
		panel.add(Button_Confirm);
		this.setContentPane(panel);
	}
	
	public void showFrame()
	{
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent event) 
	{
		if(event.getSource()==Button_Cancel)
		{
			this.dispose();
			System.exit(0);
		}
		if(event.getSource()==Button_Confirm)
		{
			char[] a=PassField_Password.getPassword();
			String s="";
			for(char b: a)
			{
				s=s+b;
			}
			System.out.println("{'"+TextField_User.getText()+"';'"+s+"';'"+TextField_IP.getText()+"';'"+TextField_Port.getText()+"'}");
		}
	}
}

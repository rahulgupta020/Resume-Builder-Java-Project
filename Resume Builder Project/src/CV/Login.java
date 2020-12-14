package CV;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Cursor;

public class Login {
	
	
	JFrame frmLogin;
	private JPasswordField pwdPassword;
	private JTextField user;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		int x=0;
		preview frame = new preview();
		frame.setVisible(true);

				try {

					for(x= 0 ; x<=100 ; x++) {
						Thread.sleep(50);
						frame.progressBar.setValue(x);
						frame.label.setText(Integer.toString(x)+" %");
								
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				if(x>=100) {
					frame.dispose();
				}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.getContentPane().setBackground(new Color(128, 0, 128));
		frmLogin.setType(Type.UTILITY);
		frmLogin.setTitle("Login");
		frmLogin.setBounds(400, 100, 562, 429);
		ImageIcon icon1 = new ImageIcon(this.getClass().getResource("icon.png"));
		frmLogin.setIconImage(icon1.getImage());
		frmLogin.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(222, 0, 324, 365);
		frmLogin.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("User Name");
		label.setForeground(new Color(255, 255, 255));
		label.setBackground(new Color(220, 220, 220));
		label.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label.setBounds(28, 117, 83, 17);
		panel.add(label);
		
		JButton btnLogin = new JButton("Login>>");

		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String un=user.getText();
			@SuppressWarnings("deprecation")
			String ps=pwdPassword.getText();
			if(un.equalsIgnoreCase("rahul") && ps.equalsIgnoreCase("rahul")) {
				Resume_Builder window = new Resume_Builder();
				window.frmResumebuilder.setVisible(true);
			}else {
				JOptionPane.showMessageDialog(null,"User Name Or Password Incorrect");
			}
			}
			
		});
		
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBackground(Color.RED);
		btnLogin.setBounds(148, 248, 116, 35);
		panel.add(btnLogin);
		
		JCheckBox checkBox = new JCheckBox("Show");
		checkBox.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		checkBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(checkBox.isSelected()) {
					pwdPassword.setEchoChar((char)0);
				}
				else {
					pwdPassword.setEchoChar((char)2);
				}
				
			}
		
			
		});
		checkBox.setForeground(new Color(255, 255, 255));
		checkBox.setBackground(new Color(0, 0, 0));
		checkBox.setBounds(134, 193, 61, 23);
		panel.add(checkBox);
		
		JLabel label_1 = new JLabel("Password");
		label_1.setForeground(new Color(255, 255, 255));
		label_1.setBackground(new Color(220, 220, 220));
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_1.setBounds(39, 163, 83, 17);
		panel.add(label_1);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setEchoChar('*');
		pwdPassword.setForeground(Color.BLACK);
		pwdPassword.setBackground(Color.WHITE);
		pwdPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		pwdPassword.setBounds(101, 157, 188, 29);
		panel.add(pwdPassword);
		
		user = new JTextField();
		user.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		user.setForeground(Color.BLACK);
		user.setBackground(Color.WHITE);
		user.setFont(new Font("Tahoma", Font.BOLD, 15));
		user.setColumns(10);
		user.setBounds(101, 111, 188, 28);
		panel.add(user);
		

		JLabel logo = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("login.png")).getImage();
		logo.setIcon(new ImageIcon(img));
		logo.setBounds(-11, 56, 224, 264);
		frmLogin.getContentPane().add(logo);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(0, 0, 0));
		frmLogin.setJMenuBar(menuBar);
		
		JButton btnAbout = new JButton("About");
		btnAbout.setForeground(new Color(255, 255, 255));
		btnAbout.setBackground(new Color(0, 0, 0));
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About window = new About();
				window.frmAbout.setVisible(true);
			}
						
		});
		menuBar.add(btnAbout);
	}
	

}

package HotelApp.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import HotelApp.common.HotelAppInterface;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HotelAppLogin extends JFrame implements HotelAppInterface{

	private JPanel contentPane;
	private JTextField textFieldUsername;
	private JTextField textFieldPassword;
	private JTextField textFieldNewUsername;
	private JTextField textFieldNewPassword;
	private JTextField textFieldConfirmNewPassword;
	private JButton btnSkipLogin;
	private JButton btnLogin;
	private JLabel lblOneAccountNote;
	private JButton btnSignUp;
	private JLabel lblLoginTitle;
	private JLabel lblOptionalNote;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JLabel lblNoAccount;
	private JLabel lblNewUsername;
	private JLabel lblNewPassword;
	private JLabel lblConfirmNewPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HotelAppLogin frame = new HotelAppLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HotelAppLogin() {
		initComponents();
		createEvents();
	}

	//create and set components
	@Override
	public void initComponents() {
		// TODO Auto-generated method stub
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("Hotel App Login");
		setContentPane(contentPane);
		
		lblLoginTitle = new JLabel("Hotel App Login");
		lblLoginTitle.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		lblUsername = new JLabel("Username:");
		
		lblPassword = new JLabel("Password:");
		
		textFieldUsername = new JTextField();
		textFieldUsername.setColumns(10);
		
		textFieldPassword = new JTextField();
		textFieldPassword.setColumns(10);
		
		btnLogin = new JButton("Confirm Sign-In");
		
		
		lblNoAccount = new JLabel("Don't have an account? Sign Up Below!\r\n\r\n");
		
		btnSignUp = new JButton("Confirm Sign-Up");
		
		
		lblOptionalNote = new JLabel("Using an account is optional, but we offer a 10% discount at purchase!");
		lblOptionalNote.setForeground(Color.BLUE);
		lblOptionalNote.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		
		btnSkipLogin = new JButton("Skip Login");
		
		
		lblOneAccountNote = new JLabel("Only one account creation per app use.");
		
		lblNewUsername = new JLabel("New Username:");
		
		lblNewPassword = new JLabel("New Password:");
		
		lblConfirmNewPassword = new JLabel("Confirm New Password:");
		
		textFieldNewUsername = new JTextField();
		textFieldNewUsername.setText("");
		textFieldNewUsername.setColumns(10);
		
		textFieldNewPassword = new JTextField();
		textFieldNewPassword.setText("");
		textFieldNewPassword.setColumns(10);
		
		textFieldConfirmNewPassword = new JTextField();
		textFieldConfirmNewPassword.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(115)
							.addComponent(lblLoginTitle))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblOptionalNote))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(72)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblUsername)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textFieldUsername, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblOneAccountNote)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lblPassword)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(textFieldPassword, 139, 139, 139))
									.addComponent(lblNoAccount, Alignment.TRAILING)
									.addComponent(btnLogin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnSkipLogin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(lblNewUsername)
											.addComponent(lblNewPassword))
										.addGap(18)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
											.addComponent(textFieldNewPassword)
											.addComponent(textFieldNewUsername))
										.addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE))
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(btnSignUp, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
											.addComponent(lblConfirmNewPassword)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(textFieldConfirmNewPassword, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)))))))
					.addContainerGap(13, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblLoginTitle)
					.addGap(2)
					.addComponent(lblOptionalNote)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUsername)
						.addComponent(textFieldUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPassword)
						.addComponent(textFieldPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnLogin)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnSkipLogin)
					.addGap(8)
					.addComponent(lblNoAccount)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblOneAccountNote)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewUsername)
						.addComponent(textFieldNewUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewPassword)
						.addComponent(textFieldNewPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblConfirmNewPassword)
						.addComponent(textFieldConfirmNewPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
					.addComponent(btnSignUp))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	//create events
	@Override
	public void createEvents() {
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String username = textFieldUsername.getText();
				String password = textFieldPassword.getText();
				System.out.println(username + ", " + password);
				
				if((username.contentEquals("CSIS") && password.equals("3275"))) {
					JOptionPane.showMessageDialog(null, "Login successful");
					clearFields();
				}else {
					JOptionPane.showMessageDialog(null, "Login not successful, please try again");
					clearFields();
				}
			} 
		});
		btnSkipLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Login skipped");
				clearFields();
			}
		});
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Username added!");
				clearFields();
			}
		});
		
	}
	
	@Override
	public void clearFields() {
		textFieldUsername.setText("");
		textFieldPassword.setText("");
		textFieldNewUsername.setText("");
		textFieldNewPassword.setText("");
		textFieldConfirmNewPassword.setText("");
	}
}

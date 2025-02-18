package HotelApp.views;

import java.awt.EventQueue;

import javax.swing.JFrame;

import HotelApp.common.HotelAppInterface;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;

public class HotelAppHomeScreen implements HotelAppInterface {

	public JFrame frmHomeScreen;
	private JLabel lblHomeTitle;
	private JLabel lblHomeWelcome;
	private JLabel lblHomeInstructions;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HotelAppHomeScreen window = new HotelAppHomeScreen();
					window.frmHomeScreen.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HotelAppHomeScreen() {
		initComponents();
		createEvents();
	}
	@Override
	public void clearFields() {
		// No code here there is only a text area field
	}

	@Override
	public void initComponents() {
		// TODO Auto-generated method stub
		frmHomeScreen = new JFrame();
		frmHomeScreen.setTitle("Home Screen");
		frmHomeScreen.setBounds(400, 400, 400, 400);
		frmHomeScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lblHomeTitle = new JLabel("Hotel App Home Screen");
		lblHomeTitle.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		lblHomeWelcome = new JLabel("Welcome to the Hotel App!");
		lblHomeWelcome.setForeground(new Color(50, 205, 50));
		lblHomeWelcome.setFont(new Font("Tahoma", Font.ITALIC, 14));
		
		lblHomeInstructions = new JLabel("<html>This app is used to provide the following functions:"
				+ "<br><br> - A user sign in or sign up"
				+ "<br> - Booking a Hotel"
				+ "<br> - Booking resteraunt<br>"
				+ "<br>After options are selected on each screen, "
				+ "<br>notifications will show with results."
				+ "<br><br>Having a user account will apply a 10% discount!"
				+ "<br><br>You must run each screen seperately to see their functionalities."
				+ "<br><br>Note: This app has been simplified to only show the apps general functions.</html>");
		lblHomeInstructions.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GroupLayout groupLayout = new GroupLayout(frmHomeScreen.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(88)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(10)
									.addComponent(lblHomeWelcome, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblHomeTitle)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(58)
							.addComponent(lblHomeInstructions)))
					.addContainerGap(101, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addComponent(lblHomeTitle)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblHomeWelcome)
					.addGap(18)
					.addComponent(lblHomeInstructions)
					.addContainerGap(253, Short.MAX_VALUE))
		);
		frmHomeScreen.getContentPane().setLayout(groupLayout);
	}

	@Override
	public void createEvents() {
		// No event handlers, just simple text 
		
	}
	

}

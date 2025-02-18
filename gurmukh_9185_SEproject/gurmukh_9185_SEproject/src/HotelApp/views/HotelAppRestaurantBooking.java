package HotelApp.views;

import java.awt.EventQueue;

import javax.swing.JFrame;

import HotelApp.common.HotelAppInterface;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class HotelAppRestaurantBooking implements HotelAppInterface{

	public JFrame frmRestaurantScreen;
	private JLabel lblResterauntBookingTitle;
	private JLabel lblAppetizer;
	private JComboBox<String> comboBoxAppetizer;
	private JLabel lblEntree;
	private JLabel lblDesert;
	private JLabel lblResterauntBookingInstructions;
	private JComboBox<String> comboBoxEntree;
	private JComboBox<String> comboBoxDessert;
	private JButton btnResterauntBooking;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HotelAppRestaurantBooking window = new HotelAppRestaurantBooking();
					window.frmRestaurantScreen.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HotelAppRestaurantBooking() {
		initComponents();
		createEvents();
	}

	@Override
	public void clearFields() {
		comboBoxAppetizer.setSelectedIndex(0);
		comboBoxEntree.setSelectedIndex(0);
		comboBoxDessert.setSelectedIndex(0);
		
	}

	@Override
	public void initComponents() {
		frmRestaurantScreen = new JFrame();
		frmRestaurantScreen.setTitle("Restaurant Booking");
		frmRestaurantScreen.setBounds(100, 100, 400, 400);
		frmRestaurantScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lblResterauntBookingTitle = new JLabel("Hotel App Resteraunt Booking");
		lblResterauntBookingTitle.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		lblAppetizer = new JLabel("Choose one Appetizer: ($10 each)");
		
		lblEntree = new JLabel("Choose one Main Entree: ($30 each)");
		
		lblDesert = new JLabel("Choose one Desert: ($10 each)");
		
		lblResterauntBookingInstructions = new JLabel("Please choose one item from each section to view your total cost.");
		
		comboBoxAppetizer = new JComboBox<String>();
		comboBoxAppetizer.setModel(new DefaultComboBoxModel<String>(new String[] {"Bread Sticks", "Fries", "Crab Cakes"}));
		
		comboBoxEntree = new JComboBox<String>();
		comboBoxEntree.setModel(new DefaultComboBoxModel<String>(new String[] {"Lobster", "Burger", "Spaghetti"}));
		
		comboBoxDessert = new JComboBox<String>();
		comboBoxDessert.setModel(new DefaultComboBoxModel<String>(new String[] {"Ice Cream", "Cake", "Brownie"}));
		
		btnResterauntBooking = new JButton("Confirm Resteraunt Booking");
		
		GroupLayout groupLayout = new GroupLayout(frmRestaurantScreen.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(63)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblResterauntBookingTitle)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
									.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
										.addComponent(lblEntree)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(comboBoxEntree, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
										.addComponent(lblAppetizer)
										.addGap(18)
										.addComponent(comboBoxAppetizer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
										.addGap(2)
										.addComponent(lblDesert, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(comboBoxDessert, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(34)
							.addComponent(lblResterauntBookingInstructions))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(108)
							.addComponent(btnResterauntBooking)))
					.addContainerGap(35, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblResterauntBookingTitle)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblResterauntBookingInstructions)
					.addGap(29)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAppetizer)
						.addComponent(comboBoxAppetizer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEntree)
						.addComponent(comboBoxEntree, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDesert)
						.addComponent(comboBoxDessert, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addComponent(btnResterauntBooking)
					.addContainerGap(106, Short.MAX_VALUE))
		);
		frmRestaurantScreen.getContentPane().setLayout(groupLayout);
		
	}

	@Override
	public void createEvents() {
		btnResterauntBooking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double costResteraunt = 00.00;
				DecimalFormat df = new DecimalFormat("#####.##");
				String appetizer = comboBoxAppetizer.getSelectedItem().toString();
				String entree = comboBoxEntree.getSelectedItem().toString();
				String dessert = comboBoxDessert.getSelectedItem().toString();
				switch(appetizer) {
					case "Bread Sticks":
						costResteraunt += 10.00;
					case "Fries":
						costResteraunt += 10.00;
					case "Crab Cakes":
						costResteraunt += 10.00;
				}
				switch(entree) {
					case "Lobster":
						costResteraunt += 30.00;
					case "Burger":
						costResteraunt += 30.00;
					case "Spaghetti":
						costResteraunt += 30.00;
				}
				switch(dessert) {
					case "Ice Cream":
						costResteraunt += 10.00;
					case "Cake":
						costResteraunt += 10.00;
					case "Brownie":
						costResteraunt += 10.00;
				}
				df.format(costResteraunt);
				JOptionPane.showMessageDialog(null, "Total cost: $" + costResteraunt);
				costResteraunt = 00.00;
				clearFields();
			}
		});
		
	}
}

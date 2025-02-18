package HotelApp.views;

import java.awt.EventQueue;

import javax.swing.JFrame;

import HotelApp.common.HotelAppInterface;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class HotelAppReceiptScreen implements HotelAppInterface{

	public JFrame frmReceipt;
	private JLabel lblReceiptInstructions;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HotelAppReceiptScreen window = new HotelAppReceiptScreen();
					window.frmReceipt.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HotelAppReceiptScreen() {
		initComponents();
		createEvents();
	}
	
	@Override
	public void clearFields() {
		// This Screen simply shows a message, no clearing fields
		
	}

	@Override
	public void initComponents() {
		frmReceipt = new JFrame();
		frmReceipt.setTitle("Receipt");
		frmReceipt.setBounds(100, 100, 400, 400);
		frmReceipt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Hotel App Receipt");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		lblReceiptInstructions = new JLabel("<html><div style='text-align: center;'>Each individual cost was shown as notifications on the previous screens!<br><br>Thank-you for using the Hotel App!</div></html>");
		lblReceiptInstructions.setForeground(new Color(0, 128, 0));
		lblReceiptInstructions.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		GroupLayout groupLayout = new GroupLayout(frmReceipt.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(103)
					.addComponent(lblNewLabel)
					.addContainerGap(75, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(26, Short.MAX_VALUE)
					.addComponent(lblReceiptInstructions)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(30)
					.addComponent(lblReceiptInstructions)
					.addContainerGap(228, Short.MAX_VALUE))
		);
		frmReceipt.getContentPane().setLayout(groupLayout);
		
	}

	@Override
	public void createEvents() {
		// TODO Auto-generated method stub
		
	}

}

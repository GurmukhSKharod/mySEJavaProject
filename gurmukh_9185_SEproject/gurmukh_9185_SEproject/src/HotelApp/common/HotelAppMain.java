package HotelApp.common;

import java.awt.EventQueue;

import javax.swing.JFrame;

import HotelApp.views.HotelAppHomeScreen;
import HotelApp.views.HotelAppHotelBooking;
import HotelApp.views.HotelAppLogin;
import HotelApp.views.HotelAppReceiptScreen;
import HotelApp.views.HotelAppRestaurantBooking;

public class HotelAppMain {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HotelAppLogin windowLogin = new HotelAppLogin();
					windowLogin.setVisible(true);
					HotelAppHomeScreen windowHome = new HotelAppHomeScreen();
					windowHome.frmHomeScreen.setVisible(true);
					HotelAppHotelBooking windowHotel = new HotelAppHotelBooking();
					windowHotel.frmHotelBooking.setVisible(true);
					HotelAppRestaurantBooking windowRestaurant = new HotelAppRestaurantBooking();
					windowRestaurant.frmRestaurantScreen.setVisible(true);
					HotelAppReceiptScreen windowReceipt = new HotelAppReceiptScreen();
					windowReceipt.frmReceipt.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

}

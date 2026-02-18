package com.instance;
class Hotel {
	String hotelname;
	String room;
	int cost;
	void details() {
		System.out.println("Hotel Nmae:"+hotelname+"\nRoom:"+room+"\nPrice:"+cost);
	}
}

public class UseHotel {

	public static void main(String[] args) {
		Hotel h=new Hotel();
		h.hotelname="Taj";
		h.room="Double";
		h.cost=5000;
		h.details();
		

	}

}

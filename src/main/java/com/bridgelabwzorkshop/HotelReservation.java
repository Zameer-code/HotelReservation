package com.bridgelabwzorkshop;

/**
 * *********************************************************************************************** 
 * Purpose: Class is Implemented to make Hotel Reservation System
 * @author ZameerAhamad Ron <zameerraone96@gmail.com>
 * @version 1.4
 * @since 26-06-2021 ****************************************************************************
 */

import java.util.ArrayList;

class Hotel{
    public String hotelName;
    public  Integer hotelPrice;

    public Hotel(String hotelName, Integer hotelPrice) {
        this.hotelName = hotelName;
        this.hotelPrice = hotelPrice;
    }

    public String toString(){
        return "Hotel Name: "+hotelName +"Hotel Price: "+hotelPrice;
    }
}

public class HotelReservation implements HotelReservationInterface{
	 public ArrayList<Hotel> hotelDetails;
	 public HotelReservation(){
	       hotelDetails = new ArrayList<>();
	   }
	 
	 @Override
	   public void addHotel(String hotelName, Integer hotelPrice) { //adding names and price of the hotels
	       Hotel adder = new Hotel(hotelName,hotelPrice);
	       hotelDetails.add(adder);
	   }
	 public void getHotelDetails(){ // Getting hotel names with String Syntax..
		 String hotelName1 = "LakeWood" ;
	 	 String hotelName2 = "BridgeWood" ;
	 	 String hotelName3 = "RidgeWood" ;
	 	 
	 	 Integer lakeWoodPrice1 = 100; // Getting the prices of the hotel..
		 Integer bridgeWoodPrice1 = 160;
		 Integer ridgeWoodPrice1 = 220;
	 	
		 addHotel(hotelName1,lakeWoodPrice1);
		 addHotel(hotelName2,bridgeWoodPrice1);
		 addHotel(hotelName3,ridgeWoodPrice1);
	 }
	 
	 public void viewHotels(){ //printing of the Hotel Details
	       getHotelDetails();
	       System.out.println(hotelDetails);
	    }
}

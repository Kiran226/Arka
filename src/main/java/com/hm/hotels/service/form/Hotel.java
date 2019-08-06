package com.hm.hotels.service.form;

import java.io.Serializable;




public class Hotel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5271041753675406938L;

    private String id;
    private String hotelName;
    private String hotelAddress;
    
    public Hotel(){
    	
    }
    
	public Hotel(String id, String hotelName, String hotelAddress) {
		super();
		this.id = id;
		this.hotelName = hotelName;
		this.hotelAddress = hotelAddress;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelAddress() {
		return hotelAddress;
	}
	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}
    
    
    
    
	
	
}

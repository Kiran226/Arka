/**
 * @Copyright: ScotiaGlobal Online, ScotiaBank, 2017
 *
 * Hotel.java
 *
 * @author Tech Mahindra
 * @created at 09-Nov-2017
 * @revision history: 
 */
package com.hm.hotels.service.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author KN00460512
 *
 */
@Entity
public class HotelEntity {
	@Id
	private String id;
    private String hotelName;
    private String hotelAddress;
    
    public HotelEntity(){
    	
    }
    
	public HotelEntity(String id, String hotelName, String hotelAddress) {
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

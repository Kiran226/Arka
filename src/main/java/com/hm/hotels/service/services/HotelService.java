package com.hm.hotels.service.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hm.hotels.service.appilication.HotelRepository;
import com.hm.hotels.service.entity.*;
import com.hm.hotels.service.form.Hotel;

@Service
//@org.springframework.context.annotation.Scope(proxyMode=ScopedProxyMode.TARGET_CLASS, value="prototype")
public class HotelService {

	@Autowired
	private HotelRepository hotelDao;
	
	List<Hotel> hotels = new ArrayList<Hotel>(Arrays.asList(
			new Hotel("H1","Krishna Residency", "Jubliehills,Hyd"),
			new Hotel("H2","Sai Vinod Residency", "Kukatpally,Hyd"),
           new Hotel("H3","Naveen 3star Residency", "Hi-tech City,Hyd")));
	
	@SuppressWarnings("unchecked")
	public List<Hotel> getHotels()	{
		List<Hotel> hotel = new ArrayList<Hotel>();

		for(HotelEntity h :hotelDao.findAll()){
			Hotel h1= new Hotel();
			BeanUtils.copyProperties(h, h1);
			hotel.add( h1);
		}
		
		return hotel;
	}
	
	public Hotel addHotel(Hotel hotel){
		HotelEntity h1= new HotelEntity();
		BeanUtils.copyProperties(hotel, h1);
		HotelEntity h2=hotelDao.save(h1);
		Hotel hotel1= new Hotel();
		BeanUtils.copyProperties(h2,hotel1);
		return hotel1;
	}
	
	public Hotel getHotel(String id){
		
	/*List<HotelEntity> hotelList = hotelDao.findHotelById(id);
		Hotel hotel= new Hotel();
		if(null!= hotelList.get(0)){
			HotelEntity hotelent= (HotelEntity) hotelList.get(0);
			hotel.setId(hotelent.getId());
			hotel.setHotelName(hotelent.getHotelName());
			hotel.setHotelAddress(hotelent.getHotelAddress());
		}
		return hotel;*/
		hotelDao.findHotelById(id).get(0);
		Hotel hotel= new Hotel();
		BeanUtils.copyProperties(hotelDao.findHotelById(id).get(0),hotel);
		return hotel;
		}
	
	public Hotel editHotel(Hotel hotel){
		HotelEntity h1 = hotelDao.findHotelById(hotel.getId()).get(0);
		if(h1!=null && h1.getId().equals(hotel.getId())){
			BeanUtils.copyProperties(hotel, h1);
		}
		HotelEntity h2=hotelDao.save(h1);
		Hotel hotel1= new Hotel();
		BeanUtils.copyProperties(h2,hotel1);
		return hotel1;
	}
	
	public List<Hotel> removeHotel(String id){
		try{
		    hotelDao.deleteHotelById(id);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		List<Hotel> hotel = new ArrayList<Hotel>();
		for(HotelEntity h :hotelDao.findAll()){
			Hotel h1= new Hotel();
			BeanUtils.copyProperties(h, h1);
			hotel.add( h1);
		}
		   return hotel;
	}
}

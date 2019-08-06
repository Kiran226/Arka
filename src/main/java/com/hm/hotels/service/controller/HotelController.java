package com.hm.hotels.service.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hm.hotels.service.form.Hotel;
import com.hm.hotels.service.services.HotelService;


@RestController
@RequestMapping(value="/hotelapi")
@CrossOrigin
public class HotelController {
	
	@Autowired
	HotelService hotelService;

@RequestMapping(value="/hotels" , method=RequestMethod.GET, produces="application/json")	
public List<Hotel> getHotels()	{

	return hotelService.getHotels();
}

@RequestMapping(value="/hotels" , method=RequestMethod.POST, produces="application/json", consumes="application/json" )	
public Hotel addHotel(@RequestBody Hotel hotel)	{
  
	return hotelService.addHotel(hotel);
}

@RequestMapping(value="/hotels/{id}" , method=RequestMethod.POST, produces="application/json", consumes="application/json" )	
public Hotel getHotel(@PathVariable String id)	{

   return hotelService.getHotel(id);

}

@RequestMapping(value="/hotels" , method=RequestMethod.PUT, produces="application/json", consumes="application/json" )	
public Hotel editHotel(@RequestBody Hotel hotel)	{

   return hotelService.editHotel(hotel);

}

@RequestMapping(value="/hotels/{id}" , method=RequestMethod.DELETE, produces="application/json", consumes="application/json" )	
public List<Hotel> removeHotel(@PathVariable String id)	{

	   return hotelService.removeHotel(id);
}

	
}

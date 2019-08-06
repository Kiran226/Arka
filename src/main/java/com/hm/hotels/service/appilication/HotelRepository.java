package com.hm.hotels.service.appilication;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hm.hotels.service.entity.HotelEntity;

@Repository
public interface HotelRepository extends CrudRepository<HotelEntity, String>{
	
	@Query("select h.id as id,h.hotelName as hotelName,h.hotelAddress as hotelAddress from HotelEntity h  where h.id = ?1")
	List<HotelEntity> findHotelById(String id);
	
	@Query("delete from HotelEntity  where id = ?1")
	HotelEntity deleteHotelById(String id);
	
	/*@Query("update HotelEntity set hotelName=?2,hotelAddress=?3 where id = ?1")
	HotelEntity updateHotelById(String id,String hotelName,String hotelAddress);*/
}





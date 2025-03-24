package com.skytech.hotel.services;

import com.skytech.hotel.entities.Hotel;

import java.util.List;

public interface HotelService {
    Hotel create(Hotel hotel);
    List<Hotel> getAllHotels();
    Hotel getHotelById(String id);
}

package com.example.hotel_booking.dto;

import com.example.hotel_booking.enums.RoomType;
import java.math.BigDecimal;
import java.util.List;

public class CreateRoomRequest {
    private RoomType roomType;
    private BigDecimal pricePerNight;
    private int capacity;
    private String description;
    private List<String> amenities;
    private double area;

    public RoomType getRoomType() { return roomType; }
    public void setRoomType(RoomType roomType) { this.roomType = roomType; }

    public BigDecimal getPricePerNight() { return pricePerNight; }
    public void setPricePerNight(BigDecimal pricePerNight) { this.pricePerNight = pricePerNight; }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public List<String> getAmenities() { return amenities; }
    public void setAmenities(List<String> amenities) { this.amenities = amenities; }

    public double getArea() { return area; }
    public void setArea(double area) { this.area = area; }
}

package com.example.hotel_booking.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SeasonalPriceDto {
    private Long id;
    private Long hotelId;
    private LocalDate startDate;
    private LocalDate endDate;
    private BigDecimal coefficient;
    private String name;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getHotelId() { return hotelId; }
    public void setHotelId(Long hotelId) { this.hotelId = hotelId; }

    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }

    public LocalDate getEndDate() { return endDate; }
    public void setEndDate(LocalDate endDate) { this.endDate = endDate; }

    public BigDecimal getCoefficient() { return coefficient; }
    public void setCoefficient(BigDecimal coefficient) { this.coefficient = coefficient; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}

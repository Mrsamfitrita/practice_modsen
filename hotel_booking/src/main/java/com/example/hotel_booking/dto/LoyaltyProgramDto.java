package com.example.hotel_booking.dto;

import com.example.hotel_booking.enums.LoyaltyTier;
import java.math.BigDecimal;

public class LoyaltyProgramDto {
    private Long id;
    private Long userId;
    private Integer totalPoints;
    private LoyaltyTier tier;
    private BigDecimal totalSpent;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public Integer getTotalPoints() { return totalPoints; }
    public void setTotalPoints(Integer totalPoints) { this.totalPoints = totalPoints; }

    public LoyaltyTier getTier() { return tier; }
    public void setTier(LoyaltyTier tier) { this.tier = tier; }

    public BigDecimal getTotalSpent() { return totalSpent; }
    public void setTotalSpent(BigDecimal totalSpent) { this.totalSpent = totalSpent; }
}

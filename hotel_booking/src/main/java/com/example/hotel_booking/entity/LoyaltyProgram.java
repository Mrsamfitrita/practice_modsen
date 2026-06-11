package com.example.hotel_booking.entity;

import com.example.hotel_booking.enums.LoyaltyTier;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "loyalty_programs")
public class LoyaltyProgram {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private Long userId;

    @Column(nullable = false)
    private Integer totalPoints;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private LoyaltyTier tier;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal totalSpent;

    @PrePersist
    protected void onCreate() {
        totalPoints = 0;
        tier = LoyaltyTier.BRONZE;
        totalSpent = BigDecimal.ZERO;
    }

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

package com.wardrobe.wardrobe.model;

import com.wardrobe.wardrobe.utils.enums.EPurchaseStatus;

import java.time.LocalDateTime;

public class Purchase {
    private String id;
    private User buyer;
    private LocalDateTime createdAt;



    public Purchase(String id, User buyer, LocalDateTime createdAt, EPurchaseStatus status, LocalDateTime paidAt) {
        this.id = id;
        this.buyer = buyer;
        this.createdAt = createdAt;
    }

    public Purchase() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setNumber(User buyer) {
        this.buyer = buyer;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }


    public String toString() {
        return "Purchase{" +
                "id='" + id + '\'' +
                ", buyer='" + buyer + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}


package com.wardrobe.wardrobe.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "purchases")
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private LocalDateTime createdAt;

    private LocalDateTime paiddAt;

    private double total;

    @ManyToOne
    private User user;

    @OneToOne(mappedBy = "purchase")
    private PurchaseDetail purchaseDetail;

    public PurchaseDetail getPurchaseDetail() {
        return purchaseDetail;
    }

    public void setPurchaseDetail(PurchaseDetail purchaseDetail) {
        this.purchaseDetail = purchaseDetail;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Purchase() {
    }
    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getPaiddAt() {
        return paiddAt;
    }

    public void setPaiddAt(LocalDateTime paiddAt) {
        this.paiddAt = paiddAt;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Purchase(Integer id, LocalDateTime createdAt, LocalDateTime paiddAt, double total) {
        Id = id;
        this.createdAt = createdAt;
        this.paiddAt = paiddAt;
        this.total = total;
    }
}

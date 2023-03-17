package com.wardrobe.wardrobe.model;

import com.wardrobe.wardrobe.utils.enums.EPurchaseStatus;

import java.time.LocalDateTime;

public class PurchaseDetail {
    private String Id;
    private EPurchaseStatus status;

    private LocalDateTime paidAt;

    private double total;

    public PurchaseDetail(String id, EPurchaseStatus status, LocalDateTime paidAt, double total) {
        Id = id;
        this.status = status;
        this.paidAt = paidAt;
        this.total = total;
    }

    public PurchaseDetail() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public EPurchaseStatus getStatus() {
        return status;
    }

    public void setStatus(EPurchaseStatus status) {
        this.status = status;
    }

    public LocalDateTime getPaidAt() {
        return paidAt;
    }

    public void setPaidAt(LocalDateTime paidAt) {
        this.paidAt = paidAt;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}

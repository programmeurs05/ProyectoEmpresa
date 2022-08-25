package com.ejemplo.Proyecto;

import java.time.LocalDate;

public class Transaction {
    private long id;
    private String concept;
    private float amount;
    private Enterprise enterprise;
    private LocalDate createdAt;
    private LocalDate updateAt;

    public Transaction(long id, String concept, float amount, Enterprise enterprise, LocalDate createdAt, LocalDate updateAt) {
        this.id = id;
        this.concept = concept;
        this.amount = amount;
        this.enterprise = enterprise;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {

        this.enterprise = enterprise;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDate updateAt) {
        this.updateAt = updateAt;
    }
}


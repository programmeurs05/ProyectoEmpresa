package com.ejemplo.Proyecto;

import java.time.LocalDate;

public class Employee {
    private long id;
    private Profile profile;
    private String email;
    private Enmu_RoleName enmu_RoleName;
    private Enterprise enterprise;
    private LocalDate createdAt;
    private LocalDate updateAt;

    public Employee(long id, String email,Profile profile, Enmu_RoleName enmu_RoleName, Enterprise enterprise, LocalDate createdAt, LocalDate updateAt) {
        this.id = id;
        this.profile = profile;
        this.email = email;
        this.enmu_RoleName = enmu_RoleName;
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

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Enmu_RoleName getEnmu_RoleName() {
        return enmu_RoleName;
    }

    public void setEnmu_RoleName(Enmu_RoleName enmu_RoleName) {
        this.enmu_RoleName = enmu_RoleName;
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


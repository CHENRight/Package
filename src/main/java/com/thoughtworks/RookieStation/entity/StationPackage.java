package com.thoughtworks.RookieStation.entity;

import org.springframework.stereotype.Controller;

import javax.persistence.*;

@Entity
@Table
public class StationPackage {
//    public final int ALL = 0;
//    public final int UNPICKED = 1;
//    public final int BOOKED = 2;
//    public final int PICKED = 3;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String orderId;
    private String ownerName;
    private String phoneNumber;
    private int status; //0:未取件 1:已预约 2:已取件
    private String appointmentTime;
    private int isGot;

    public int getIsGot() {
        return isGot;
    }

    public void setIsGot(int isGot) {
        this.isGot = isGot;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

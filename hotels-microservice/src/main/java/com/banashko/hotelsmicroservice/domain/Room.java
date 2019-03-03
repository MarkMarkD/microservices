package com.banashko.hotelsmicroservice.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Rooms")
public class Room extends AbstractEntity implements Serializable {
    private static final long serialVersionUID = 1;

    @Column(name = "Area")
    private Float area;

    @ManyToOne                          //eager by default
    @JoinColumn(name = "Typeofroomid")
    private TypeOfRoom typeOfRoom;

    @Column(name = "Typeofroomid", insertable = false, updatable = false)
    private Long typeOfRoomId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name = "Hotelid")
    private Hotel hotel;

    @Column(name = "Hotelid", insertable = false, updatable = false)
    private Long hotelId;

    @ManyToOne
    @JoinColumn(name = "Typeofroomstatusid")
    private TypeOfRoomStatus typeOfRoomStatus;    // available/booked

    @Column(name = "Typeofroomstatusid", insertable = false, updatable = false)
    private Long typeOfRoomStatusId;

    public Float getArea() {
        return area;
    }

    public void setArea(Float area) {
        this.area = area;
    }

    public TypeOfRoom getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(TypeOfRoom typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public Long getTypeOfRoomId() {
        return typeOfRoomId;
    }

    public void setTypeOfRoomId(Long typeOfRoomId) {
        this.typeOfRoomId = typeOfRoomId;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public TypeOfRoomStatus getTypeOfRoomStatus() {
        return typeOfRoomStatus;
    }

    public void setTypeOfRoomStatus(TypeOfRoomStatus typeOfRoomStatus) {
        this.typeOfRoomStatus = typeOfRoomStatus;
    }

    public Long getTypeOfRoomStatusId() {
        return typeOfRoomStatusId;
    }

    public void setTypeOfRoomStatusId(Long typeOfRoomStatusId) {
        this.typeOfRoomStatusId = typeOfRoomStatusId;
    }

    @Override
    public String toString() {
        return "Room{" +
                "area=" + area +
                ", typeOfRoom=" + typeOfRoom +
                ", typeOfRoomId=" + typeOfRoomId +
                ", hotel=" + hotel +
                ", hotelId=" + hotelId +
                ", typeOfRoomStatusId=" + typeOfRoomStatusId +
                '}';
    }
}

package com.banashko.hotelsmicroservice.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Hotels")
public class Hotel extends AbstractEntity implements Serializable {
    private static final long serialVersionUID = 1;

    @Column(name = "Description")
    private String description;

    @Column(name = "Numstars")
    private Integer numStars;

    @Column(name = "Numfloors")
    private Integer numFloors;

    @OneToMany(mappedBy = "hotel", fetch = FetchType.EAGER)
    private Set<Room> rooms;

    @ManyToOne
    @JoinColumn(name = "Addressid")
    private Address address;

    @Column(name = "Addressid", insertable = false, updatable = false)
    private Long addressId;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNumStars() {
        return numStars;
    }

    public void setNumStars(Integer numStars) {
        this.numStars = numStars;
    }

    public Integer getNumFloors() {
        return numFloors;
    }

    public void setNumFloors(Integer numFloors) {
        this.numFloors = numFloors;
    }

    public Set<Room> getRooms() {
        return rooms;
    }

    public void setRooms(Set<Room> rooms) {
        this.rooms = rooms;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "description='" + description + '\'' +
                ", numStars=" + numStars +
                ", numFloors=" + numFloors +
                ", rooms=" + rooms +
                ", address=" + address +
                ", addressId=" + addressId +
                '}';
    }
}

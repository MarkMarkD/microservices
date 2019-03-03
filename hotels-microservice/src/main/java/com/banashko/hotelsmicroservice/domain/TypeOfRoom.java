package com.banashko.hotelsmicroservice.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Typesofrooms")
public class TypeOfRoom extends AbstractEntity implements Serializable {
    private static final long serialVersionUID = 1;

    @Column(name = "Description")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "TypeOfRoom{" +
                "description='" + description + '\'' +
                '}';
    }
}

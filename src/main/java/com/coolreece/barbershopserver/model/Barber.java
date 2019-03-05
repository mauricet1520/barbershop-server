package com.coolreece.barbershopserver.model;

import javax.persistence.*;

@Entity
@Table(name = "Barber")
public class Barber {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Barber() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

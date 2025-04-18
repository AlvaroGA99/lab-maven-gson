package org.example;

import java.util.UUID;

public class Apartment {
    //Vamos a crear una clase Apartment que contenga los siguientes atributos:
    //
    //id (long)
    //address (String)
    //price (double)
    //rooms (int)
    //description (String)
    //owner (String)
    //available (boolean)


    private UUID id;
    private String address;

    private double price;
    private int rooms;
    private String description;

    private String owner;
    private boolean available;

    public Apartment( String address, double price, int rooms, String description, String owner, boolean available) {
        this.id =  this.id = UUID.randomUUID();
        this.address = address;
        this.price = price;
        this.rooms = rooms;
        this.description = description;
        this.owner = owner;
        this.available = available;
    }

    public Apartment() {
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", price=" + price +
                ", rooms=" + rooms +
                ", description='" + description + '\'' +
                ", owner='" + owner + '\'' +
                ", available=" + available +
                '}';
    }
}

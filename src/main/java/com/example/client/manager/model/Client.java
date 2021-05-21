package com.example.client.manager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "clientmanager")
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String city;
    private String phone;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String clientCode;

    public Client() {
    }

    public Client(Long id, String name, String email, String city, String phone, String imageUrl, String clientCode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.city = city;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.clientCode = clientCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", clientCode='" + clientCode + '\'' +
                '}';
    }
}

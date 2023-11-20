package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_information")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "userID")
    private String userId;

    @Column(name = "password")
    private String password;

    @Column(name = "Busyo")
    private String busyo;

    @Column(name = "KanriFlg")
    private int kanriFlg;

    // Getter, Setter, Constructors


public User() {
    // デフォルトコンストラクタ
}

public User(String userId, String password, String busyo, int kanriFlg) {
    this.userId = userId;
    this.password = password;
    this.busyo = busyo;
    this.kanriFlg = kanriFlg;
}

public String getUserId() {
    return userId;
}

public void setUserId(String userId) {
    this.userId = userId;
}

public String getPassword() {
    return password;
}

public void setPassword(String password) {
    this.password = password;
}

public String getBusyo() {
    return busyo;
}

public void setBusyo(String busyo) {
    this.busyo = busyo;
}

public int getKanriFlg() {
    return kanriFlg;
}

public void setKanriFlg(int kanriFlg) {
    this.kanriFlg = kanriFlg;
}
}
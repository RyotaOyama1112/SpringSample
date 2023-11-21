package com.example.demo.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "ユーザー情報", schema = "yukyudb")
public class User implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "UserID")
  private Long userId; // 識別子を表すフィールド

  @Column(name = "Name")
  private String name;

  @Column(name = "Password")
  private String password;

  @Column(name = "Busyo")
  private String busyo;

  @Column(name = "KanriFlg")
  private String kanriFlg;
}

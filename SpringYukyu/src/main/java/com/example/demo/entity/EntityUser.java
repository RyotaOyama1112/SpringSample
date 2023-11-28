package com.example.demo.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity(name = "EntityUser")
@Data
@Table(name = "ユーザー情報", schema = "yukyudb")
public class EntityUser implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "UserID")
  private String userId; // 識別子を表すフィールド

  @Column(name = "Name")
  private String name;

  @Column(name = "Password")
  private String password;

  @Column(name = "Busyo")
  private String busyo;

  @Column(name = "KanriFlg")
  private String kanriFlg;

}

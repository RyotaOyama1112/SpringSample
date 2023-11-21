package com.example.demo.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * ユーザー情報 リクエストデータ
 */
@Data
public class UserRequest implements Serializable {
  private String userid;

  private String name;

  private String password;

  private String kanriFlg;
  
  private String busyo;
}
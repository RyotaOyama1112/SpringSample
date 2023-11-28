package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.UserRequest;
import com.example.demo.entity.EntityUser;
import com.example.demo.repository.RegistrationRepository;

/**
 * ユーザー情報 Service
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RegistrationService {
  /**
   * ユーザー情報 Repository
   */
  @Autowired
  private RegistrationRepository registrationRepository;

  /**
   * ユーザー情報 新規登録
   * @param user ユーザー情報
   */
  public void create(UserRequest userRequest) {
	EntityUser user = new EntityUser();
	user.setPassword(userRequest.getPassword());
    user.setName(userRequest.getName());
    user.setUserId(userRequest.getUserid());
    user.setKanriFlg(userRequest.getKanriFlg());
    user.setBusyo(userRequest.getBusyo());
    registrationRepository.save(user);
  }
}
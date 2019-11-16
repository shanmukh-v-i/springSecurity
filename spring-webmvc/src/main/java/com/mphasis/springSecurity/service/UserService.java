package com.mphasis.springSecurity.service;

import java.util.List;

import com.mphasis.springSecurity.model.User;

public interface UserService {
   void save(User user);

   List<User> list();
}

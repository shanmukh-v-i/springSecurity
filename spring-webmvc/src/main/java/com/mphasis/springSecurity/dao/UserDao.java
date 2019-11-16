package com.mphasis.springSecurity.dao;

import java.util.List;

import com.mphasis.springSecurity.model.User;

public interface UserDao {
   void save(User user);
   List<User> list();
}

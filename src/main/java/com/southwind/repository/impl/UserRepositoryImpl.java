package com.southwind.repository.impl;

import com.southwind.entity.User;
import com.southwind.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository
public class UserRepositoryImpl implements UserRepository {
    private static Map<Integer,User> userMap;
    static{
        userMap=new HashMap<Integer,User>();
        userMap.put(1,new User(1,"张三"));
        userMap.put(2,new User(2,"李四"));
        userMap.put(3,new User(3,"王五"));

    }


    @Override
    public User findById(Integer id) {
        return userMap.get(id);
    }
}

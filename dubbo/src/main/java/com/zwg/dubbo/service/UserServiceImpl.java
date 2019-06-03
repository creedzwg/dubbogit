package com.zwg.dubbo.service;


import com.zwg.dubbo.bean.User;


/**
 * @Author: 张文刚
 * @Date: 2019/03/17  17:19
 * @Version: V1.0
 * @Description:
 */

public class UserServiceImpl implements UserService {



    @Override
    public User getUser(Integer id) {
         return new User(id,"name"+id);

    }
}

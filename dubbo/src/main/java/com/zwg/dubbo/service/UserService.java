package com.zwg.dubbo.service;


import com.zwg.dubbo.bean.User;

import javax.validation.constraints.Min;

/**
 * @Author: 张文刚
 * @Date: 2019/03/17  17:18
 * @Version: V1.0
 * @Description:
 */

public interface UserService {
    User getUser(@Min(value = 56) Integer id);

}

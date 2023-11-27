package com.itheima.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.pojo.User;

public interface AccountService extends IService<User> {
    boolean login(String user,String password);

}

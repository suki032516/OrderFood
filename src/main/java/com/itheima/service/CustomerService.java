package com.itheima.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.pojo.Customer;

public interface CustomerService extends IService<Customer> {
    boolean login(String userName, String userPwd);
}

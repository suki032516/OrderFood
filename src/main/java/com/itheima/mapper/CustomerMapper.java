package com.itheima.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.pojo.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMapper extends BaseMapper<Customer> {
}

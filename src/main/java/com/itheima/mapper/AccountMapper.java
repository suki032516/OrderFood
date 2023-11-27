package com.itheima.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountMapper extends BaseMapper<User> {
}

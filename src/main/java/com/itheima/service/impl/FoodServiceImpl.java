package com.itheima.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.mapper.FoodMapper;
import com.itheima.pojo.Food;
import com.itheima.service.FoodService;
import org.springframework.stereotype.Service;

@Service
public class FoodServiceImpl extends ServiceImpl<FoodMapper, Food> implements FoodService {



}

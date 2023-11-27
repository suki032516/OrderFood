package com.itheima.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.pojo.CountNumber;
import com.itheima.pojo.Product;

import java.util.List;

public interface ProductService extends IService<Product> {


    List<CountNumber> queryNum();

    List<CountNumber> queryTotal();
}

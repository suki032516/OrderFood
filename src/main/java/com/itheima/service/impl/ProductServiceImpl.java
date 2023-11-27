package com.itheima.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.mapper.ProductMapper;
import com.itheima.pojo.CountNumber;
import com.itheima.pojo.Product;
import com.itheima.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper , Product> implements ProductService {
    @Autowired
    private ProductMapper productMapper;


    @Override
    public List<CountNumber> queryNum() {
        return productMapper.queryNum();
    }

    @Override
    public List<CountNumber> queryTotal() {
        return productMapper.queryTotal();
    }
}

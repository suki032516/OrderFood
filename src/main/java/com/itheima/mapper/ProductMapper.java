package com.itheima.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.pojo.CountNumber;
import com.itheima.pojo.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductMapper extends BaseMapper<Product> {


    List<CountNumber> queryNum();

    List<CountNumber> queryTotal();
}

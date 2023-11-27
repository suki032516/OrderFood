package com.itheima;

import com.itheima.mapper.OrderMapper;
import com.itheima.pojo.Order;
import com.itheima.service.OrderService;
import com.itheima.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrderFoodApplicationTests {
    @Autowired
    private ProductService productService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private OrderMapper orderMapper;


    @Test
    void test1() {
        Order invoice = orderService.getInvoiceById(1);
        System.out.println(invoice.toString());

    }

}

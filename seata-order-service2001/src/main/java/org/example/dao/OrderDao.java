package org.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.model.Order;

@Mapper
public interface OrderDao {
    //1 新建订单
    void createOrder(Order order);

    //2 修改订单状态 从0改为1
    void update(@Param("id") Long id, @Param("status") Integer status);
}

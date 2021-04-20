package org.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.entities.Payment;

/**
 * @author Administrator
 */
@Mapper
public interface PaymentDAO {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}

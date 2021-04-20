package org.example.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;


public interface AccountService {
    /**
     *
     * @param userId 账户ID
     * @param money 扣减金额
     */
    void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}

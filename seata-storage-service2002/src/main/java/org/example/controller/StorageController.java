package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.entities.CommonResult;
import org.example.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class StorageController {
    @Autowired
    private StorageService storageService;

    @RequestMapping("/storage/decrease")
    public CommonResult<String> decrease(Long productId, Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult<>(200, "扣减库存成功！");
    }
}

package com.liqisheng.springcloud.controller;

import com.liqisheng.springcloud.domain.CommonResult;
import com.liqisheng.springcloud.service.StorageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StorageController {

    @Resource
    private StorageService storageService;

    @PostMapping(value = "/storage/decrease")
    public CommonResult decrease(Long productId, Integer count) {
        storageService.decrease(productId, count);
        System.out.println(11111);
        return new CommonResult(200, "库存修改成功");
    }
}

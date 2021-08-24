package com.liqisheng.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.liqisheng.springcloud.dao"})
public class MyBatisConfig {
}

package com.example.tft.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.example.tft.mapper")
public class MyBatisConfig {
}

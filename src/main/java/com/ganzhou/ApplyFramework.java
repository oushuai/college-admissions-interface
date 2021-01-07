package com.ganzhou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author ouyangjie
 * @createTime 2021-01-06 21:20
 */
@SpringBootApplication
@MapperScan("com.ganzhou.mapper")
public class ApplyFramework {
    public static void main(String[] args){
        SpringApplication.run(ApplyFramework.class,args);
    }
}

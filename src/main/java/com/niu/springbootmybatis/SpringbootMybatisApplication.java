package com.niu.springbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan({"com.niu.springbootmybatis.mapper"})
@EnableTransactionManagement
public class SpringbootMybatisApplication {

  public static void main(String[] args) {

    SpringApplication.run(SpringbootMybatisApplication.class, args);
  }

}

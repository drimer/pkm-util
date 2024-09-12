package com.drimer.pkmutil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class PkmutilApplication {

  public static void main(String[] args) {
    SpringApplication.run(PkmutilApplication.class, args);
  }
}

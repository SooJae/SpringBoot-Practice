package me.jerry.outsideconfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class OutsideConfigurationApplication {


  public static void main(String[] args) {
    SpringApplication.run(OutsideConfigurationApplication.class, args);
  }

}

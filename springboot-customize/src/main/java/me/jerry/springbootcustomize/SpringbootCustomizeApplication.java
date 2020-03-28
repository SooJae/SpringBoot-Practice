package me.jerry.springbootcustomize;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

@SpringBootApplication
public class SpringbootCustomizeApplication {

/**
 * 기존 것을 그대로 사용하면 커스터마이즈 하기 힘들다.
 */
//  public static void main(String[] args) {
//    SpringApplication.run(SpringbootCustomizeApplication.class, args);
//  }

  /**
   * 이렇게 바꿔보자
   */
  public static void main(String[] args) {
//    SpringApplication.run(SpringbootCustomizeApplication.class, args);

//    SpringApplication app = new SpringApplication(SpringbootCustomizeApplication.class);
//    app.run(args);

    /**
     * 3번째 방법
     */
    new SpringApplicationBuilder()
            .sources(SpringbootCustomizeApplication.class)
            .web(WebApplicationType.NONE)
            .run(args);


  }
}

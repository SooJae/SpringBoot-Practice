package me.jerry.httpshttp2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HttpsHttp2Application {

  @GetMapping("/hello")
  public String hello() {
    return "Hello Spring";
  }

  public static void main(String[] args) {
    SpringApplication.run(HttpsHttp2Application.class, args);
  }

//  @Bean
//  public ServletWebServerFactory serverFactory() {
//    TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
//    tomcat.addAdditionalTomcatConnectors(createStandardConnector());
//    return tomcat;
//  }

// HTTPS 옵션일때, HTTP로도 사용하기
//  private Connector createStandardConnector() {
//    Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
//    connector.setPort(8080);
//    return connector;
//  }

}

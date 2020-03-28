package me.jerry.tomcatmanually2;

import org.springframework.boot.web.servlet.context.ServletWebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class PortListener implements ApplicationListener<ServletWebServerInitializedEvent> {

  @Override
  public void onApplicationEvent(ServletWebServerInitializedEvent servletWebServerInitializedEvent) {
    ServletWebServerInitializedEvent applicationContext = servletWebServerInitializedEvent;
    System.out.println(applicationContext.getWebServer().getPort());
  }
}

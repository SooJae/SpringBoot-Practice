package me.jerry.outsideconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {


//  private SoojaeProperties soojaeProperties;
//
//  public SampleRunner(SoojaeProperties soojaeProperties) {
//    this.soojaeProperties = soojaeProperties;
//  }
//
//  @Override
//  public void run(ApplicationArguments args) throws Exception {
//
//    System.out.println("================");
//    System.out.println(soojaeProperties.getName());
//    System.out.println(soojaeProperties.getAge());
//    System.out.println(soojaeProperties.getSessionTimeout());
//    System.out.println("================");
//  }


  /**
   * Profile 적용
   */
  @Autowired
  private String hello;
  @Autowired
  private SoojaeProperties soojaeProperties;

  @Override
  public void run(ApplicationArguments args) throws Exception {
    System.out.println("===============");
    System.out.println(hello);
    System.out.println(soojaeProperties.getName());
    System.out.println(soojaeProperties.getFullName());
    System.out.println("===============");
  }

}

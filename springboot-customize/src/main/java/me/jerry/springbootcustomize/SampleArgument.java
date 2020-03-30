package me.jerry.springbootcustomize;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleArgument implements ApplicationRunner {

//  public SampleArgument(ApplicationArguments arguments){
//    System.out.println("foo: " + arguments.containsOption("foo"));
//    System.out.println("bar: " + arguments.containsOption("bar"));
//  }

  @Override
  public void run(ApplicationArguments args) throws Exception {
    System.out.println("foo: " + args.containsOption("foo"));
    System.out.println("bar: " + args.containsOption("bar"));
  }
}

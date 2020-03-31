package me.jerry.jdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Statement;

@Component
public class H2Runner implements ApplicationRunner {

  @Autowired
  DataSource dataSource;

  private Logger logger = LoggerFactory.getLogger(H2Runner.class);


  @Override
  public void run(ApplicationArguments args) throws Exception {
    Connection connection = dataSource.getConnection();
    connection.getMetaData().getURL();
    connection.getMetaData().getUserName();

    logger.debug(""+connection);
//    Statement statement
  }
}

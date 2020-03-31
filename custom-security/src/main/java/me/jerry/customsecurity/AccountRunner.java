package me.jerry.customsecurity;

import me.jerry.customsecurity.account.Account;
import me.jerry.customsecurity.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AccountRunner implements ApplicationRunner {

  @Autowired
  AccountService accountService;

  @Override
  public void run(ApplicationArguments args) throws Exception {
    Account soojae = accountService.createAccount("soojae", "1234");
    System.out.println(soojae.getUsername() +" password: " + soojae.getPassword());

  }
}

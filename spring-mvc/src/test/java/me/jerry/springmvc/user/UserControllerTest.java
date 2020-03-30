package me.jerry.springmvc.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class UserControllerTest {

  @Autowired
  MockMvc mockMvc;

  @Test
  public void hello() throws Exception {
    mockMvc.perform(get("/hello"))
            .andExpect(status().isOk())
            .andExpect(content().string("hello"));
  }

  @Test
  public void createUser_JSON() throws Exception {
    String userJson = "{\"username\":\"soojae\", \"password\":\"1234\"}";
    mockMvc.perform(post("/users/create")
            .contentType(MediaType.APPLICATION_JSON)
//            .accept(MediaType.APPLICATION_JSON)
            .accept(MediaType.APPLICATION_XML)
            .content(userJson))
            .andExpect(status().isOk())
//            .andExpect(jsonPath("$.username", is(equalTo("soojae"))))
//            .andExpect(jsonPath("$.password", is(equalTo("1234"))));
            .andExpect(xpath("/User/username").string("soojae"))
            .andExpect(xpath("/User/password").string("1234"));
  }

}

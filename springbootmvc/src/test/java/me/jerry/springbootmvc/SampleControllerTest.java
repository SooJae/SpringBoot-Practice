package me.jerry.springbootmvc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@WebMvcTest(SampleController.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SampleControllerTest {

//  @Autowired
//  MockMvc mockMvc;
//
//  @Test
//  public void hello() throws Exception {
////    요청 "/"
////    응답
////    - 모델 name : soojae
////    - 뷰 이름 : hello
//
//    mockMvc.perform(get("/hello"))
//            .andExpect(status().isOk())
//            .andDo(print())
//            .andExpect(view().name("hello"))
//            .andExpect(model().attribute("name", is("soojae")))
//            .andExpect(content().string(containsString("soojae")));
//  }

  @Autowired
  WebTestClient webTestClient;
  @Test
  public void hello() throws Exception{
    webTestClient.get().uri("/hello").exchange()
            .expectBody(String.class).isEqualTo("soojae")
//    HtmlHeading1 h1 = page.getFirstByXpath("//h1");
//    assertThat(h1.getTextContent()).isEqualToIgnoringCase("soojae");
  }

}

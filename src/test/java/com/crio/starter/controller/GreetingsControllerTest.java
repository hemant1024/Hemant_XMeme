package com.crio.starter.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import com.crio.starter.entity.Meme;
import com.crio.starter.service.MemeService;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.URI;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.util.UriComponentsBuilder;


@AutoConfigureMockMvc
@SpringBootTest
class GreetingsControllerTest {

  @Autowired
  private MockMvc mvc;

  @MockBean
  private MemeService greetingsService;

  @Test
  void sayHello() throws Exception {
    //given
    // Mockito.doReturn(new Meme("Hello Java"))
    //     .when(greetingsService).getMessage("001");

    // // when
    // URI uri = UriComponentsBuilder
    //     .fromPath("/say-hello")
    //     .queryParam("messageId", "001")
    //     .build().toUri();

    // MockHttpServletResponse response = mvc.perform(
    //     get(uri.toString()).accept(APPLICATION_JSON_VALUE)
    // ).andReturn().getResponse();

    // //then
    // String responseStr = response.getContentAsString();
    // ObjectMapper mapper = new ObjectMapper();
    // Meme responseDto = mapper.readValue(responseStr, Meme.class);
    // Meme ref = new Meme("Hello Java");

    // assertEquals(responseDto, ref);
    // Mockito.verify(greetingsService, Mockito.times(1)).getMessage("001");
  }
}
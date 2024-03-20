package com.crio.starter.service;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.STRICT_STUBS)
class GreetingsServiceTest {

  // @Mock
  // private MemeRepository greetingsRepository;

  // @InjectMocks
  // private MemeService greetingsService;

  // @Test
  // void getMessage() {
  //   MemeDto greetingsEntity = getGreeting("001", "Welcome");
  //   Mockito.doReturn(greetingsEntity)
  //       .when(greetingsRepository).findByExtId("001");
  //   Meme responseDto = greetingsService.getMessage("001");

  //   Meme expected = new Meme("Welcome");
  //   assertEquals(expected, responseDto);

  // }

  // private MemeDto getGreeting(String id, String message) {
  //   MemeDto greetingsEntity = new MemeDto();
  //   greetingsEntity.setExtId(id);
  //   greetingsEntity.setMessage(message);
  //   return greetingsEntity;
  // }
}
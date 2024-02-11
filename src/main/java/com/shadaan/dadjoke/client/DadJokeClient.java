package com.shadaan.dadjoke.client;

import com.shadaan.dadjoke.model.DadJokeResponse;
import org.springframework.web.service.annotation.GetExchange;

/**
 * @author shadaan5212
 **/
public interface DadJokeClient {
//    https://icanhazdadjoke.com/
    @GetExchange("/")
   DadJokeResponse random();
}

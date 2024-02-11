package com.shadaan.dadjoke.commands;

import com.shadaan.dadjoke.client.DadJokeClient;
import com.shadaan.dadjoke.model.DadJokeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

/**
 * @author shadaan5212
 **/
@ShellComponent
public class DadJokeCommands {

 private  final  DadJokeClient dadJokeClient;
    public DadJokeCommands(DadJokeClient dadJokeClient) {
        this.dadJokeClient = dadJokeClient;
    }

    @ShellMethod(key = "random",value="I will fetch a random dad joke from the internet!")
    public String getRandomDadJoke(){
        DadJokeResponse response = dadJokeClient.random();
       return response.joke();
    }
}

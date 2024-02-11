package com.shadaan.dadjoke.commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

/**
 * @author shadaan5212
 **/
@ShellComponent
public class HelloCommand {

    @ShellMethod(key = "hello" ,value="I will say hello world!")
    public String helloWorld(@ShellOption(defaultValue = "world!") String name){
        return "Hello " + name + "!";
    }
    @ShellMethod(key = "goodbye" ,value="I will say goodbye!")
    public String goodbye(){
        return "goodbye!";
    }
}

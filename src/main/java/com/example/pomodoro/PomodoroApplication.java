// File: src/main/java/com/example/pomodoro/PomodoroApplication.java
package com.example.pomodoro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//Whitelabel Error Page because no webendpoints
@SpringBootApplication
public class PomodoroApplication {
    public static void main(String[] args) {
        SpringApplication.run(PomodoroApplication.class, args);
    }
}
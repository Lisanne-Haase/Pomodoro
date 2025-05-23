package com.example.demo; //location very important

import com.example.pomodoro.PomodoroApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = PomodoroApplication.class) //important
class PomodoroApplicationTests {

    @Test
    void contextLoads() {
    }
}

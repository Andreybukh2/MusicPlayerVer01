package com.example.musicplayerver01;

import com.example.musicplayerver01.Config.Config;
import com.example.musicplayerver01.Model.Player;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MusicPlayerVer01Application {
    public static void main(String[] args) {
        SpringApplication.run(MusicPlayerVer01Application.class, args);
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Player player = context.getBean("playerConfig", Player.class);
        System.out.println(player.playMusic());
        context.close();
    }
}

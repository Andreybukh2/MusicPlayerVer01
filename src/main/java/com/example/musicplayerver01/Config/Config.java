package com.example.musicplayerver01.Config;

import com.example.musicplayerver01.Model.*;
import org.springframework.context.annotation.*;

import java.util.Arrays;
import java.util.List;

@Configuration
public class Config {
    public Station01 station01() {
        List<String> trackList = Arrays.asList("Песня 01 из радио стиля 02", "Песня 02 из радио стиля 02", "Песня 03 из радио стиля 02", "Песня 04 из радио стиля 02");
        return new Station01("RadioStyle02", trackList);
    }
    public Station02 station02() {
        List<String> trackList = Arrays.asList("Песня 01 из радио стиля 01", "Песня 02 из радио стиля 01", "Песня 03 из радио стиля 01", "Песня 04 из радио стиля 01");
        return new Station02("RadioStyle01", trackList);
    }
    public Station03 station03() {
        List<String> trackList = Arrays.asList("Песня 01 из радио стиля 03", "Песня 02 из радио стиля 03", "Песня 03 из радио стиля 03", "Песня 04 из радио стиля 03");
        return new Station03("RadioStyle03", trackList);
    }
    public List<Radio> listRadioConfig() {
        return Arrays.asList(station01(),station02(),station03());
    }
    @Bean
    public Player playerConfig(){
        return new Player(listRadioConfig());
    }
}

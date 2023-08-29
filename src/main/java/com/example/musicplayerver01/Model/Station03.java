package com.example.musicplayerver01.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Random;

@Data
@AllArgsConstructor
public class Station03 implements Radio {
    private final String name;
    private final List<String> playList;

    @Override
    public String getSong() {
        Random random = new Random();
        return getPlayList().get(random.nextInt(playList.size()));
    }
    @Override
    public String getStation() {
        return this.name;
    }
}

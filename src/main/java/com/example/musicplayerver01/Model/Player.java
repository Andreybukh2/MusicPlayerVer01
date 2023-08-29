package com.example.musicplayerver01.Model;

import lombok.*;

import java.util.List;
import java.util.Random;

@Builder
public class Player {
private final List<Radio> radioList;

    public Player(List<Radio> radioList) {
        this.radioList = radioList;
    }
    public String playMusic() {
        Random random = new Random();
        Radio rndRadio = radioList.get(random.nextInt(radioList.size()));
        return "\n Радиостанция: " + rndRadio.getStation() + "\n ▶ сейчас играет: " + rndRadio.getSong();
    }
}

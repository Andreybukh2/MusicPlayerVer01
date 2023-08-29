package com.example.musicplayerver01.Model;

import org.springframework.stereotype.Component;

@Component
public interface Radio {
    String getSong();
    String getStation();
}

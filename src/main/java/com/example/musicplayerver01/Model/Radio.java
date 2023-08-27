package com.example.musicplayerver01;

import org.springframework.stereotype.Component;

@Component
public interface Radio {
    String getSong();
    String getStation();
}

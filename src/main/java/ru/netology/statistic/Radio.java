package ru.netology.statistic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data

public class Radio {
    private int currentStation;
    private int volume;
    private final int stations;

    public Radio(int stations) {
        this.stations = stations;
        this.currentStation = 0;
        this.volume = 50;
    }

    public Radio() {
        this.stations = 10;
        this.currentStation = 0;
        this.volume = 50;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation >= 0 && currentStation < stations) {
            this.currentStation = currentStation;
        }
    }

    public void next() {
        currentStation = (currentStation + 1) % stations;
    }

    public void prev() {
        currentStation = (stations + currentStation - 1) % stations;
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }
}
package ru.netology.statistic;

public class Radio {
    private int currentStation;
    private int volume;

    public Radio() {
        this.currentStation = 0;
        this.volume = 50;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int station) {
        if (station >= 0 && station <= 9) {
            this.currentStation = station;
        }
    }

    public void next() {
        currentStation = (currentStation + 1) % 10;
    }

    public void prev() {
        currentStation = (currentStation + 9) % 10;
    }

    public int getVolume() {
        return volume;
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
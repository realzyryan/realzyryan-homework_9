package ru.netology.statistic;

public class Radio {
    private int currentStation;
    private int volume;
    private final int stations;

    public Radio(int station) {
        this.stations = station;
        this.currentStation = 0;
        this.volume = 50;
    }

    public Radio() {
        this.stations = 10;
        this.currentStation = 0;
        this.volume = 50;
    }

    public int getCurrentStation() {
        return currentStation;
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
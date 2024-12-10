package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void testGetCurrentStation() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testSetCurrentStationValid() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void testSetMaxStation() {
        Radio radio = new Radio(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testSetCurrentStationInvalid() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testNext() {
        Radio radio = new Radio();
        radio.next();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void testNextLooping() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testPrev() {
        Radio radio = new Radio();
        radio.prev();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void testPrevLooping() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void testGetVolume() {
        Radio radio = new Radio();
        assertEquals(50, radio.getVolume());
    }

    @Test
    public void testIncreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        assertEquals(51, radio.getVolume());
    }

    @Test
    public void testDecreaseVolume() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        assertEquals(49, radio.getVolume());
    }

    @Test
    public void testDecreaseVolumeMin() {
        Radio radio = new Radio();
        for (int i = 0; i < 55; i++) {
            radio.decreaseVolume();
        }
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void testSetCurrentStationNegative() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testIncreaseVolumeBeyondMax() {
        Radio radio = new Radio();
        for (int i = 0; i < 50; i++) {
            radio.increaseVolume();
        }
        radio.increaseVolume();
        assertEquals(100, radio.getVolume());
    }
}
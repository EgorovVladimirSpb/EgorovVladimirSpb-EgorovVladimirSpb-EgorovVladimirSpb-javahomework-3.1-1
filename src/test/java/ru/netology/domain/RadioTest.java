package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void shouldSeStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(2);
        int expected = 2;

        assertEquals(expected, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldIncreaseStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(2);
        radio.increaseStationNumber();
        int expected = 3;

        assertEquals(expected, radio.getCurrentStationNumber());

    }

    @Test
    public void shouldIncreaseStationNumberMax() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);
        radio.increaseStationNumber();
        int expected = 0;

        assertEquals(expected, radio.getCurrentStationNumber());

    }

    @Test
    public void shouldIncreaseStationNumberOverMax() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(33);
        radio.increaseStationNumber();
        int expected = 0;

        assertEquals(expected, radio.getCurrentStationNumber());

    }

    @Test
    public void shouldDecreaseStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(2);
        radio.decreaseStationNumber();
        int expected = 1;

        assertEquals(expected, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldDecreaseStationNumberMin() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);
        radio.decreaseStationNumber();
        int expected = 9;

        assertEquals(expected, radio.getCurrentStationNumber());

    }

    @Test
    public void shouldDecreaseStationNumberUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(-10);
        radio.decreaseStationNumber();
        int expected = 9;

        assertEquals(expected, radio.getCurrentStationNumber());

    }

    @Test
    public void shouldSetVolumeLevel() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(1);
        int expected = 1;

        assertEquals(expected, radio.getCurrentVolumeLevel());
    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(2);
        radio.increaseVolumeLevel();
        int expected = 3;

        assertEquals(expected, radio.getCurrentVolumeLevel());
    }

    @Test
    public void shouldIncreaseCurrentVolumeOMax() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(10);
        radio.increaseVolumeLevel();
        int expected = 10;

        assertEquals(expected, radio.getCurrentVolumeLevel());
    }

    @Test
    public void shouldIncreaseCurrentVolumeOverMax() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(33);
        radio.increaseVolumeLevel();
        int expected = 10;

        assertEquals(expected, radio.getCurrentVolumeLevel());
    }

    @Test
    public void shouldDecreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(5);
        radio.decreaseVolumeLevel();
        int expected = 4;

        assertEquals(expected, radio.getCurrentVolumeLevel());
    }

    @Test
    public void shouldDecreaseCurrentVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(0);
        radio.decreaseVolumeLevel();
        int expected = 0;

        assertEquals(expected, radio.getCurrentVolumeLevel());
    }

    @Test
    public void shouldDecreaseCurrentVolumeUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(-12);
        radio.decreaseVolumeLevel();
        int expected = 0;

        assertEquals(expected, radio.getCurrentVolumeLevel());
    }

}

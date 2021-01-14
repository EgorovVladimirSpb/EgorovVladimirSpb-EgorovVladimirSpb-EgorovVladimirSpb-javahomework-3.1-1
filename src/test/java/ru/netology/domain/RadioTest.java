package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetMaxStationNumber() {
        Radio radio = new Radio(20);
        assertEquals(20, radio.getMaxStationNumber());
    }

    @Test
    public void shouldSeStationNumberWithinNewMax() {
        Radio radio = new Radio(20);
        radio.setCurrentStationNumber(18);
        int expected = 18;

        assertEquals(expected, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldChoseStationNumberWithinNewMax() {
        Radio radio = new Radio(20);
        radio.setCurrentStationNumber(13);
        int expected = 13;

        assertEquals(expected, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldIncreaseWithinNewMaxStationNumber() {
        Radio radio = new Radio(20);
        radio.setCurrentStationNumber(18);
        radio.increaseStationNumber();
        assertEquals(19, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldIncreaseStationNumberNewMax() {
        Radio radio = new Radio(20);
        radio.setCurrentStationNumber(20);
        radio.increaseStationNumber();
        int expected = 0;

        assertEquals(expected, radio.getCurrentStationNumber());

    }

    @Test
    public void shouldIncreaseStationNumberOverNewMax() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(33);
        radio.increaseStationNumber();
        int expected = 0;

        assertEquals(expected, radio.getCurrentStationNumber());

    }

    @Test
    public void shouldDecreaseStationNumberNewMax() {
        Radio radio = new Radio(20);
        radio.setCurrentStationNumber(15);
        radio.decreaseStationNumber();
        int expected = 14;

        assertEquals(expected, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldDecreaseStationNumberMinNewMax() {
        Radio radio = new Radio(20);
        radio.setCurrentStationNumber(0);
        radio.decreaseStationNumber();
        int expected = 20;

        assertEquals(expected, radio.getCurrentStationNumber());

    }

    @Test
    public void shouldDecreaseStationNumberUnderMinNewMax() {
        Radio radio = new Radio(20);
        radio.setCurrentStationNumber(-10);
        radio.decreaseStationNumber();
        int expected = 20;

        assertEquals(expected, radio.getCurrentStationNumber());

    }

    @Test
    public void shouldChoseStationNumber() {
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
        radio.setCurrentStationNumber(10);
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
        int expected = 10;

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
        radio.setCurrentVolumeLevel(80);
        int expected = 80;

        assertEquals(expected, radio.getCurrentVolumeLevel());
    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(55);
        radio.increaseVolumeLevel();
        int expected = 56;

        assertEquals(expected, radio.getCurrentVolumeLevel());
    }

    @Test
    public void shouldIncreaseCurrentVolumeOMax() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(100);
        radio.increaseVolumeLevel();
        int expected = 100;

        assertEquals(expected, radio.getCurrentVolumeLevel());
    }

    @Test
    public void shouldDecreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(42);
        radio.decreaseVolumeLevel();
        int expected = 41;

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
}

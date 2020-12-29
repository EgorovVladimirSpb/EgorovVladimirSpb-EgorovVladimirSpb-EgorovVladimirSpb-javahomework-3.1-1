package ru.netology.domain;

public class Radio {

    private int currentStationNumber;
    private int maxStationNumber = 9;
    private int minStationNumber = 0;
    private int currentVolumeLevel;
    private int maxVolumeLevel = 10;
    private int minVolumeLevel = 0;

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber > maxStationNumber) {
            this.currentStationNumber = maxStationNumber;
            return;
        }
        if (currentStationNumber < minStationNumber) {
            this.currentStationNumber = minStationNumber;
            return;
        }
        this.currentStationNumber = currentStationNumber;
    }

    public void increaseStationNumber() {
        if (currentStationNumber == maxStationNumber) {
            currentStationNumber = minStationNumber;
            return; }
        currentStationNumber++;
    }

    public void decreaseStationNumber() {
        if (currentStationNumber == minStationNumber) {
        currentStationNumber = maxStationNumber;
        return; }
    currentStationNumber --;
    }

    public int getCurrentVolumeLevel() {
        return currentVolumeLevel;
    }

    public void setCurrentVolumeLevel(int currentVolumeLevel) {
        if (currentVolumeLevel > maxVolumeLevel) {
            this.currentVolumeLevel = maxVolumeLevel;
            return;
        }
        if (currentVolumeLevel < minVolumeLevel) {
            this.currentVolumeLevel = minVolumeLevel;
            return;
        }
        this.currentVolumeLevel = currentVolumeLevel;
    }

    public void increaseVolumeLevel() {
        if (currentVolumeLevel < maxVolumeLevel) {
            currentVolumeLevel++;
        }
    }

    public void decreaseVolumeLevel() {
        if (currentVolumeLevel > minVolumeLevel) {
            currentVolumeLevel--;
        }
    }

}
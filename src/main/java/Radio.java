public class Radio {
    private int currentVolume;
    private int currentStation;
    private int maxStationNumber = 9;
    private int maxVolume = 100;

    public Radio() {
    }

    public Radio(int countStation) {
        this.maxStationNumber = countStation - 1;
    }

    public int getMaxStationNumber() {
        return maxStationNumber;
    }

    public void setMaxStationNumber(int maxStationNumber) {
        this.maxStationNumber = maxStationNumber;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > maxStationNumber) {
            return;
        }
        currentStation = newCurrentStation;
    }


    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }


    public void nextStation() {
        if (currentStation < maxStationNumber) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }


    }

    public int prevStation() {
        if (currentStation == 0) {
            currentStation = maxStationNumber;
        } else {
            currentStation = currentStation - 1;
        }
        return currentStation;
    }


    public int nextVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
            return currentVolume;
        }
        return 0;
    }

    public int prevVolume() {
        if (currentVolume == 0) {
            return 0;
        } else {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }

}








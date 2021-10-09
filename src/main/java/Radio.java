public class Radio {
    private int currentVolume;
    private int currentStation;
    private int maxStation = 9;
    private int maxVolume = 10;

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
        if (newCurrentStation > maxStation) {
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


    public void NextStation() {


        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else currentStation = 0;


    }

    public int PrevStation() {
        if (currentStation == 0) {
            currentStation = maxStation;
        } else currentStation = currentStation - 1;
        return currentStation;
    }


    public int NextVolume() {

        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
            return currentVolume;


        } return 0;
    }

    public int PrevVolume() {

        if (currentVolume == 0) {
            return 0;
        } else
            currentVolume = currentVolume - 1;
        return currentVolume;


    }

}








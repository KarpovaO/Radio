import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class RadioNewTest {
    private Radio rad = new Radio(100);
    //private Radio rad = new Radio();


    @ParameterizedTest
    @CsvSource(value = {"'Test Max Station Number' ,99,99"})
    public void testMaxStationNumber(String testName, int setCurrentStation, int expected) {
        rad.setMaxStationNumber(setCurrentStation);
        int actual = rad.getMaxStationNumber();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"'TestCurrentStation' ,99,99", "'TestCurrentStation negative', -1,0 ", "'TestCurrentStation more Max', 100,0 "})
    public void testCurrentStation(String testName, int setCurrentStation, int expected) {
        rad.setCurrentStation(setCurrentStation);
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"'TestCurrentVolume max',100,100", "'TestCurrentVolume negative ',-1,0", "'TestCurrentVolume more Max',101,0"})
    public void testCurrentVolume(String testName, int setCurrentVolume, int expected) {
        rad.setCurrentVolume(setCurrentVolume);
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"'TestCurrentStation ',98,99", "'TestCurrentStation Max ',99,0"})
    public void testNextCurrentStation(String testName, int setCurrentStation, int expected) {
        rad.setCurrentStation(setCurrentStation);
        rad.nextStation();
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"'TestCurrentStation 0',0,99", "'TestCurrentStation Max',99,98"})
    public void testPrevCurrentStation(String testName, int setCurrentStation, int expected) {
        rad.setCurrentStation(setCurrentStation);
        rad.prevStation();
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"'TestCurrentVolume',7,8", "'TestCurrentVolume Max',100,100"})
    public void testNextCurrentVolume(String testName, int setCurrentVolume, int expected) {
        rad.setCurrentVolume(setCurrentVolume);
        rad.nextVolume();
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"'TestCurrentVolume',0,0", "'TestCurrentVolume',10,9"})
    public void testPrevCurrentVolume(String testName, int setCurrentVolume, int expected) {
        rad.setCurrentVolume(setCurrentVolume);
        rad.prevVolume();
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }


}


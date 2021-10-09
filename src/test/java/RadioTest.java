import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @ParameterizedTest
    @CsvSource(value = {"'TestCurrentStation max',9,9","'TestCurrentStation negative ',-1,0","'TestCurrentStation more Max',10,0"})
    public void TestCurrentStation(String testName, int setCurrentStation, int expected) {
        Radio rad = new Radio();
        rad.setCurrentStation(setCurrentStation);
        int actual = rad.getCurrentStation();
        assertEquals(actual, expected);
    }
    @ParameterizedTest
    @CsvSource(value = {"'TestCurrentVolume max',10,10","'TestCurrentVolume negative ',-1,0","'TestCurrentVolume more Max',11,0"})
    public void TestCurrentVolume(String testName, int setCurrentVolume, int expected) {
        Radio rad = new Radio();
        rad.setCurrentVolume(setCurrentVolume);
        int actual = rad.getCurrentVolume();
        assertEquals(actual, expected);
    }
    @ParameterizedTest
    @CsvSource(value = {"'TestCurrentStation ',8,9","'TestCurrentStation more Max ',9,0"})
    public void TestNextCurrentStation(String testName, int setCurrentStation, int expected) {
        Radio rad = new Radio();
        rad.setCurrentStation(setCurrentStation);
        rad.NextStation();
        int actual = rad.getCurrentStation();
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"'TestCurrentStation 0',0,9","'TestCurrentStation Max',9,8"})
    public void TestPrevCurrentStation(String testName, int setCurrentStation, int expected) {
        Radio rad = new Radio();
        rad.setCurrentStation(setCurrentStation);
        rad.PrevStation();
        int actual = rad.getCurrentStation();
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"'TestCurrentVolume',7,8","'TestCurrentVolume Max',10,10"})
    public void TestNextCurrentVolume(String testName, int setCurrentVolume, int expected) {
        Radio rad = new Radio();
        rad.setCurrentVolume(setCurrentVolume);
        rad.NextVolume();
        int actual = rad.getCurrentVolume();
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"'TestCurrentVolume',0,0","'TestCurrentVolume',10,9"})
    public void TestPrevCurrentVolume(String testName, int setCurrentVolume, int expected) {
        Radio rad = new Radio();
        rad.setCurrentVolume(setCurrentVolume);
        rad.PrevVolume();
        int actual = rad.getCurrentVolume();
        assertEquals(actual, expected);
    }
}


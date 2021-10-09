import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void TestCurrentStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);

        int actual = rad.getCurrentStation();
        int expected = 9;
        assertEquals(actual, expected);
    }

    @Test
    public void TestNextCurrentStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.NextStation();
        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void TestPrevCurrentStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.PrevStation();
        int actual = rad.getCurrentStation();
        int expected = 8;
        assertEquals(actual, expected);
    }

    @Test
    public void TestNextCurrentVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(9);
        rad.NextVolume();
        int actual = rad.getCurrentVolume();
        int expected = 10;
        assertEquals(actual, expected);
    }

    @Test
    public void TestPrevCurrentVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(9);
        rad.PrevVolume();
        int actual = rad.getCurrentVolume();
        int expected = 8;
        assertEquals(actual, expected);
    }
}


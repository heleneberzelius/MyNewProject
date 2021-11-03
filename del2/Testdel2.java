package del2;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class Testdel2 {


    @Test

    public void testGetRows() {

        //Arrange
        TestText myTest = new TestText();

        //Act

        int actual = myTest.getRows();

        //Assert

        int expected = 0;
        assertEquals(expected, actual);

    }


    @Test
    public void testGetCharacters() {

        //Arrange
        TestText myTest = new TestText();


        //Act

        int actual = myTest.getCharacters();

        //Assert

        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    public void testCountCharacters() {
        //Arrange

        String h = "Helene";

        TestText myTest = new TestText();

        myTest.addCharacters(h);
        //Act

        int actual = myTest.getCharacters();

        //Assert

        int expected = 6;
        assertEquals(expected, actual);

    }

    @Test
    public void testCountStopCharacters() {
        //Arrange
        String h = "stop";

        TestText myTest = new TestText();

        myTest.addCharacters(h);

        //Act
        int actual = myTest.getCharacters();

        //Assert

        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    public void testHaveStopped() {
        //Arrange

        String h = "stop";
        TestText myTest = new TestText();
        myTest.addCharacters(h);

        //Act

        boolean actual = myTest.isStopped();

        //Assert
        boolean expected = true;
        assertEquals(expected, actual);

    }

    @Test
    public void testHaveNotStopped() {
        //Arrange
        String h = "svamp";

        TestText myTest = new TestText();

        myTest.addCharacters(h);
        //Act

        boolean actual = myTest.isStopped();

        //Assert
        boolean expected = false;
        assertEquals(expected, actual);

    }

}

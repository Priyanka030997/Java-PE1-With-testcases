package com.stackroute.pe1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class OddevenTest {
Oddeven odd;

    @Before
    public void setup(){
        //System.out.println("Before");
        odd=new Oddeven();
    }
    @Test
    public void GivenNumberisOdd() {
        // Arrange
        // App app = new App();
        //Act
        String result = odd.FindEvenOdd(25);
        //Assert
        assertEquals("Tom", result);
    }
    @Test
    public void GivenNumberisEven() {
        // Arrange
        // App app = new App();
        //Act
        String result = odd.FindEvenOdd(22);
        //Assert
        assertEquals("Jerry", result);
    }
    @Test
    public void GivenNumberisnotinLimit() {
        // Arrange
        // App app = new App();
        //Act
        String result = odd.FindEvenOdd(10);
        //Assert
        assertEquals("Error", result);
    }
}
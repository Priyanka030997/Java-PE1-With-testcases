package com.stackroute.pe1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PalindromeTest {
    Palindrome pal;

    @Before
    public void setup(){
        //System.out.println("Before");
        pal=new Palindrome();
    }
    @Test
    public void PalindromeAndSumOfEvenNumbersisGreater() {
        // Arrange
        // App app = new App();
        //Act
        String result = pal.CheckPalindrome(2468642);
        //Assert
        assertEquals("Palindrome and the sum of even numbers is greater than 25", result);
    }

    @Test
    public void PalindromeAndSumOfEvenNumbersisLess() {
        // Arrange
        // App app = new App();
        //Act
        String result = pal.CheckPalindrome(121);
        //Assert
        assertEquals("Palindrome and the sum of even numbers is less than 25", result);
    }
    @Test
    public void GivenNumberisNotPalindrome() {
        // Arrange
        // App app = new App();
        //Act
        String result = pal.CheckPalindrome(2324);
        //Assert
        assertEquals("Not Palindrome", result);
    }



}
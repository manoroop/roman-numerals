package katas.romannumerals;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class is just your entry point for this kata. It can be modified or deleted as you like.
 *
 */
public class EntryTest {

    @Test
    public void testForNumber1() throws Exception {
    	int number = 1;
        assertEquals("I", new Entry().convertToRoman(number));
    }
    
    @Test
    public void testForNumber2() throws Exception {
    	int number = 2;
        assertEquals("II", new Entry().convertToRoman(number));
    }
    
    @Test
    public void testForNumber8() throws Exception {
    	int number = 8;
        assertEquals("VIII", new Entry().convertToRoman(number));
    }
    
    @Test
    public void testForNumber40() throws Exception {
    	int number = 40;
        assertEquals("XL", new Entry().convertToRoman(number));
    }
    
    @Test
    public void testForNumber99() throws Exception {
    	int number = 99;
        assertEquals("XCIX", new Entry().convertToRoman(number));
    }
    
    @Test
    public void testForNumber1999() throws Exception {
    	int number = 1999;
        assertEquals("MCMXCIX", new Entry().convertToRoman(number));
    }
    
    @Test
    public void testForNumber5000() throws Exception {
    	int number = 5000;
        assertEquals("Not a valid number for Roman Numeral conversion", new Entry().convertToRoman(number));
    }
	
}
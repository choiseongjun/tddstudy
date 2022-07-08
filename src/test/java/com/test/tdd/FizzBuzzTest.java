package com.test.tdd;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FizzBuzzTest {

    @DisplayName("Divisible by Three")
    @Test
    @Order(1)
    void testForDivisibleByThree(){
        String expected = "Fizz";
        assertEquals(expected,FizzBuzz.compute(3),"Should return Fizz");
    }
    @DisplayName("Divisible by Five")
    @Test
    void testForDivisibleByFive(){
        String expected = "Buzz";
        assertEquals(expected,FizzBuzz.compute(5),"Should return Buzz");
    }
    @DisplayName("Divisible by ThreeAndFive")
    @Test
    void testForDivisibleByThreeAndFive(){
        String expected = "FizzBuzz";
        assertEquals(expected,FizzBuzz.compute(15),"Should return FizzBuzz");
    }
    @DisplayName("Testing with Small data file")
    @ParameterizedTest(name="value={0}, expected={1}")
    @CsvFileSource(resources = "/small-test-data.csv")
    void testSmallDataFile(int value, String expected){
        assertEquals(expected,FizzBuzz.compute(value));
    }
}

package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testGradeA() {
        assertEquals("A", App.calculateGrade(85));
    }

    @Test
    public void testGradeB() {
        assertEquals("B", App.calculateGrade(65));
    }

    @Test
    public void testGradeC() {
        assertEquals("C", App.calculateGrade(50));
    }

    @Test
    public void testGradeD() {
        assertEquals("D", App.calculateGrade(35));
    }

    @Test
    public void testMinimumValidMarks() {
        assertEquals("D", App.calculateGrade(0));
    }

    @Test
    public void testMaximumValidMarks() {
        assertEquals("A", App.calculateGrade(100));
    }

    @Test
    public void testInvalidMarks() {
        assertEquals("Invalid", App.calculateGrade(120));
    }
}
package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void testWhenFewSquaresFound() {
        SQRService service = new SQRService();

        int actual = service.calc(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWhenNoSquaresFoundBeforeRange() {
        SQRService service = new SQRService();

        int actual = service.calc(0, 99);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWhenNoSquaresFoundAboveRange() {
        SQRService service = new SQRService();

        int actual = service.calc(9802, 10000);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWhenOneSquareFoundLowRange() {
        SQRService service = new SQRService();

        int actual = service.calc(0, 100);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWhenOneSquareFoundHiRange() {
        SQRService service = new SQRService();

        int actual = service.calc(9801, 10000);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

}
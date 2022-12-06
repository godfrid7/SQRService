package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void calcWhenFewSquaresFound() {
        SQRService service = new SQRService();

        int actual = service.countSquares(200, 300);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void calcWhenOneSquaresFound() {
        SQRService service = new SQRService();

        int actual = service.countSquares(100, 100);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void calcWhenNoneSquaresFound() {
        SQRService service = new SQRService();

        int actual = service.countSquares(-1, 98);
        int expected = 0;

        assertEquals(expected, actual);
    }
}


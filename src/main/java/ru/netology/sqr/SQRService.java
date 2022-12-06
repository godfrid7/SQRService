package ru.netology.sqr;

public class SQRService {

    public int countSquares(int lowLimit, int highLimit) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int iSquare = i * i;
            if (iSquare >= lowLimit) {
                if (iSquare <= highLimit) {
                    counter++;
                }
            }
        }

        return counter;
    }
}

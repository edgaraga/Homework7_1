package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMax2() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 12, 12, 12, 12, 3, 8, 6, 12, 12, 15};
        long expected = 15;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMax3() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {28, 12, 12, 12, 12, 3, 8, 6, 12, 12, 15};
        long expected = 28;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}

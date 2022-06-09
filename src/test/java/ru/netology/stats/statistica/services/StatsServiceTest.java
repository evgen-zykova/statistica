package ru.netology.stats.statistica.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void sumOfAllSales() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedSum = 180;
        int actualSum = service.sumAllSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void averageSales() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        double expectedAverageSum = 15;
        double actualAverageSum = service.averageSalesAmount(sales);

        Assertions.assertEquals(expectedAverageSum, actualAverageSum);
    }

    @Test
    public void monthMaxSales() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long expectedMonthMaxSales = 8;
        long actualMonthMaxSales = service.monthOfMaximumSales(sales);

        Assertions.assertEquals(expectedMonthMaxSales, actualMonthMaxSales);
    }

    @Test
    public void monthMinSales() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long expectedMonthMinSales = 9;
        long actualMonthMinSales = service.minSales(sales);

        Assertions.assertEquals(expectedMonthMinSales, actualMonthMinSales);

    }

    @Test
    public void numberMonthsBelowAverage() {
        StatsService service = new StatsService();

        int[] sales = { 50, 15, 13, 15, 17, 20, 19, 20, 22, 14, 14, 18 };

        int expectedNumberMonth = 8;
        int actualNumberMonth = service.numberMonthsBelowAverage(sales);

        Assertions.assertEquals(expectedNumberMonth, actualNumberMonth);


    }

    @Test
    public void numberMonthsAboveAverage( ) {
        StatsService service = new StatsService();

        int[] sales = { 40, 15, 3, 15, 17, 20, 19, 25, 7, 14, 14, 18 };

        int expectedNumberMonthAbove = 6;
        int actualNumberMonthAbove = service.numberMonthsAboveAverage(sales);

        Assertions.assertEquals(expectedNumberMonthAbove, actualNumberMonthAbove);
    }
}

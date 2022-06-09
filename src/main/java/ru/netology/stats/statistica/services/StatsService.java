package ru.netology.stats.statistica.services;

public class StatsService {

    public int sumAllSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public double averageSalesAmount(int[] sales) {
        double averageSum = 0;
        int amount = sumAllSales(sales);

        averageSum = amount / sales.length;
        return averageSum;

    }

    public int monthOfMaximumSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int numberMonthsBelowAverage(int[] sales) {
        int numberOfMonths = 0;
        double averageSum = averageSalesAmount(sales);
        int counter = 0;
        for (int x = 0; x < sales.length; x++) {
            if (sales[x] <= averageSum) {
                counter++;
            }
        }
        return counter;
    }

    public int numberMonthsAboveAverage(int[] sales) {
        int numberOfMonths = 0;
        double averageSum = averageSalesAmount(sales);
        int counter = 0;
        for (int x = 0; x < sales.length; x++) {
            if (sales[x] >= averageSum) {
                counter++;
            }
        }
        return counter;
    }
}
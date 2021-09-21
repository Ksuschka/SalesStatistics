package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long calculateAverageSum(long[] sales) {
        long sum = calculateSum(sales);
        return sum / sales.length;
    }

    public int calculateMaxSales(long[] sales) {
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

    public int calculateMinSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long calculateMinAverageSales(long[] sales) {
        long sum = calculateAverageSum(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < sum) {
                count = count + 1;
            }
        }
        return count;
    }

    public long calculateMaxAverageSales(long[] sales) {
        long sum = calculateAverageSum(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale >= sum) {
                count = count + 1;
            }
        }
        return count;
    }
}



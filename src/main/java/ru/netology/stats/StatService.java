package ru.netology.stats;

public class StatService {
    public long sumSales(long[] sales) {
        long sumSales = 0;

        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i];
        }
        return sumSales;
    }


    public long averageSales(long[] sales) {
        long averageMonthlySales = sumSales(sales) / 12;
        return averageMonthlySales;
    }

    public int monthOfMaxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }


    public int monthOfMinSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int countMonthMin(long[] sales) {
        int count = 0;
        long averageSales = averageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {
                count++;
            }
        }
        return count;
    }

    public int countMonthMax(long[] sales) {
        int count = 0;
        long averageSales = averageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= averageSales) {
                count++;
            }
        }
        return count;
    }


}




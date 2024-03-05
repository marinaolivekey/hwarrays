package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatServiceTest {

    @Test
    public void shouldFindSum() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 180;
        long actualSum = service.SumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void shouldFindAver() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAv = 15;
        long actualAv = service.AverageSales(sales);

        Assertions.assertEquals(expectedAv, actualAv);
    }

    @Test
    public void shouldFindMonthOfMaxSales() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthMax = 8;
        int actualMonthMax = service.monthOfMaxSales(sales);

        Assertions.assertEquals(expectedMonthMax, actualMonthMax);
    }

    @Test
    public void shouldFindMonthOfMinSales() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthOfMin = 9;
        int actualMonthOfMin = service.monthOfMinSales(sales);

        Assertions.assertEquals(expectedMonthOfMin, actualMonthOfMin);
    }

    @Test
    public void shouldCountMonthMin() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedCountMonthMin = 5;
        int actualCountMonthMin = service.countMonthMin(sales);

        Assertions.assertEquals(expectedCountMonthMin, actualCountMonthMin);
    }

    @Test
    public void shouldCountMonthMax() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedCountMonthMax = 7;
        int actualCountMonthMax = service.countMonthMax(sales);

        Assertions.assertEquals(expectedCountMonthMax, actualCountMonthMax);
    }


}

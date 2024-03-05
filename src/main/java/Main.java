import ru.netology.stats.StatService;

public class Main {

    public static void main(String[] args) {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatService service = new StatService();

        long sumSales = service.SumSales(sales);
        long averMonthlySales = service.AverageSales(sales);
        int monthMaxSales = service.monthOfMaxSales(sales);
        int monthMinSales = service.monthOfMinSales(sales);
        int countMinMonth = service.countMonthMin(sales);
        int countMaxMonth = service.countMonthMax(sales);

        System.out.println(sumSales);
        System.out.println(averMonthlySales);
        System.out.println(monthMaxSales);
        System.out.println(monthMinSales);
        System.out.println(countMinMonth);
        System.out.println(countMaxMonth);

    }
}

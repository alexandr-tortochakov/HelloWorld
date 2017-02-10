public class Discount {

    public static final int AMOUNT_FOR_DISCOUNT = 10;
    public static final int SUM_FOR_DISCOUNT = 100000;
    public static final double MAX_DISCOUNT = 0.1;
    public static final double MIN_DISCOUNT = 0.05;
    public static final int FIRST_PRICE = 10000; // price in kopecks
    public static final int SECOND_PRICE = 15000; // price in kopecks

    public static void main(String[] args) {
        long price = totalPrice(5, 4);
        System.out.printf("Сумма заказа составила %d.%02d руб.", price/100, price%100);
    }

    public static long totalPrice(int amountOfFirst, int amountOfSecond) {


        int costOfFirst = FIRST_PRICE * amountOfFirst;
        int costOfSecond = SECOND_PRICE * amountOfSecond;
        int totalCost = costOfFirst + costOfSecond;
        int totalAmount = amountOfFirst + amountOfSecond;
        long total;

        if ((totalAmount >= AMOUNT_FOR_DISCOUNT) && (totalCost >= SUM_FOR_DISCOUNT)) {
            total = Math.round((totalCost * (1 - MAX_DISCOUNT)));
        } else if ((totalAmount >= AMOUNT_FOR_DISCOUNT) || (totalCost >= SUM_FOR_DISCOUNT)) {
            total = Math.round(totalCost * (1 - MIN_DISCOUNT));
        } else {
            total = totalCost;
        }
        return total;
    }
}

public class Deposit {
    public static void main(String[] args) {
        int givenMonths = 4;
        int allMonths = 12;
        double rate = 0.12;
        int deposit = 1000;
        double monthRate = rate / allMonths;
        double recalculation = deposit;

        int i = 0;
        while (i < givenMonths) {
            recalculation *= 1 + monthRate;
            i++;
        }
        double profit = recalculation - deposit;
        System.out.printf("Сумма вклада составила %.2f руб.", recalculation);
        System.out.printf("Прибыль с депозита составила %.2f руб.", profit);
    }
}

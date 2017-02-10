import java.util.Scanner;

public class NextDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите дату.");

        System.out.print("Число: ");
        int inputDate = scanner.nextInt();

        System.out.print("Месяц: ");
        int inputMonth = scanner.nextInt();

        System.out.print("Год: ");
        int inputYear = scanner.nextInt();

        if (inputDate > 31 || (inputDate == 31 && (inputMonth == 4 || inputMonth == 6 || inputMonth == 9 || inputMonth == 11))) {
            System.out.print("Несуществующая дата!");
        } else if (inputMonth == 2 && (inputDate == 30 || (inputDate == 29 && (inputYear % 400 != 0 && (inputYear % 4 != 0 || inputYear % 100 == 0))))) {
            System.out.print("Несуществующая дата!");
        } else if (inputDate < 30 && inputMonth != 2) {
            inputDate++;
            System.out.printf("%d.%d.%d", inputDate, inputMonth, inputYear);
        } else if (inputDate == 31 && inputMonth < 12) {
            inputDate = 1;
            inputMonth++;
            System.out.printf("%d.%d.%d", inputDate, inputMonth, inputYear);
        } else if (inputDate == 30 && (inputMonth == 4 || inputMonth == 6 || inputMonth == 9 || inputMonth == 11)) {
            inputDate = 1;
            inputMonth++;
            System.out.printf("%d.%d.%d", inputDate, inputMonth, inputYear);
        } else if (inputMonth == 2 && inputDate == 29) {
            inputDate = 1;
            inputMonth++;
            System.out.printf("%d.%d.%d", inputDate, inputMonth, inputYear);
        } else if (inputMonth == 2 && inputDate == 28 && (inputYear % 400 != 0 && (inputYear % 4 != 0 || inputYear % 100 == 0))) {
            inputDate = 1;
            inputMonth++;
            System.out.printf("%d.%d.%d", inputDate, inputMonth, inputYear);
        } else if (inputMonth == 12 && inputDate == 31) {
            inputDate = 1;
            inputMonth = 1;
            inputYear++;
            System.out.printf("%d.%d.%d", inputDate, inputMonth, inputYear);
        } else {
            inputDate++;
            System.out.printf("%d.%d.%d", inputDate, inputMonth, inputYear);
        }

    }
}

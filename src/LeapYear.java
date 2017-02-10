import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год: ");
        int inputYear = scanner.nextInt();
        if (isLeapYear(inputYear)) {
            System.out.print(inputYear + " високосный год");
        } else {
            System.out.print(inputYear + " невисокосный год");
        }
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}

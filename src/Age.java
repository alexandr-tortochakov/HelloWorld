import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите Ваш возраст: ");
        int userAge = scanner.nextInt();

        if (userAge < 1) {
            System.out.print("Вы слишком малы");
        } else if (userAge > 112) {
            System.out.print("Вы слишком стары");
        } else if (userAge % 10 > 4 && userAge % 10 < 10 || userAge % 10 == 0) {
            System.out.printf("Вам %d лет", userAge);
        } else if (userAge % 100 > 10 && userAge % 100 < 15) {
            System.out.printf("Вам %d лет", userAge);
        } else if (userAge % 10 == 1) {
            System.out.printf("Вам %d год", userAge);
        } else {
            System.out.printf("Вам %d года", userAge);
        }
    }
}
// палиндр 8. провкрка сортировки 9. алгоритм евкл 11. сортировки и работа
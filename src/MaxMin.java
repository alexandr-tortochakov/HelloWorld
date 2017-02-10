import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();

        int max = (firstNumber > secondNumber) ? firstNumber : secondNumber;
        System.out.println(max + " наибольшее число");
        int min = (secondNumber < firstNumber) ? secondNumber : firstNumber;
        System.out.println(min + " наименьшеее число");
    }
}

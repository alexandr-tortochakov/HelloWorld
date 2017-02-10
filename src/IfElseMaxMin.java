import java.util.Scanner;

public class IfElseMaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber == secondNumber) {
            System.out.print("Числа равны");
        } else if (firstNumber > secondNumber) {
            System.out.print(firstNumber + " наибольшее число" + System.lineSeparator() + secondNumber + " наименьшее число");
        } else {
            System.out.print(secondNumber + " наибольшее число" + System.lineSeparator() + firstNumber + " наименьшее число");
        }
    }
}

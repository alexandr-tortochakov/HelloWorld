import java.util.Scanner;

public class PrintAndRead {
    public static void main(String[] args) {
        int a = printAndRead("Введите число: ");
        int b = printAndRead("Вводи: ");
        int c = printAndRead("Ваше число: ");
    }

    public static int printAndRead (String line) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(line);
        return scanner.nextInt();
    }
}



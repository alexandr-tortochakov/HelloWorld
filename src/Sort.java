import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("D:/input.txt"));
        int count = 0;
        while (scanner.hasNextInt()) {
            System.out.println(scanner.nextInt());
            count++;
        }
        scanner.close();

        scanner = new Scanner(new FileInputStream("D:/input.txt"));

        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = scanner.nextInt();
        }
        scanner.close();

        int[] sortedArray = sort(digits);

        PrintWriter writer = new PrintWriter("output.txt");
        for (int i = 0; i < sortedArray.length; i++) {
            writer.println(Integer.toString(sortedArray[i]));
        }
        writer.close();

    }

    public static int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[i] < array[j - 1]) {
                j--;
            }
            int temp = array[i];
            for (int k = i; k > j; k--) {
                array[k] = array[k - 1];
            }
            array[j] = temp;
        }
        return array;
    }
}
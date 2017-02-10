import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
        String[] array = {"computer", "halo", "house", "main"};
        String[] changedArray = toUpperCase(array);
        System.out.print(Arrays.toString(changedArray));
    }


    public static String[] toUpperCase(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].toUpperCase();
        }
        return array;
    }
}

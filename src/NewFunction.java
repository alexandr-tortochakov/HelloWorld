public class NewFunction {
    public static double calc(int x, int y) {
        return 3 * x + 4 * y;
    }

    public static void main(String[] args) {
        double call = calc(5, 7);
        System.out.println(call);

        double output = average(4, 7);
        System.out.print(output);
    }

    public static double average(int x, int y) {
        return ((double)x + y) / 2;
    }
}

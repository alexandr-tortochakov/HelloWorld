public class EuclidsAlgorithm {
    public static void main(String[] args) {
        int divisor = euclids(2*2*2*3*5*7*7, 2*3*3*5*7);
        System.out.print("НОД: " + divisor);
    }

    public static int euclids(int a, int b) {
        while (b != 0) {
            int x = a % b;
            a = b;
            b = x;
        }
        return a ;
    }
}

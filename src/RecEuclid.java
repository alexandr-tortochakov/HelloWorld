public class RecEuclid {
    public static void main(String[] args) {
        int x = divisor(35,60);
        System.out.println(x);
    }

    public static int divisor(int a, int b) {
        if (b == 0) {
            return a;
        }
        int temp = a % b;
        a = b;
        b = temp;
        return divisor(a, b);
    }
}

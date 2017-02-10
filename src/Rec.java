public class Rec {
    public static void main(String[] args) {
        int x = pow(2, 3);
        System.out.println(x);

        int y = rec(2, 3);
        System.out.println(y);
    }


    public static int pow (int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    public static int rec (int a, int b) {
       if (b == 0){
           return 1;
       }
        return rec(a, b - 1) * a;
    }
}

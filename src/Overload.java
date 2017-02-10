public class Overload {
    public static void main(String[] args) {
        System.out.println(getTypeSize((byte) 5));

        System.out.println(getTypeSize((short) 5));

        System.out.println(getTypeSize(5));

        System.out.println(getTypeSize((long) 5));

        System.out.println(getTypeSize((double) 5));
    }

    public static int getTypeSize(byte x) {
        return 1;
    }

    public static int getTypeSize(short x) {
        return 2;
    }

    public static int getTypeSize(int x) {
        return 4;
    }

    public static int getTypeSize (long x) {
        return 8;
    }

    public static int getTypeSize (double x) {
        return 8;
    }
}

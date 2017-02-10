public class MaxString {
    public static void main(String[] args) {
        int max = findMax("hfffhhjkklll;;;;;rddddddd");
        System.out.println(max);
    }

    public static int findMax(String inputLine) {
        int maxString = 0;
        int count = 0;
        String lowerCase = inputLine.toLowerCase();

        if (inputLine.length() != 0) {
            for (int i = 0; i < (lowerCase.length() - 1); i++) {
                if (lowerCase.charAt(i) == lowerCase.charAt(i + 1)) {
                    count++;
                } else {
                    count = 0;
                }
                if (count > maxString) {
                    maxString = count;
                }
            }
            maxString++;
        }
        return maxString;
    }
}
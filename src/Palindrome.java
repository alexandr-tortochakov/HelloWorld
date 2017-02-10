public class Palindrome {
    public static void main(String[] args) {
        System.out.print(isPalindrome("Арге, нтина ма  нит не  гра"));
    }

    public static boolean isPalindrome (String string) {
        int i = 0;
        int j = string.length() - 1;
        while (i < j){
            while (i < j && !Character.isLetter(string.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetter(string.charAt(j))) {
                j--;
            }
            if (Character.toUpperCase(string.charAt(i)) != Character.toUpperCase(string.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

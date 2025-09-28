public class PalNum {
    public static void main(String[] args) {
         System.out.println(isPalindrome(-121)+"\n"+isPalindrome(121)+"\n"+isPalindrome(10)); 
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int original = x, reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
    }
        return original == reversed;
}
}
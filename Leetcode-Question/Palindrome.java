public class Palindrome {
    public boolean isPalindrome(int x) {
        int m = x;
        int b = 0;
        while(x > 0) {
            int a = x % 10;
            b=(b*10) + a;
            x = x / 10;
        }
        if(m == b) {
            return true;
        } else {
            return false;
        }

    }
}

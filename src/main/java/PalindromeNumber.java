public class PalindromeNumber {

    public static void main (String[] args){
        PalindromeNumber solution = new PalindromeNumber();

        int x = 121;
        int y = -121;

        boolean resultX = solution.isPalindrome(x);
        System.out.println("Output: " + resultX);
        boolean resultY = solution.isPalindrome(y);
        System.out.println("Output: " + resultY);
    }

    public boolean isPalindrome(int x) {
        int reveserse = 0;
        int original = x;
        while (x > 0) {
            int remains = x % 10;
            reveserse = (reveserse * 10) + remains;
            x = x / 10;
        }

        if(original == reveserse)
            return true;

        return false;
    }
}

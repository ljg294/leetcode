public class LongestPalindromicSubstring {
    public static void main(String[] args) {

        LongestPalindromicSubstring solution = new LongestPalindromicSubstring();
        String inputA = "babad";
        String resultA = solution.longestPalindrome(inputA);
        System.out.println(inputA + " : "+ resultA);

        String inputB = "cbbd";
        String resultB = solution.longestPalindrome(inputB);
        System.out.println(inputB + " : "+ resultB);

    }

    public static String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) return "";

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int lengthA = expandFromCenter(s, i, i);   // Odd length palindromes
            int lengthB = expandFromCenter(s, i, i + 1); // Even length palindromes
            int lengthResult = Math.max(lengthA, lengthB);

            if (lengthResult > end - start) {
                start = i - (lengthResult - 1) / 2;
                end = i + lengthResult / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private static int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}

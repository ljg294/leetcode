import java.util.HashMap;
import java.util.Map;

class LongestSubstringWithoutRepeatingCharacters {

    public static void main (String[] args){
        // Create an instance of the class
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();

        // Input string
        String s = "abcabcbb";

        // Call the method and print the result
        int result = solution.lengthOfLongestSubstring(s);
        System.out.println("Output: " + result);
    }

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        int left = 0;

        for (int right = 0; right < n; right++) {
            if (!charMap.containsKey(s.charAt(right)) || charMap.get(s.charAt(right)) < left) {
                charMap.put(s.charAt(right), right);
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                left = charMap.get(s.charAt(right)) + 1;
                charMap.put(s.charAt(right), right);
            }
        }

        return maxLength;
    }
}
public class FindTheIndexOfTheFirstOccurrenceInAString {

    public static void main(String[] args) {
        FindTheIndexOfTheFirstOccurrenceInAString solution = new FindTheIndexOfTheFirstOccurrenceInAString();

        // Example 1
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        System.out.println("Example 1: " + solution.strStr(haystack1, needle1)); // Output: 0

        // Example 2
        String haystack2 = "leetcode";
        String needle2 = "leeto";
        System.out.println("Example 2: " + solution.strStr(haystack2, needle2)); // Output: -1
    }

    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] example1 = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(example1)); // Output: "fl"

        String[] example2 = {"dog", "racecar", "car"};
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(example2)); // Output: ""
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            System.out.println("prefix : " + prefix);
            System.out.println("strs[i] : " + strs[i]);
            while (strs[i].indexOf(prefix) != 0) {
                System.out.println("strs[i].indexOf(prefix)" + strs[i].indexOf(prefix));
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    System.out.println("prefix is empty!");
                    return "";
                }
            }
        }

        return prefix;
    }

}
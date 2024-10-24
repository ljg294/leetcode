public class LengthOfLastWord {

    public static void main(String[] args) {

        LengthOfLastWord solution = new LengthOfLastWord();
        // 테스트 케이스 1
        String s1 = "Hello World";
        System.out.println(solution.lengthOfLastWord(s1));

        // 테스트 케이스 2
        String s2 = "   fly me   to   the moon  ";
        System.out.println(solution.lengthOfLastWord(s2));

        // 테스트 케이스 3
        String s3 = "luffy is still joyboy";
        System.out.println(solution.lengthOfLastWord(s3));
    }

    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RomanToInt {

    public static void main(String[] args) {
        RomanToInt solutions = new RomanToInt();
        //        MCMXCIV = 1994
        int resultX = solutions.romanToInt("III");
        System.out.println("resultX : " + resultX);
        System.out.println("=======================");
        int resultY = solutions.romanToInt("MCMXCIV");
        System.out.println("resultY : " + resultY);
    }

    public int romanToInt(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        char[] ch = { 'M', 'D', 'C', 'L', 'X', 'V', 'I' };
        int[] val = { 1000, 500, 100, 50, 10, 5, 1 };
        int i = 0, k = 0, lastPos = -1, sum = 0, lastVal=0;
        while (i < s.length()) {

            char c = s.charAt(i);
            while (k < ch.length && ch[k] != c) {
                k++;
            }
            if (k == ch.length && lastPos >= 0) {
                k = lastPos;
                while (k >= 0 && ch[k] != c) {
                    k--;
                }
                sum -= 2 * lastVal;
            }

            lastPos = k;
            sum += val[k];
            lastVal = val[k];
            i++;
        }
        return sum;
    }

//    public int romanToInt(String s) {
//
//        Map<Character, Integer> romanMap = new HashMap<>();
//        romanMap.put('I', 1);
//        romanMap.put('V', 5);
//        romanMap.put('X', 10);
//        romanMap.put('L', 50);
//        romanMap.put('C', 100);
//        romanMap.put('D', 500);
//        romanMap.put('M', 1000);
//
//        char[] charArr = s.toCharArray();
//        int result = 0;
//        int i = 0;
//        while(i < charArr.length - 1){
//            System.out.println("pre-result : " + result);
//            if(romanMap.get(charArr[i]) >= romanMap.get(charArr[i + 1])){
//                System.out.println("i : " + i);
//                System.out.println("romanMap.get(charArr[i]) : " + romanMap.get(charArr[i]));
//                result += romanMap.get(charArr[i]);
//                i++;
//            }
//            else {
//                result += romanMap.get(charArr[i + 1]) - romanMap.get(charArr[i]);
//                i += 2;
//            }
//        }
//
//        if (i == charArr.length - 1) {
//            result += romanMap.get(charArr[i]);
//        }
//        return  result;
//    }
}

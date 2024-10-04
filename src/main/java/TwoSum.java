import java.sql.Array;

public class TwoSum {

    public static void main(String[] args){
        TwoSum solution = new TwoSum();
        int[] input = {2,7,11,15};
        int target = 9;
        int[] result = solution.twoSum(input, target);
        for(int i = 0; i < result.length; i++){
            System.out.println(i);
        }

    }

    public int[] twoSum(int[] nums, int target) {
        int[] resultArray = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                if(target == nums[i] + nums[j]){
                    resultArray[0] = i;
                    resultArray[1] = j;
                }
            }
        }
        return resultArray;
    }
}
public class TwoSum {
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

// Example 1:
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

//Example 2:
//
//Input: nums = [3,2,4], target = 6
//Output: [1,2]

//Example 3:
//
//Input: nums = [3,3], target = 6
//Output: [0,1]
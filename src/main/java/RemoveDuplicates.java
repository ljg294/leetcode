public class RemoveDuplicates {
    public static void main(String[] args) {
        RemoveDuplicates solution = new RemoveDuplicates();

        int[] nums1 = {1, 1, 2};
        int newLength1 = solution.removeDuplicates(nums1);
        System.out.println("New length: " + newLength1);
        for (int i = 0; i < newLength1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        int newLength2 = solution.removeDuplicates(nums2);
        System.out.println("New length: " + newLength2);
        for (int i = 0; i < newLength2; i++) {
            System.out.print(nums2[i] + " ");
        }
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;

        int uniqueIndex = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }

        return uniqueIndex;
    }
}

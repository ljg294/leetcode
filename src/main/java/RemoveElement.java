public class RemoveElement {
    public static void main(String[] args) {
        RemoveElement solution = new RemoveElement();

        // Test Case 1
        int[] input1 = {3, 2, 2, 3};
        int val1 = 3;
        int result1 = solution.removeElement(input1, val1);
        System.out.println("Result 1: " + result1);
        for (int i = 0; i < result1; i++) {
            System.out.print(input1[i] + " ");
        }
        System.out.println();

        // Test Case 2
        int[] input2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int result2 = solution.removeElement(input2, val2);
        System.out.println("Result 2: " + result2);
        for (int i = 0; i < result2; i++) {
            System.out.print(input2[i] + " ");
        }
        System.out.println();
    }

    public int removeElement(int[] nums, int val) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}

public class FindMedianSortedArrays {
    public static void main(String[] args) {
        FindMedianSortedArrays solution = new FindMedianSortedArrays();
        int[] nums1 = {1,2}, nums2 = {3,4};
        double result = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println(result);

        int[] nums3 = {1,3}, nums4 = {2};
        double result2 = solution.findMedianSortedArrays(nums3, nums4);
        System.out.println(result2);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sizeV = nums1.length + nums2.length;
        int medianIndex = sizeV / 2;
        int counter = 0;

        // Index pointers for both arrays
        int index1 = 0;
        int index2 = 0;

        int current = 0, prev = 0;

        // Traverse through both arrays until reaching the medianIndex
        while (counter <= medianIndex) {
            prev = current;

            // Handle cases where one array is exhausted
            if (index1 < nums1.length && (index2 >= nums2.length || nums1[index1] < nums2[index2])) {
                current = nums1[index1];
                index1++;
            } else if (index2 < nums2.length) {
                current = nums2[index2];
                index2++;
            }

            counter++;
        }

        // If the total size is odd, return the current value (single median)
        if (sizeV % 2 != 0) {
            return current;
        }
        // If the total size is even, return the average of the two middle values
        else {
            return (prev + current) / 2.0;
        }
    }

    //mine
//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        int numsLength = nums1.length + nums2.length;
//        int[] numsAll = new int[numsLength];
//        System.arraycopy(nums1, 0, numsAll, 0, nums1.length);
//        System.arraycopy(nums2, 0, numsAll, nums1.length, nums2.length);
//        Arrays.sort(numsAll);
//
//        if (numsLength % 2 != 0) {
//            return numsAll[numsLength / 2];
//        }
//        return ((double) numsAll[numsLength / 2 - 1] + numsAll[numsLength / 2]) /2;
//    }
}


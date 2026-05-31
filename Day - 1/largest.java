
import java.util.*;

class Largest {

    public static int largestElement(int[] nums) {
        // Sort array
        Arrays.sort(nums);

        /*
         * Largest element will be at
         * the last index of the array.
         */
        int largest = nums[nums.length - 1];

        // Return the largest element in array.
        return largest;
    }

    public static int ndApproach(int[] nums) {

        // Initialize max as the first element
        int max = nums[0];

        // Traverse the entire array
        for (int i = 1; i < nums.length; i++) {

            /*
             * If current element is greater
             * than max, update max
             */
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        // Return the largest element found
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 5, 2 };
        System.out.println(ndApproach(arr));
    }
}

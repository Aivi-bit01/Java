
import java.util.*;

class Largest {

    public static int largestElement(int[] nums) {
        // Sort array
        Arrays.sort(nums);

        /*Largest element will be at 
        the last index of the array.*/
        int largest = nums[nums.length - 1];

        //Return the largest element in array.
        return largest;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 2};
        System.out.println(largestElement(arr));
    }
}

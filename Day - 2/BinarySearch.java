import java.util.*;
class BinarySearch {

    // Searching tecq :-
    // 1. linear search, 2. Binary Search

    public static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 7, 6, 4 };
        int target = 6;
        System.out.println(linearSearch(arr, target));
    }
}

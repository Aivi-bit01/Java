import java.util.*;

class BinarySearch {

    // Searching tecq :-
    // 1. linear search,

    public static void linearSearch(int[] nums, int target) { // O(n)
        int count = 0, ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                // return i;
                ans = i;
                break;
            }
            count++;
        }
        // return -1;
        System.out.println(count);
        System.out.println(ans);
    }

    // n = 100 , logn = 7
    // 2. Binary Search(sorted array) O(logn)
    public static void binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int count = 0, ans = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            count++;
            if (nums[mid] == target) {
                ans = mid;
                break;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(count);
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int[] arr = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
                51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
                61, 62, 63, 64, 65, 66, 67, 68, 69, 70,
                71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
                81, 82, 83, 84, 85, 86, 87, 88, 89, 90,
                91, 92, 93, 94, 95, 96, 97, 98, 99, 100
        };
        int target = 100;
        // System.out.println(linearSearch(arr, target));
        linearSearch(arr, target);
        binarySearch(arr, target);
    }
}

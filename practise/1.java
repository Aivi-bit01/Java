package practise;

import java.util.*;

class Solution {
    public static boolean isSorted(ArrayList<Integer> nums) {
        // your code goes here
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) // [1, 2, 4, 3, 5] || 1 < 2
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(1,2,2,3)); //strictly check -> i < i+1
        System.out.println(isSorted(arr));
    }
}
// array -> having fix size int[] aivi = new int[5]; -> aiv[3] = 3; print ;
// aiv.length
// ArrayList -> Dynamic ArrayList<Integer> sayan = new ArrayList<>();
// operation -> sayan.get(3) = 6, sayan.add(4); print(sayan); sayan.size();
/*
 * i = 0 -> 1-> 2
 * i = 1 || 2 -> 4
 * i = 2 || 4 -> 3
 * i = 3 || 3 -> 5
 */
package practise;

import java.util.*;
class removeDup {
    public static int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[count]) {
                count++;
                nums[count]= nums[i ];
            }
        }
        return count + 1;
    }

    public static int removeDuplicatesBySet(int[] nums){
        Set<Integer> set = new HashSet<>(); 
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int[] arr = {0, 0, 3, 3, 5, 6};
        System.out.println(removeDuplicates(arr));
    }
}
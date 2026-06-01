class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int max=0;
       int count=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==1){   //i=0  nums[0]=1 || if (nums[i]==1) ->true count++  ->1     max=Math.ax(count,max)  ->It compare the two variable and reurns          
            count++;      //                                                                                    the bigger one.
        }else{
            count=0;
        }
        max=Math.max(count,max);
       } 
       return max;
    }
}
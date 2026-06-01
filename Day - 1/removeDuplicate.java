class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=nums[i]){
            nums[i+1]=nums[j];                      //nums=[1, 1, 2 , 2 ,3]
            i++;                                    //i=0 j=0 nums[0]!=nums[0] -> if(1!=1) ->false
            }                                       //j=1 nums[1]!=nums[0]  -> if(1!=1)  ->false
        }                                           //j=2 nums[2]!=nums[0]  ->if(2!=1) ->true       
        return i+1;                                                // nums[i+1]=nums[j]                 
    }                                                               //nums[0+1]=nums[2]
}                                                                   //nums[1]=2   [1, 2 , 2 ,2 , 3]
                                                                    //i++  ||i=1
                                                    //i=1 j=3 nums[3]!=nums[1]  ->if(2!=2)  ->false
                                                    //j=4     nums[4]!=nums[1]  ->if(3!=2)  ->true
                                                                    //nums[i+1]=nums[j]
                                                                    //nums[1+1]=nums[4]
                                                                    //nums[2]=3
                                                                    //i++  || i=2
                                                    //i=2 j=5  || 5<5 loop stop return 2+1=3

package practise;

class remove {
    public static void removeDuplicateArray(int [] nums){
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        
    }
    public static void main(String[] args) {
        int[] arr = {03, 0, 3, , 5, 6};
        removeDuplicateArray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}

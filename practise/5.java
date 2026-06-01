package practise;

class LeftBy1 {
        public static void rotateArrayByOne(int[] nums) {
            // [1, 2, 3, 4, 5]
            // [2, 3, 4, 5, ]
            int temp = nums[0];
            for (int i = 0; i < nums.length - 1; i++) {
                nums[i] = nums[i + 1];  //[]
            }
            nums[nums.length - 1] = temp;
        }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        rotateArrayByOne(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

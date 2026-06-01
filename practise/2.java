package practise;

class Largest {
    public static int secondLargestElement(int[] nums) {
        int largest = nums[0];
        int secondLargestEle = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                secondLargestEle = largest;
                largest = nums[i];

            } else if (nums[i] != largest) {
                secondLargestEle = nums[i];
            }
        }
        return secondLargestEle;
    }
    public static void main(String[] args) {
        int arr[]={12,45,3,67,8,4};
        System.out.println(secondLargestElement(arr));
    }
}


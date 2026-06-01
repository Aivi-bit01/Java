package practise;

class Col {
    public static int secondLargestElement(int nums[]) {
        int largestEle = nums[0];
        int secondLargestEle = -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largestEle) {
                secondLargestEle = largestEle;
                largestEle = nums[i];
            } else if (largestEle > nums[i] && nums[i] > secondLargestEle) {
                secondLargestEle = nums[i];
            }
        }
        return secondLargestEle;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 45, 3, 67, 8, 4 };
        System.out.println(secondLargestElement(arr));
    }
}

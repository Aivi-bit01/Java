package practise;

class Linear {
    public  static int linearSearch(int nums[], int target) {
        // Your code goes here
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1, 3, 5, -4, 1};
        System.out.println(linearSearch(arr, -4));
    }
}
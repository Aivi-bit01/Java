package practise;

class moveZero {
    public static void move(int[] arr) { // tc-O(n), sc - O(n);
        int[] temp = new int[arr.length]; // [0,0,0,0,0,0];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }

    public static void move0(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 7, 9, 0, 6 }; // => [7,9,6,0,0,0]
        move0(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
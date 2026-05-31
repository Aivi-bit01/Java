public class timeComplexity {
    public static void main(String[] args) {
        int i = 1, n = 5, count = 0;
        while (i <= n) {
            for (int j = 0; j < n; j++) {
                count++;
            }
            i++;
        }
        System.out.println(count);
    }
}

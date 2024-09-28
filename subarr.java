public class subarr {
    public static void subArr(int numbers[]) {
        int ts = 0; // total sub arrays

        int maxSum = Integer.MIN_VALUE; // Initialize with the smallest possible value
        int minSum = Integer.MAX_VALUE; // Initialize with the largest possible value

        for (int i = 0; i < numbers.length; i++) {
            int sum = 0;
            for (int j = i; j < numbers.length; j++) {
                System.out.print("[");
                int ssum = 0;
                for (int k = i; k <= j; k++) {

                    System.out.print(numbers[k] + " ");
                    sum += numbers[k];
                    ssum += numbers[k];
                }

                ts++; // total sub arrays
                System.out.print(", sum " + ssum);
                System.out.print("]");

                // Update maxSum and minSum
                if (ssum > maxSum) {
                    maxSum = ssum;
                }
                if (ssum < minSum) {
                    minSum = ssum;
                }
            }
            System.out.println();

        }

        // Output total subarrays
        System.out.println("Total subarrays: " + ts);

        // Output the maximum and minimum sum of subarrays
        System.out.println("Maximum subarray sum: " + maxSum);
        System.out.println("Minimum subarray sum: " + minSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        int nums[] = { 1, -2, 6, -1, 3 };
        subArr(numbers);
        subArr(nums);
    }
}

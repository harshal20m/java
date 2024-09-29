public class Preffix {

    public static void maxSubarraySum(int numbers[]) {
        int currSum;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) { // Include end index
                    currSum += numbers[k];
                }
                System.out.println("Subarray (" + i + " to " + j + "): " + currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Max sum = " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { -1, 2, 1, 4, 3 };
        maxSubarraySum(numbers);
    }
}

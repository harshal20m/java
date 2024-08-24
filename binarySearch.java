public class binarySearch {
    public static int BinarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // comparisons
            if (numbers[mid] == key) { // found
                return mid; // thus key found in the middle
            }
            if (numbers[mid] < key) { // right
                start = mid + 1; // mid key se chota hogya means 2nd half me dhundhenge

            } else { // left
                end = mid - 1; // mid key se bada hoga then 1 st part me dhundhenge and update karenge end ko
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 12;
        System.out.println("the index at which the key is present " + BinarySearch(numbers, key));
    }
}

public class assign11 {
    public static int longestSubarrayWithSumAtMostK(int[] arr, int K) {
        int left = 0;
        int currentSum = 0;
        int maxLength = 0;

        for (int right = 0; right < arr.length; right++) {
            currentSum += arr[right];

            while (currentSum > K && left <= right) {
                currentSum -= arr[left];
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6,7,8,9,10};
        int K = 11;

        int result = longestSubarrayWithSumAtMostK(arr, K);
        System.out.println("Length of longest subarray with sum <= " + K + " is: " + result);
    }
}
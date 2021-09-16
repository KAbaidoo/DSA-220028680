package divideNConquer;

public class MaxSubArrayGP {

    public static void main(String[] args) {
        MaxSubArrayGP mx = new MaxSubArrayGP();

        System.out.println(mx.maxSubArrayDivideAndConquer(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(mx.kandaneMaxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    /**
     * Uses Kadane's algorithm to solve the maxsubarray problem.
     * The complexity is O(n).
     * @param nums The array of integers
     * @return The sum of the maximum subarray
     */
    public int kandaneMaxSubArray(int[] nums){
        int bestSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int maxNum = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            /**
             * We want to keep track of the current sum so far.
             * If the current sum goes to negative, we wanna reset it to 0
             * and start checking again.
             */
            currentSum = Math.max(0, currentSum + nums[i]);

            // update best sum
            bestSum = Math.max(bestSum, currentSum);

            /**
             * We use this to handle the negative array case
             */
            maxNum = Math.max(maxNum, nums[i]);
        }

        /**
         * If the maximum number in the array is a negative number
         * then that is the maximum subarray.
         */
        if (maxNum < 0)
            return maxNum;

        return bestSum;
    }

    /**
     * Shell function for the divide-and-conquer maxsubarray solution.
     * The complexity is O(nlogn)
     * @param nums The array of integers.
     * @return The sum of the maximum subarray
     */
    public int maxSubArrayDivideAndConquer(int[] nums){
        return maxSubArray(nums, 0, nums.length - 1);
    }

    /**
     * Recursive function for implementing the divide-and-conquer solution to the maxsubarray problem.
     * @param nums The array of integers.
     * @param low The starting index to consider in the sub-problem.
     * @param high The highest index to consider in the sub-problem.
     * @return The sum of the maximum subarray in the sub-problem.
     */
    private int maxSubArray(int[] nums, int low, int high){
        // base condition
        if(low > high)
            return Integer.MIN_VALUE;

        // finds the index of the array's midpoint
        int mid = (low + high) / 2;

        // used to keep track of the sum of numbers
        int cur = 0;

        // left half : start from mid - 1 and go to low
        int bestLeftHalf = 0;
        for(int i = mid - 1; i >= low; i--){
            cur += nums[i];
            bestLeftHalf = Math.max(bestLeftHalf, cur);
        }

        // right half : start from mid + 1 and go to high
        int bestRightHalf = 0;
        cur = 0;
        for(int i = mid + 1; i <= high; i++){
            cur += nums[i];
            bestRightHalf = Math.max(bestRightHalf, cur);
        }

        int combined = bestLeftHalf + nums[mid] + bestRightHalf;

        // recursive calls (for sub-problems)
        int leftSubarray = maxSubArray(nums, low, mid - 1);
        int rightSubarray = maxSubArray(nums, mid + 1, high);

        return Math.max(combined, Math.max(leftSubarray, rightSubarray));
    }
}


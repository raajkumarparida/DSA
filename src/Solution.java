import java.util.Arrays;

class Solution {
    public int minPairSum(int[] nums) {

        // Step 1: Sort the array (very important!)
        Arrays.sort(nums);           // now nums looks like: [small ... big]

        // Step 2: We will check pairs from two ends
        int left = 0;                // points to smallest remaining
        int right = nums.length - 1; // points to largest remaining

        int maxPairSum = 0;          // will keep the worst (largest) pair sum

        // Step 3: Pair smallest with largest, next smallest with next largest, etc.
        while (left < right) {

            int currentSum = nums[left] + nums[right];   // make the pair

            // We only care about the MAXIMUM among all pair sums
            maxPairSum = Math.max(maxPairSum, currentSum);

            left++;      // move to next smallest
            right--;     // move to next largest
        }

        // Step 4: After checking all pairs, maxPairSum has the answer
        return maxPairSum;
    }
}
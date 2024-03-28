//     2958. Length of Longest Subarray With at Most K Frequency    (Leetcode)



class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxLength = 0; 

        for (int start = 0, end = 0; end < nums.length; ++end) {
            map.merge(nums[end], 1, Integer::sum);

            while (map.get(nums[end]) > k) {
                map.merge(nums[start], -1, Integer::sum);
                start++; 
            }
            maxLength = Math.max(maxLength, end - start + 1);
        }
      
        return maxLength;
    }
}

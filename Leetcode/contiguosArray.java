//   525. Contiguous Array   (Leetcode)


class Solution {
    public int findMaxLength(int[] nums) {
    int ans = 0;
    int count = 0;
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, -1);

    for (int i = 0; i < nums.length; ++i) {
    
      count += nums[i] == 1 ? 1 : -1;
      
      if (map.containsKey(count))
        ans = Math.max(ans, i - map.get(count));
      else
        map.put(count, i);
    }

    return ans;
    }
}

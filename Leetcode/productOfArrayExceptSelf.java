//   238. Product of Array Except Self   (Leetcode)


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[] = new int[nums.length];
        int count = 1;

        for(int i=0 ; i<nums.length; i++){
            res[i] = count;
            count *= nums[i]; 
        }
        count = 1;
        for(int i = nums.length-1; i>=0; i--){
            res[i] *= count;
            count *= nums[i];
        }
        return res;
    }
}

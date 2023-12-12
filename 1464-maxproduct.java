class Solution {
    public int maxProduct(int[] nums) {
        fort(nums);
        int x = nums[nums.length-1]-1;
        int y = nums[nums.length-2]-1;
        return x*y;
    }
}

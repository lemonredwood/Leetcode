class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans = nums.length+1;
        int i = 0;
        int j = 0;
        int sum = 0;
        while(i<nums.length && j<nums.length){
            while(j<nums.length && sum+nums[j]<target){
                sum+=nums[j];
                j++;
            }
            if(ans>j-i+1){
                ans=j-i+1;
            }
            sum-=nums[i];
            i++;
        }
        if(ans==nums.length+1)return 0;
        return ans;
    }
}

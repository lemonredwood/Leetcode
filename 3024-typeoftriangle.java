class Solution {
    public String triangleType(int[] nums) {
        if(nums[0]==nums[1] && nums[1]==nums[2]) return "equilateral";
        int sum=0;
        for(int i=0;i<3;i++)sum+=nums[i];
        for(int i=0;i<3;i++){
            if(nums[i]>=sum-nums[i])return "none";
        }
        if(nums[0]!=nums[1] && nums[1]!=nums[2] && nums[2]!=nums[0])return "scalene";
        else return "isosceles";
    }
}

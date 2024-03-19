class Solution {
    public int jump(int[] nums) {
        if(nums.length<2)return  0;
        int ans=0;
        int left=0;
        int right=0;
        while(right<nums.length-1){
            int max=0;
            for(int i=left;i<=right;i++){
                if(nums[i]+i>max)max=nums[i]+i;
            }
            left=right+1;
            right=max;
            ans++;
        }
        return ans;
    }
}

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1)return 0; 
        int left = 0;
        int product = 1;
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            product*=nums[i];
            while(left<=i && product>=k){
                product/=nums[left];
                left++;
            }
            ans=ans+i-left+1;
        }
        return ans;
    }
}

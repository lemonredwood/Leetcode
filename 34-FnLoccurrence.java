class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        if(nums.length==0)return ans;
        if(nums.length==1 && nums[0]==target){
            ans[0]=0;
            ans[1]=0;
            return ans;
        }
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target){
                while(mid>=left && nums[mid]==target)mid--;
                ans[0]=1+mid++;
                while(mid<=right && nums[mid]==target)mid++;
                ans[1]=mid-1;
                break;
            }
            else if (nums[mid]>target)right = mid-1;
            else left = mid+1;
        }
        return ans;
    }
}

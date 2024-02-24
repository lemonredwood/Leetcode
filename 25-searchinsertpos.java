class Solution {
    public int searchPosition(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]>target)return i;
        }
        return nums.length;
    }
    public int binarySearch(int[] nums, int left, int right, int target){
        if(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target)return mid;
            if(target<nums[mid])return binarySearch(nums,left,mid-1,target);
            if(target>nums[mid])return binarySearch(nums,mid+1,right,target);
        }
        return searchPosition(nums,target);
    }
    public int searchInsert(int[] nums, int target) {
        if(nums.length==0)return 0;
        return binarySearch(nums,0,nums.length-1,target);
    }
}

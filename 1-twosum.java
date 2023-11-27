class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        int newnums[]=new int[2];
        for(int i=0;i<size-1;i++){
            for (int j=i+1;j<size;j++){
                if(nums[i]+nums[j]==target){
                    newnums[0] = i;
                    newnums[1] = j;
                    break;
                }                
            }
        }
        return newnums;
    }
}
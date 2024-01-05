class Solution {
    public int removeDuplicates(int[] nums) {
        int x=0;
        int flag=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1] && flag==0){
                nums[++x]=nums[i];
                flag=1;
            }
            else if(nums[i]!=nums[i-1]){
                nums[++x]=nums[i];
                flag=0;
            }
        }
        return ++x;
    }
}

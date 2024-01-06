class Solution {
    public boolean canJump(int[] nums) {
        int i=nums.length-1;
        int count=0;
        while(i>0){
            if(++count<=nums[--i])count=0;
        }
        if(count==0) return true;
        else return false;
    }
}

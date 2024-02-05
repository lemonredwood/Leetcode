class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int distance = 0;
        int index = 0;
        int count = 0;
        while(index<nums.length){
            distance+=nums[index++];
            if(distance==0)count++;
        }
        return count;
    }
}

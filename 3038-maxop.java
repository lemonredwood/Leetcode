class Solution {
    public int maxOperations(int[] nums) {
        int key = nums[0]+nums[1];
        int i=2;
        while(i<nums.length-1){
            if(nums[i]+nums[++i]==key)i++;
            else break;
        }
        System.out.println(i);
        return i/2;
    }
}

class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int newnums[] = new int[nums.length];
        int i = 0;
        k=nums.length-k;
        while(k<nums.length){
            newnums[i++] = nums[k++];
        }
        k=0;
        while(i<nums.length){
            newnums[i++] = nums[k++];
        }
        for(int x=0; x<nums.length;x++){
            nums[x] = newnums[x];
        }
    }
}
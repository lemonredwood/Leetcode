class Solution {
    public int maxFrequencyElements(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        int max_elements = 1;
        int i = 1;
        while(i<nums.length){
            int count = 1;
            while(i<nums.length && nums[i]==nums[i-1]){
                count++;
                i++;
            }
            if(count>max){
                max=count;
                max_elements=count;
            }
            else if(count==max){
                max_elements+=count;
            }
            i++;
        }
        if(max==1)return max_elements+1;
        return max_elements;
    }
}

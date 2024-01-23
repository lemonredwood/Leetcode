class Solution {
    public int[] productExceptSelf(int[] nums) {
        int answer[] = new int[nums.length];
        int product = 1;
        int count=0;
        int temp_product = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)product*=nums[i];
            else count++;
        }

        if(count>1)return answer;
        
        temp_product = product;
        if(count==1)product=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)answer[i]=product/nums[i];
            else answer[i]=temp_product;
        }
        return answer;
    }
}

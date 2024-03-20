class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1])continue;
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                if(nums[l]+nums[r]+nums[i]>0)r--;
                else if(nums[l]+nums[r]+nums[i]<0)l++;
                else{
                    List<Integer> temp = new ArrayList();
                    temp.add(nums[i]);
                    temp.add(nums[l]);
                    temp.add(nums[r]);
                    ans.add(temp);
                    l++;
                    while(nums[l]==nums[l-1] && l<r)l++;
                }
            }
        }
        return ans;
    }
}

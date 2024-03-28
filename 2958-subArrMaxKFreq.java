class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap();
        int ans=0;
        int l=0;
        int r=0;
        while(r<nums.length && l<nums.length){
            
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            
            if(map.get(nums[r])>k){
                ans = Math.max(r-l,ans);
                while(l<r){
                    map.put(nums[l],map.get(nums[l])-1);
                    if(nums[l++]==nums[r])break;
                }
            }
            r++;
        }
        ans = Math.max(r-l,ans);
        return ans;
    }
}

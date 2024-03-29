class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = 0;
        long ans = 0;
        for(int i:nums) max = Math.max(max,i);
        Map<Integer,Integer> map = new HashMap();
        int left = 0;
        int right = 0;
        
        while(left<nums.length && right<nums.length){
            
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            
            if(map.get(max)!=null && map.get(max)>=k){
                while(left<=right){
                    ans+=nums.length-right;
                    map.put(nums[left],map.get(nums[left])-1);
                    if(map.get(nums[left])==0) map.remove(nums[left]);
                    left++;
                    if(nums[left-1]==max)break;
                }
            }
            right++;
        }
        return ans;
    }
}

//Better ans efficient soln

class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = 0, count = 0, l = 0;
        long ans = 0;
        for(int i:nums) max = Math.max(max,i);
        for(int r=0; r<nums.length; r++){
            if(nums[r]==max)count++;
            while(count>=k){
                ans+=nums.length-r;
                if(nums[l]==max)count--;
                l++;
            }
        }
        return ans;
    }
}

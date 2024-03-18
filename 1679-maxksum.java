class Solution {
    public int maxOperations(int[] nums, int k) {
        int ans=0;
        Map<Integer,Integer> map = new HashMap();
        for(int i:nums){
            if(map.get(i)==null)map.put(i,1);
            else map.put(i,map.get(i)+1);
        }
        for(int i:map.keySet()){
            if(map.get(k-i)!=null && k%2==0 && i==k/2){
                int temp = (int)Math.floor(map.get(i)/2);
                ans+=temp;
                map.put(i,map.get(i)-2*temp);
                
            }
            else if(map.get(k-i)!=null){
                int temp = Math.min(map.get(i),map.get(k-i));
                ans+=temp;
                map.put(i,map.get(i)-temp);
                map.put(k-i,map.get(k-i)-temp);
            }
        }        
        return ans;
    }
}



//alternative solution

class Solution {
    public int maxOperations(int[] nums, int k) {
        int n=0;
        for(int i:nums)if(i<k)nums[n++]=i;
        Arrays.sort(nums,0,n);
        int left = 0;
        int right = n-1;
        int ans = 0;
        while(left<right){
            if(nums[left]+nums[right]==k){
                ans++;
                left++;
                right--;
            }
            else if(nums[left]+nums[right]<k) left++;
            else right--;
        }
        return ans;
    }
}

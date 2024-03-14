class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList();
        if(nums.length==0)return ans;
        int i=0;
        String temp = "";
        while(i<nums.length){
            int f = nums[i];
            while(i<nums.length-1 && nums[i+1]-nums[i]==1)i++;
            int l = nums[i];
            if(f!=l)temp=f+"->"+l;
            else temp=f+"";
            ans.add(temp);
            i++;
        }
        return ans;
    }
}

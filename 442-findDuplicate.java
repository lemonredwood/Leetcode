// Using HashMap(which is not constant space) but the question asks to do it in constant space and linear time complexity.

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList();
        Map<Integer,Integer> check = new HashMap();
        for(int i:nums){
            if(check.get(i)==null)check.put(i,1);
            else{
                ans.add(i);
                check.put(i,2);
            }
        }
        return ans;
    }
}

// Better solution using an array of length n

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList();
        int[] check = new int[nums.length];
        for(int i:nums){
            check[i-1]++;
            if(check[i-1]==2)ans.add(i);
        }
        return ans;
    }
}

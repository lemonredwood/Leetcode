class Solution {
    public int encrypt(int n){
        String x = Integer.toString(n);
        char max = 0;
        String ans = new String();
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)>max)max=x.charAt(i);
        }
        for(int i=0;i<x.length();i++)ans+=max;
        return Integer.parseInt(ans);
    }
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            nums[i] = encrypt(nums[i]);
            sum+=nums[i];
        }
        return sum;
    }
}

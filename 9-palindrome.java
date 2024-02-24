class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        int ans=0;
        int temp = x;
        while(temp!=0){
            int a = temp%10;
            ans = ans*10 + a;
            temp=temp/10;
        }
        return ans==x;
    }
}

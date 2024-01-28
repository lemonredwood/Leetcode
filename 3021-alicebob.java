class Solution {
    public long flowerGame(int n, int m) {
        if(n<=1 && m<=1)return 0;
        long count=0;
        for(int i=1;i<=n;i++){
            if(i%2==1)count+=(m/2);
            else count+=(m+1)/2;
        }
        return count;
    }
}

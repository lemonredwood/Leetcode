class Solution {
    public double myPow(double x, int n) {
        if(n==0 || x==1)return 1;
        double ans=1;
        long m = n;
        if(n<0)m = -1*m;
        while(m!=0){
            if(m%2==1){
                ans*=x;
                m--;
            }
            else{
                x=x*x;
                m/=2;
            }
        }
        if(n<0) ans=(double)(1.0)/(double)ans;
        return ans;
    }
}

class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1)return x;
        int num = 1;
        int i = 2;
        while(i<=(x/i)){
            num++;
            if(i*i==x)break;
            else if(i*i>x){
                num--;
                break;
            }
            i++;
        }
        return num;
    }
}
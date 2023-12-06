class Solution {
    public int totalMoney(int n) {
        int i = 0;
        int count = 1;
        int balance = 0;
        while(i<n){
            if(i%7==0 && i!=0){
                count = count-6;
            } 
            balance += count++;
            i++;
        }
        return balance;
    }
}

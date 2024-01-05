class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int minprice = prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minprice)minprice=prices[i];
            if(prices[i]-minprice>max)max=prices[i]-minprice;
        }
        return max;
    }
}

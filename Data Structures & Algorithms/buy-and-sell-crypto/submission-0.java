class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        
        int l = 0 , r = 1;
        int maxP = 0;

        

        while(r<n){
            if(prices[l]<prices[r]){
                int profit = prices[r]-prices[l];
                maxP = Math.max(profit,maxP);
            }else{
                l = r ;

            }
            r++;
        }
        return maxP;
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int left = 0;
        int right = 1;
        while(right<prices.length){
            int ans = prices[right]-prices[left];
            if(prices[right]>prices[left]){
                right++;
            }else{
                left = right;
                right++;
            }
            maxprofit = Math.max(ans,maxprofit);
        }
        return maxprofit;
    }
}
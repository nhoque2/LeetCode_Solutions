class Solution {
    public int maxProfit(int[] prices) {
        //int[][] dp = new int[prices.length][prices.length];
        int minPrice=Integer.MAX_VALUE, maxProfit=0;
        for(int i=0;i<prices.length;i++){
            minPrice=Math.min(minPrice,prices[i]);
            if(prices[i]-minPrice>maxProfit){
                maxProfit=prices[i]-minPrice;
            }    
        }
        
        return maxProfit;
    }
}
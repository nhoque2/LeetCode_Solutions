class Solution {
    public int arrangeCoins(int n) {
        return arrangeCoins(n,0);
    }
    public int arrangeCoins(int n, int count){
        if(n<=count){
            return count;
        }
        return arrangeCoins(n-++count, count);
    }
}
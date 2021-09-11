class Solution {
    public int mySqrt(int x) {
        if(x<1) return 0;
        int res = 1;
        for(int i=1;i<=Math.sqrt(x);i++){
            if(i*i<=x){
                res=i;
            }
        }
        return res;
        
    }
}
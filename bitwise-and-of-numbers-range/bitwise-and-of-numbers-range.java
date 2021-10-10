class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int sum=left;
        for(int i=left;i<right;i++){
           sum&=(i+1);
           if(sum==0) return sum;
        }
        return sum;
        
    }
}
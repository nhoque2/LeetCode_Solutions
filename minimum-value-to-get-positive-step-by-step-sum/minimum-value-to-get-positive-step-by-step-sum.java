class Solution {
    public int minStartValue(int[] nums) {
        int minSum = 0, sum=0;
        for(int i : nums){
           sum+=i;
           minSum=Math.min(sum,minSum);
        }
        return -minSum + 1;   
    }
}
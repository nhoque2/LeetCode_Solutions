class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>maxSum){
                maxSum=sum;
            }
            if(nums[i]>sum){
                sum=nums[i];
                maxSum=Math.max(maxSum,nums[i]);
            }
            System.out.println(sum+" "+maxSum);
        }
        return maxSum;
        
    }
}
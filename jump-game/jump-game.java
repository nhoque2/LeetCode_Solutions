class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length<2) return true;
        boolean[] canVisit = new boolean[nums.length];
        for(int i=0;i<=nums[0] && i<nums.length;i++){
            canVisit[i]=true;
        }
        for(int i=1;i<nums.length;i++){
            for(int j=i;j<i+nums[i];j++){
                if(j<nums.length-1 && canVisit[j]){
                    canVisit[j+1]=true;
                }
                //System.out.println(Arrays.toString(canVisit));
            }
            if(canVisit[canVisit.length-1]){
                return true;
            }
           
        }
    
        return false;
        
    }
}
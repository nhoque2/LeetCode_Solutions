class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        Arrays.sort(nums);
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]<target){
                low=mid+1;
                
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                return mid;
            }
            System.out.println("high: "+high+" low: "+low+" mid: "+mid);
        }
        return low;
    }
}
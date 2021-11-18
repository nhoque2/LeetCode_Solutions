class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        //System.out.println(Arrays.toString(nums));
        int[] counts = new int[nums.length+1];
        for(int i:nums){
          counts[i]++;
        }
        for(int i=1;i<counts.length;i++){
            if(counts[i]==0){
                res.add(i);
            }
           
        }
       
      
        return res;
        
    }
}
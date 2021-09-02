class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length==0 && nums2.length==1){
            return (double)nums2[0];
        }
        else if(nums1.length==1 && nums2.length==0){
            return (double)nums1[0];
        }
        int[] res = new int[nums1.length+nums2.length];
        System.arraycopy(nums1, 0, res, 0, nums1.length);
        System.arraycopy(nums2, 0, res, nums1.length, nums2.length);
        Arrays.sort(res);
        int mid=res.length/2;
        if(res.length%2==1){
            return (double)res[mid];
        }
        //System.out.println(Arrays.toString(res)+" mid: "+res[mid]);
        return (double)(res[mid]+res[mid-1])/2;
        
    }
}
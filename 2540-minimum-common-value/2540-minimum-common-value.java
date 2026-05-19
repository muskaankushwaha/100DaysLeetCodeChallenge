class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int l=0;
        int r=0;
        while(l<m&&r<n){
            if(nums1[l]<nums2[r]){
                l++;
            }else if(nums1[l]>nums2[r]){
                r++;
            }
            else if(nums1[l]==nums2[r]){
                return nums1[l];
            }
        }return -1;
    }
}
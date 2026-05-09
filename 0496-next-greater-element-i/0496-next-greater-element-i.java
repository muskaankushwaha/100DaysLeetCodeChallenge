class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] ans=new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
              int max=nums1[i];
            for(int j=0; j<nums2.length ; j++){
                if(nums1[i]!=nums2[j]){
                continue;
                }else{
                    for(int k=j; k<nums2.length; k++){
                        max=Math.max(nums2[k],max);
                       if(nums1[i]!=max) break;
                    }
                    break;
                }
            }if(nums1[i]==max){
                max=-1;
            }
            ans[i]=max;
        }
        return ans;
    }
}
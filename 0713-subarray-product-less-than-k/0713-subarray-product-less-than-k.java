class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        // int max=-1;
        // int cmx=1;
        // int cmn=1;
        // int idx=0;
        // int count=0;
        // for(int i=0; i<nums.length; i++){
        //     if(cmx*nums[i]>=k){
        //         int temp =cmx;
        //         cmx=cmn;
        //         cmn=temp;
        //         idx=i-1;
        //         System.out.println(idx);
        //     }
        //     cmx=Math.max(nums[i],nums[i]*cmx);
        //     cmn=Math.min(nums[i], nums[i]*cmn);
        //     max=Math.max(max,cmx);
        //     count+=i-idx+1;
        // }
        // return count;

        int l=0;
        int r=0;
        int count=0;
        int p=1;
        while(r<nums.length){
            p=p*nums[r];
            while(p>=k){ p/=nums[l];
                l++;
            }count+=r-l+1;
            r++;
        }return count;
    }
}
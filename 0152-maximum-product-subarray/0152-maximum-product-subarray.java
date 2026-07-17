class Solution {
    public int maxProduct(int[] nums) {
       int max=-11;
       int curMax=1;
       int curMin=1;
       for(int i=0; i<nums.length; i++){
        if(nums[i]<0){
            int temp=curMax;
            curMax=curMin;
            curMin=temp;
        }
        curMax=Math.max(nums[i],nums[i]*curMax);
        curMin=Math.min(nums[i],nums[i]*curMin);
        max=Math.max(max,curMax);
       }
       return max;
    }
}
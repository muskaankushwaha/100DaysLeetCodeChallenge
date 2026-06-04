class Solution {
    
   public static int fn(int idx, int[]dp, int[]nums){
        
        if(idx==0)return nums[0];
        if(idx<0)return 0;
        if(dp[idx]!=-1)return dp[idx];
        int pick=nums[idx]+fn(idx-2,dp,nums);
        int notpick=0+fn(idx-1,dp,nums);
        int max=Math.max(pick,notpick);
        dp[idx]=max;
        return dp[idx];
    }
    public int rob(int[] nums) {
    int[]dp=new int[nums.length];
    Arrays.fill(dp,-1);
       return fn(nums.length-1,dp,nums);
}
}
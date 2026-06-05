class Solution {
    int[][] dp;
    int fn(int i, boolean firstTaken, int[] nums) {
        int n = nums.length;
        if(i >= n)
            return 0;
        int flag = firstTaken ? 1 : 0;
        if(dp[i][flag] != -1)
            return dp[i][flag];
        int pick = 0;
        if(!(i == n - 1 && firstTaken)) {
            boolean newFlag = firstTaken;
            if(i == 0)
                newFlag = true;
            pick = nums[i] + fn(i + 2, newFlag, nums);
        }
        int notPick = fn(i + 1, firstTaken, nums);
        return dp[i][flag] = Math.max(pick, notPick);
    }
    public int rob(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        dp = new int[nums.length][2];
        for(int[] row : dp)
            Arrays.fill(row, -1);
        return fn(0, false, nums);
    }
}
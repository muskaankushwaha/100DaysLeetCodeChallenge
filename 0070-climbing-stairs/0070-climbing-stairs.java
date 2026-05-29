class Solution {
    public int climbStairs(int n) {
        //Memoization
        // int [] dp=new int [n+1];
        // Arrays.fill(dp,-1);
        // if(n<=1)return 1;
        // if(dp[n]!=-1)return dp[n];
        // dp[n]=climbStairs(n-1)+climbStairs(n-2);
        // return dp[n];

        // //Tabulization
        // int [] dp=new int [n+1];
        // Arrays.fill(dp,-1);
        // dp[0]=1;
        // dp[1]=1;
        // if(dp[n]!=-1)return dp[n];
        // for(int i=2; i<=n; i++){
        //     dp[i]=dp[i-1]+dp[i-2];
        // }
        // return dp[n];

        //Space optimization
        int prev2=1;
        int prev=1;
        for(int i=2; i<=n; i++){
            int curr=prev2+prev;
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
}
class Solution {
    public int largestAltitude(int[] gain) {
        int ans=0;
        int ps=0;
        for(int i=0; i<gain.length; i++){
            ps+=gain[i];
            gain[i]=ps;
            ans=Math.max(ans,gain[i]);
        }
        return ans;
    }
}
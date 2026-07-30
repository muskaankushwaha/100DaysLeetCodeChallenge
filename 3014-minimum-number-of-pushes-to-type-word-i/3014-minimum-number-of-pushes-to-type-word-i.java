class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int pushes=0;
        int level=1;
        while(n>0){
            int take=Math.min(8,n);
            pushes+=take*level;
            n-=take;
            level++;
        }
        return pushes;
    }
}
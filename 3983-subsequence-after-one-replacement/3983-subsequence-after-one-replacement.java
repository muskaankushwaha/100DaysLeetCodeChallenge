class Solution {
    public boolean canMakeSubsequence(String s, String t) {
        int n=s.length();
        int m=t.length();
        
        if(n>m)return false;
        int [] prefix =new int[n];
        int [] suffix=new int[n];
        Arrays.fill(prefix,m);
        Arrays.fill(suffix,-1);
       int j=0;
        for(int i=0;i<n;i++){
         while(j<m && t.charAt(j)!=s.charAt(i))j++;
         prefix[i]=j;
         if(j<m)j++;
         }
         j=m-1;
        for(int i=n-1;i>=0;i--){
         while(j>=0 && t.charAt(j)!=s.charAt(i))j--;
         suffix[i]=j;
         if(j>=0)j--;
                }
                
        for(int i=0; i<n; i++){
             int a=-1;
            int b=m;
            if(i>0){
                a=prefix[i-1];
            }if(i<n-1){
                b=suffix[i+1];
            }
            if(b-a>=2)return true;
        }return false;

    }
}
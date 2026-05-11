class Solution {
    public int divide(int dividend, int divisor) {
        long divid = Math.abs((long) dividend);
        long divis = Math.abs((long) divisor);
        boolean sign=true;//+ve
        if(dividend>=0 && divisor<0) sign=false;
        if(dividend<0 && divisor>=0) sign=false;
       long ans=0;
        while(divid>=divis){
           int count=0; 
           while(divid>= (divis<<(count+1))){
            count++;
           }
           ans+=(1L<<count);
           divid=divid-(divis*(1L<<count));
        }
        if(ans>Integer.MAX_VALUE && sign==true)return Integer.MAX_VALUE;
          if(ans>Integer.MAX_VALUE && sign==false)return Integer.MIN_VALUE;
        return sign? (int)ans: (int)(-1*ans);
}
}
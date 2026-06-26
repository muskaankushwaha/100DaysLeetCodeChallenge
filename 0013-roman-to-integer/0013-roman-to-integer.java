class Solution {
    public int getval(char ch){
        if(ch=='I')return 1;
        if(ch=='V')return 5;
        if(ch=='X')return 10;
        if(ch=='L')return 50;
        if(ch=='C')return 100;
        if(ch=='D')return 500;
        if(ch=='M')return 1000;
        return 0;
    }
    public int romanToInt(String s) {
        int ans=0;
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            int curr=getval(ch);
            
            if(i<s.length()-1 && curr<getval(s.charAt(i+1))){
                ans-=curr;
            }else{
                ans+=curr;
            }
        }
        return ans;
    }
}
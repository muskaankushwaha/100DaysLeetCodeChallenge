class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
       List<Integer> li=new ArrayList<>();
       int max=Integer.MIN_VALUE;
       int count=0;
       int one=0;
       for(int i=0; i<s.length(); i++){
        if(s.charAt(i)=='0'){
            count++;
        }else{
           if(count!=0)li.add(count);
            one++;
            count=0;
        }
       }if(count!=0)li.add(count);
       if(li.size()<2)return one;
       for(int i=1; i<li.size(); i++){
        int x=li.get(i-1)+li.get(i);
        max=Math.max(max,x);
       }
       return max+one;
    }
}
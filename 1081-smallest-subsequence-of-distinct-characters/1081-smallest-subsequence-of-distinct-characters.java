class Solution {
    public String smallestSubsequence(String s) {
        boolean [] taken=new boolean[26];
        int [] lidx=new int[26];
        Arrays.fill(taken,false);
        for(int i=0; i<s.length(); i++){
            int idx=s.charAt(i)-'a';
            lidx[idx]=i;
        }
        StringBuilder sb= new StringBuilder();
        sb.append(s.charAt(0));
        taken[s.charAt(0)-'a'] = true;
        for(int i=1; i<s.length(); i++){
            char ch=s.charAt(i);
            int idx=ch-'a';
            if(taken[idx])continue;
            while(sb.length() > 0 && sb.charAt(sb.length()-1)>ch && lidx[sb.charAt(sb.length()-1)-'a'] > i){
                char top = sb.charAt(sb.length() - 1);
                    taken[top-'a']=false;
                    sb.deleteCharAt(sb.length()-1);
                    
            }sb.append(ch);
                taken[idx]=true;
            
        }
        return sb.toString();
    }
}
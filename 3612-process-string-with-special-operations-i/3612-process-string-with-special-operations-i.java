class Solution {
    public String processStr(String s) {
        StringBuilder res= new StringBuilder();
       for(int i=0; i<s.length(); i++){
        char ch=s.charAt(i);
        if(ch-'a'>=0 && ch-'a'<26){
            res.append(ch);
        }if(ch=='*'){
            if(res.length()>0)
            res.deleteCharAt(res.length()-1);
        }
        if(ch=='#'){
            res.append(res);
        }
        if(ch=='%'){
            res.reverse();
        }
       } 
       return res.toString();
    }
}
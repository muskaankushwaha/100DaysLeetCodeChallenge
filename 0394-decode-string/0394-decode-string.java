class Solution {
    public String decodeString(String s) {
        StringBuilder ans= new StringBuilder();
      Stack<Integer> n=new Stack<>();
      Stack<Character> str=new Stack<>();
      int num=0;
      for(int i=0; i<s.length(); i++){
        char ch =s.charAt(i);
        if(Character.isDigit(ch)){
             num = num * 10 + (ch - '0');
        }else if(ch=='['){
             n.push(num);
             num=0;
             str.push(ch);
        }
        else if(ch!=']'){
            str.push(ch);
        }else{
             String temp = "";
            while(str.peek()!='['){
            temp=str.pop()+temp;
            }
            str.pop();
            int k=n.pop();
             StringBuilder repeated = new StringBuilder();
                while (k != 0) {
                    repeated.append(temp);
                    k--;
                }
                for(int j=0; j<repeated.length(); j++){
                    str.push(repeated.charAt(j));
                }
        }
      }
      while(!str.isEmpty()){
        ans.insert(0,str.pop());
      }
      return ans.toString();
    }
}
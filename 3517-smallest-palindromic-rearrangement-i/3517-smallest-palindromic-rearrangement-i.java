class Solution {
    public String smallestPalindrome(String s) {
        char mid = '\0';
        char[] half = new char[s.length()/2];
        if(s.length() % 2 != 0)
            mid=s.charAt(s.length()/2);
        for(int i=0; i<s.length()/2; i++){
            half[i]=s.charAt(i);
        }
        Arrays.sort(half);
        char [] ans = new char[s.length()];
        for(int i=0; i<half.length; i++){
            ans[i]=half[i];
        }
        if(s.length()%2!=0)
            ans[s.length()/2]=mid;

        for(int i=0; i<half.length; i++){
            ans[s.length()-1-i]=half[i];
        }
        return new String(ans);
    }
}
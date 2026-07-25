class Solution {
    public int maxProduct(int n) {
        int temp=n;
        int la=Integer.MIN_VALUE;
        int sl=Integer.MIN_VALUE;
        while(temp!=0){
            int digit=temp%10;
            if(digit>=la){
                sl=la;
                la=digit;
            }else if(digit>=sl)sl=digit;
            temp=temp/10;
        }
        return la*sl;
    }
}
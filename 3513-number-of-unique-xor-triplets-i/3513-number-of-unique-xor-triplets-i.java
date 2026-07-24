class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;
      if(n<=2)return n;
      else{
        String s=Integer.toBinaryString(n);
        int x=s.length();
        return (int)Math.pow(2,x);
      }
    }
}